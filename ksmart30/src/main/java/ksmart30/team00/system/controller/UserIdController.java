package ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserIdController {
	
	@GetMapping("/system/userIdView")
	public String userIdSearch() {
		return "system/userId";
	}
}
