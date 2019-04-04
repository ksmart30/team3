package com.cafe24.ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessGroupController {
	
	@GetMapping("/system/accessGroupMenuListView")
	public String accessGroupMenuListView() {
		return "system/menu";
	}

	@GetMapping("/system/accessDepView")
	public String accessDepSearch() {
		return "system/accessDep";
	}
	
	@GetMapping("/system/accessWorkView")
	public String accessWorkSearch() {
		return "system/accessWork";
	}
}
