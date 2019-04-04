package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MajorController {
	
	@GetMapping("/baseInfo/majorCode")
	public String majorSearch() {
		return "baseInfo/major";
	}
}
