package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccessController {
	
	@GetMapping("/system/user/access")
	public String userAccessSearch() {
		return "system/user/user_access_search";
	}
}
