package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessYesanOutputControlle {
	@GetMapping("/business/businessYesanOutputView")
	public String businessYesanOutputView() {
		return "/business/businessYesanOutputView";
	}
}
