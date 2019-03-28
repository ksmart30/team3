package com.cafe24.ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {
	//급여 리스트 
	@GetMapping("/person/pay/register")
	public String pay() {
		return "person/pay/pay_month_list";
	}
	//급여 계산(입력)
	@GetMapping("/person/pay/cal")
	public String payInsertForm() {
		return "person/pay/pay_in";
	}
}
