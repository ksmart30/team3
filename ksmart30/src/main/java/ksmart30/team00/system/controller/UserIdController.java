package ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserIdController {
	
	// 11.1.1 User-ID 화면
	@GetMapping("/system/userIdSearchView")
	public String userIdSearchView() {
		return "system/userIdView";
	}
}
