package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAuthorityController {
	
	@GetMapping("/system/user/authority")
	public String index() {
		return "system/user/user_authority_search";
	}
}
