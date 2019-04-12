package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessYesanInputController {
	@GetMapping("/business/businessYesanView")
	public String businessYesanView() {
		return "/business/businessYesanView";
	}
}
