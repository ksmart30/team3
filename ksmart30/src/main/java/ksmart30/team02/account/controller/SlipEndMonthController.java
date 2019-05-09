package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipEndMonthController {

		//전표마감(월)
		@GetMapping("/acc/slipEndMonthView")
		public String slipEndMonthView() {
			System.out.println("전표마감 (월) slipEndMonthIn SlipEndDayController.java");
			return "/account/slipendmonth_in";
		}
	}


