package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipEndDayController {
	//전표마감(일)
	@GetMapping("/acc/slipEndDayView")
	public String slipEndDayView() {
		System.out.println("전표마감(일) slipEndDayIn SlipEndDayController.java");
		return "/account/slipendday_in";
	}
}