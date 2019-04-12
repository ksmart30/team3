package ksmart30.team02.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.SlipAdmit;
import ksmart30.team02.account.service.SlipAdmitService;

@Controller
public class SlipAdminController {
	@Autowired
	SlipAdmitService slipAdmitService;
	//전표승인
	@GetMapping("/acc/slipAdmitView")
	public String slipAdmitView() {
		System.out.println("slipAdmitView SlipAdminController.java");
		return "/account/slipadmitView";
	}
	//전표헤더
	@GetMapping("/slipAdmitList")
	public @ResponseBody List<SlipAdmit> slipAdmitList(SlipAdmit slipAdmit){
		System.out.println("slipAdmitList SlipAdminController.java");
		System.out.println(slipAdmit+"<--전표헤더!! Controller");
		List<SlipAdmit> slipList = slipAdmitService.slipAdmitList(slipAdmit);
		System.out.println(slipList+"<--전표헤더리턴!! Controller");
		return slipList;
	}
	//전표상세
	@GetMapping("/slipAdmitList2")
	public @ResponseBody List<SlipAdmit> slipAdmitList2(SlipAdmit slipAdmit){
		System.out.println("slipAdmitList SlipAdminController.java");
		System.out.println(slipAdmit+"<--전표상세!!! Controller");
		List<SlipAdmit> slipList = slipAdmitService.slipAdmitList2(slipAdmit);
		System.out.println(slipList+"<--전표상세리턴!!! Controller");
		return slipList;
	}
	//계정과목
	@GetMapping("/accountSearchView")
	public @ResponseBody List<Map<String,String>> accountSearchView(@RequestParam(value="account") String account) throws JsonProcessingException{
		System.out.println("accountSearch호출");
		return slipAdmitService.getAccountCode(account);
	}
}
