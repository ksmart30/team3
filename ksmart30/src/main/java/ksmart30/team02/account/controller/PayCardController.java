package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayCardController {
	@GetMapping("/acc/payCardView")
	public String payCardView() {
		return "account/paycardView";
	}
}
