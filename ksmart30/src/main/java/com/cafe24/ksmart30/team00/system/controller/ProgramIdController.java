package com.cafe24.ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramIdController {
	
	@GetMapping("/system/programIdView")
	public String programIdView() {
		return "system/programIdView";
	}
}
