package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserIdController {
	
	@GetMapping("/system/userId")
	public String userIdSearch() {
		return "system/userId";
	}
}
