package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InsureController {

	@GetMapping("/baseInfo/fourInsureView")
	public String fourInsureView() {
		
		return "baseInfo/fourInsureView";
	}
}
