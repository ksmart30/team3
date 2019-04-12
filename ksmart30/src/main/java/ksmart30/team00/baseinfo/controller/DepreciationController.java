package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepreciationController {
	@GetMapping("/baseInfo/depreciationView")
	public String depreciationView() {
		return "baseInfo/depreciation_in";
	}
}
