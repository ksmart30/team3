package ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserIdController {
	
	// 11.1.1 User-ID 화면
	@GetMapping("/system/userIdSearchView")
	public String userIdSearchView() {
		System.out.println("(C) 11.1.1 User-ID 화면 userIdSearchView()");
		return "system/userIdView";
	}

	// 11.1.2 User-ID 등록처리
	@GetMapping("/system/userIdWriteProcess")
	public int UserIdWriteProcess() {
		System.out.println("(C) 11.1.2 User-ID 등록처리 userIdSearchView()");
		
		int result = 0;
		return result;
	}
}
