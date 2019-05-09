/* 10.2.5.계정과목코드
 * @file      AccountCodeController.java
 * @brief    계정과목코드 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.baseinfo.service.AccountCodeService;
import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;
import ksmart30.team00.baseinfo.domain.TotalCode;

@Controller
public class AccountCodeController {
	@Autowired
	AccountCodeService accountCodeService;
	
	// 10.2.5.계정과목코드-view
	/* @param  Model model 	    
	 * @brief  AccountCodeService내 accountCodeList, controlItemCodeList, assetCodeList, costTypeList메서드 호출
	 * 	       "http://localhost/baseInfo/accountCodeView" 주소분기(get방식)
	 *          template폴더에 있는 accountcodeView.html forward
	 * 	                같은표현: @RequestMapping(value="/baseInfo/accountCodeView", method = RequestMethod.GET)
	 * @return  String(baseinfo/accountcodeView)
	 */
	@GetMapping("/baseInfo/accountCodeView")
	public String accountCodeView(Model model){		
		  Map<String, Object> map = new HashMap<String, Object>();
		  System.out.println("01 accountCodeView 단위테스트");
		  List<AccountCodeDomain> list = accountCodeService.accountCodeList(); 
		  AccountCodeDomain firstList = list.get(0);
		  List<ControlItemCodeDomain> controlItemCodeList = accountCodeService.controlItemCodeList();
		  System.out.println("Returnlist1 : " + list);
		  System.out.println("ReturncontrolItemCodeList : " + controlItemCodeList);
		  List<TotalCode> assetCodeList = accountCodeService.assetCodeList();
		  List<TotalCode> costTypeList = accountCodeService.costTypeList();
		  map.put("list1", list);
		  System.out.println("map : " + map.get("list1"));
		  map.put("firstList", firstList);
		  map.put("assetCodeList", assetCodeList);
		  map.put("costTypeList", costTypeList);
		  map.put("controlItemCodeList", controlItemCodeList);
		  model.addAttribute("map", map);
		  return "baseInfo/accountCodeView";
	}
	
	// 10.2.5.계정과목코드-조회버튼클릭시 조회
		/* @param  Model model 	    
		 * @brief  AccountCodeService내 accountCodeSearchProcess메서드 호출
		 * 	       "http://localhost/baseInfo/accountCodeSearchProcess" 주소분기(get방식)
		 *          template폴더에 있는 accountCodeView.html forward
		 * 	                같은표현: @RequestMapping(value="/baseInfo/accountCodeSearchProcess", method = RequestMethod.POST)
		 * @return  Map<String, Object> map
		 */
	@PostMapping("/baseInfo/accountCodeSearchProcess")
	public @ResponseBody Map<String, Object> accountCodeSearchProcess(AccountCodeDomain accountCodeDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("01 accountCodeSearch 단위테스트");
		System.out.println("accountCodeDomain : " + accountCodeDomain);
		List<AccountCodeDomain> list = accountCodeService.accountCodeSearchProcess(accountCodeDomain);
		AccountCodeDomain firstList = list.get(0);
		System.out.println("firstList : " + firstList);
		System.out.println("Returnlist2 : " + list);
		map.put("list2", list);
		map.put("firstList", firstList);
		return map;
	}
}
