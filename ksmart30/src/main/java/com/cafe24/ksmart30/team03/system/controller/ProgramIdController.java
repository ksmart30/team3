package com.cafe24.ksmart30.team03.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramIdController {
	
	@GetMapping("/system/programId")
	public String programId() {
		return "system/programId";
	}
}
