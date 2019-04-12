package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessYesanSearchController {

	@GetMapping("/business/businessYesanSearch1View")
	public String businessYesanSearch1View() {
		return "/business/businessYesanSearch1View";
	}
	
	@GetMapping("/business/businessYesanSearch2View")
	public String businessYesanSearch2View() {
		return "/business/businessYesanSearch2View";
	}
}
