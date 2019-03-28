package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessGroupController {
	
	@GetMapping("/system/menu")
	public String menuSearch() {
		return "system/menu";
	}

	@GetMapping("/system/accessDep")
	public String accessDepSearch() {
		return "system/accessDep";
	}
	
	@GetMapping("/system/accessWork")
	public String accessWorkSearch() {
		return "system/accessWork";
	}
}
