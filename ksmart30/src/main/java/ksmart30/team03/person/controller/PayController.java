package ksmart30.team03.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.PayGiveTake;
import ksmart30.team03.person.service.PayService;

@Controller
public class PayController {
	@Autowired PayService payService;

	// 6.4.1.1 급여 계산 및 등록화면
	@GetMapping("/person/personPayCalWriteView")
	public String personPayCalWriteView() {
		return "person/pay/personPayCalWriteView";
	}

	// 6.4.1.2 급여 계산 및 등록조회
	@GetMapping("/person/personPayCalListView")
	public @ResponseBody List<PayGiveTake> personPayCalListView(PayGiveTake payGiveTake) {
		System.out.println("(C) 6.4.1.2 급여 계산 및 등록조회 personPayCalListView()");
		// 1. Service호출 (결과값 : 사원 급여급 정보)
		List<PayGiveTake> giveTakeList = payService.getPersonPayCalList(payGiveTake);
		// 2. 리턴
		return giveTakeList;
	}

	//6.4._ 급여 대장 화면
	@GetMapping("/person/personPayRegisterView")
	public String personPayRegisterView() {
		return "person/pay/personPayRegisterView";
	}

}
