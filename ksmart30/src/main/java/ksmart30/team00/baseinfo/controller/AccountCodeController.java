/* 10.2.5.계정과목코드
 * @file      AccountCodeController.java
 * @brief    계정과목코드 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import ksmart30.team00.baseinfo.service.AccountCodeService;
import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Controller
public class AccountCodeController {
	@Autowired
	AccountCodeService accountcodeservice;
	// 10.2.5.계정과목코드
	/* @param  Model model 	    
	 * @brief  AccountCodeService내 AccountCodeList메서드 호출
	 * 	       "http://localhost/baseInfo/accountCodeView" 주소분기(get방식)
	 *          template폴더에 있는 accountcode_in forward
	 * 	                같은표현: @RequestMapping(value="/baseInfo/accountCodeView", method = RequestMethod.GET)
	 * @return  String(/baseinfo/accountcode/accountcode_in)
	 */
	@GetMapping("/baseInfo/accountCodeView")
	public String accountCodeView(Model model){		
		  System.out.println("01 accountCodeView 단위테스트");
		  List<AccountCodeDomain> list = accountcodeservice.getAccountCodeList(); 
		  List<ControlItemCodeDomain> controlItemCodeList = accountcodeservice.getControlItemCodeList();
		  System.out.println("list" + list);
		  System.out.println("controlItemCodeList" + controlItemCodeList);
		  model.addAttribute("list", list);
		  model.addAttribute("controlItemCodeList", controlItemCodeList);
		  return "/baseinfo/accountCodeView";
	}
	
	
	/*
	 * @GetMapping("/abc") public @ResponseBody List<AccountCodeDomain>
	 * accountCodeListProcess() throws JsonProcessingException {
	 * System.out.println("02 계정과목코드 리스트"); List<AccountCodeDomain> list =
	 * accountcodeservice.getAccountCodeList(); System.out.println(list +
	 * "list AccountCodeInsert AccountCodeController.java"); return list; }
	 */
	 
	
	// 10.2.5.계정과목코드(작업중)
		/* @brief  리스트 클릭시 상세내용 출력, AccountCodeService내 AccountCodeDetailList메서드 호출
		 * 	       "http://localhost/baseinfo/accountCodeContentProcess" 주소분기(get방식)		        
		 * @return  null
		 */
	/*
	 * @GetMapping("/baseinfo/accountCodeContentProcess") public @ResponseBody
	 * AccountCodeDomain AccountCodeDetailList() { System.out.println("01 단위테스트");
	 * 
	 * return null; }
	 */
}
