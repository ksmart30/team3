package ksmart30.team02.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.service.SlipDetailService;

/*
 * @file    SlipDetailController.java
 * @brief   8.2 전표상세검색
 * @author  ksmart30 HSY
 */

@Controller
public class SlipDetailController {
	@Autowired SlipDetailService slipdetailservice;
	
	// 8.2 전표상세검색
	/* @brief    화면 출력
	 * 	   		"http://localhost/account/slipSearchView" 주소분기(get방식)
	 *           template폴더에 있는 boardList.html forward
	 * @return  String(view이름)
	 */
	@GetMapping("/acc/slipSearchView")
	public String slipSearchView() {
		return "account/slipSearchView";
	}
	
	// 8.2 전표상세검색 -modal 계정과목
	/* @param   @RequestParam(value="account") String account
	 * @brief   ajax 계정과목 리스트 조회
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * @return  List<Map<String,String>>
	 */
	@GetMapping("/accountSearchListView")
	public @ResponseBody List<Map<String,String>> accountSearchListView(@RequestParam(value="account") String account) throws JsonProcessingException{
		System.out.println("accountSearch 호출");
		return slipdetailservice.getAccountCode(account);
	}
	
	// 8.2 전표상세검색 -modal 부서
	/* @param   @RequestParam(value="dept") String dept
	 * @brief   ajax 부서 리스트 조회
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * @return  List<Map<String,String>>
	 */
	@GetMapping("/deptSearchListView")
	public @ResponseBody List<Map<String,String>> deptSearchListView(@RequestParam(value="dept") String dept) throws JsonProcessingException{
		System.out.println("deptSearch 호출");
		return slipdetailservice.getDeptCode(dept);
	}
	
	// 8.2 전표상세검색 -modal 부서
	/* @param   @RequestParam(value="dept") String dept
	 * @brief   ajax 거래처 리스트 조회
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * @return  List<Map<String,String>>
	 */
	@GetMapping("/custSearchListView")
	public @ResponseBody List<Map<String,String>> custSearchListView(@RequestParam(value="cust") String cust) throws JsonProcessingException{
		System.out.println("custSearch 호출");
		return slipdetailservice.getCustCode(cust);
	}
	
	// 8.2 전표상세검색 -조건 검색 조회
	/* @param   @RequestBody Map<String,Object> searchMap
	 * @brief   ajax 조건 검색  조회 리스트 
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * 			@RequestBody  POST방식으로 전달된 HTTP Request Body를 읽음.
	 * @return  List<Map<String, Object>>
	 */
	@PostMapping("/slipSearchList")
	public @ResponseBody List<Map<String, Object>> slipSearchList(@RequestBody Map<String,Object> searchMap) throws JsonProcessingException{
		System.out.println("slipSearchList 호출");
		System.out.println(searchMap);
		return slipdetailservice.getSlipList(searchMap);
	}
}
