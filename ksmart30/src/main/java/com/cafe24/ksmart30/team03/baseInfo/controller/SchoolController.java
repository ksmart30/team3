package com.cafe24.ksmart30.team03.baseInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
	
	@GetMapping("/baseInfo/schoolCode")
	public String schoolSearch() {
		return "baseInfo/school";
	}
}
