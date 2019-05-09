package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessOrderHyunhwangController {
	
	@GetMapping("/business/businessOrderHyunhwangView")
	public String businessOrderHyunhwangView() {
		return "business/businessOrderHyunhwangView";
	}
}
