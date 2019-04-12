/* 8.1.전표입력
 * @file      SlipController.java
 * @brief   전표입력 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.service.SlipService;
@Controller
public class SlipController {
@Autowired
SlipService slipService;
	// 8.1.전표입력
	/*@brief    slip_in.html 화면 출력
	* 	   "http://localhost/acc/slipView" 주소분기(get방식)
	*             template폴더에 있는 slip_in.html forward
	* 	   같은표현: @RequestMapping(value="/acc/slipView", method = RequestMethod.GET)
	* @return  String(/account/slip/slip_in)
	*/
	//전표입력폼, slip_in.html 화면 출력
	@GetMapping("/acc/slipView")
	public String slipView() {
		System.out.println("01 전표입력폼 단위테스트");
		return "/account/slipView";
	}
	// 8.1.전표입력
	/* @param  SlipDetailDomain slipDetailDomain
	 * @brief   조회버튼 클릭시 리스트 출력, SlipService객체 내 slipSearchProcess메서드 호출
	 * 	   		"http://localhost/acc/slipSearchProcess" 주소분기(post방식)
	 * 	   같은표현: @RequestMapping(value="/acc/slipSearchProcess", method = RequestMethod.POST)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/acc/slipSearchProcess")
	public @ResponseBody Map<String, Object>  slipSearchProcess(SlipDetailDomain slipDetailDomain) throws JsonProcessingException {
		System.out.println("01 slipSearchProcess 단위테스트");
		System.out.println("slipDomain : " + slipDetailDomain);		
		Map<String, Object> map =  slipService.slipSearchProcess(slipDetailDomain);
		return map;
	}
	// 8.1.전표입력
		/* @param  SlipDetailDomain slipDetailDomain 
		 * @brief   조회버튼 클릭시 리스트 출력, SlipService객체 내 slipSearchProcess메서드 호출
		 * 	   		"http://localhost/acc/controlItemList" 주소분기(post방식)
		 * 	   같은표현: @RequestMapping(value="/acc/slipSearchProcess", method = RequestMethod.POST)
		 * @return  Map<String, Object> map
		 */
	@PostMapping("/acc/controlItemSearchProcess")
	public @ResponseBody SlipDetailDomain controlItemSearchProcess(SlipDetailDomain slipDetailDomain) throws JsonProcessingException {
		System.out.println("01 controlItemList 단위테스트");
		System.out.println("slipDetailDomain : " + slipDetailDomain);
		SlipDetailDomain list = slipService.controlItemSearchProcess(slipDetailDomain);
		System.out.println("list : " + list);
		return list;
	}
}
