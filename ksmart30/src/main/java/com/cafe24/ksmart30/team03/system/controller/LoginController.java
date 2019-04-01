package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// 로그인 화면
	@GetMapping("/login")
	public String login() {
		return "system/user/login";
	}

	// 
}
