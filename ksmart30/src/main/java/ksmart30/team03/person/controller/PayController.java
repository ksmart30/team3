package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {
	//급여 리스트 
	@GetMapping("/person/personPayRegisterView")
	public String personPayRegisterView() {
		return "person/pay/personPayRegisterView";
	}
	//급여 계산(입력)
	@GetMapping("/person/personPayCalWriteView")
	public String personPayCalWriteView() {
		return "person/pay/personPayCalWriteView";
	}
}
