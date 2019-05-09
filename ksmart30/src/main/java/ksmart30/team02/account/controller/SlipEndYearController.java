package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipEndYearController {
	
	//전표마감(년)
	@GetMapping("/acc/slipEndYearView")
	public String slipEndYearView(){
		System.out.println("전표마감(년) slipEndYearIn SlipEndYearController.java");
		return "/account/slipendyear_in";
	}
}
