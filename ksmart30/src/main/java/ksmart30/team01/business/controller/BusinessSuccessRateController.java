package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessSuccessRateController {
	
	@GetMapping("/business/businessSuccessRateView")
	public String businessSuccessRateView() {
		return "business/businessSuccessRateView";
	}
}
