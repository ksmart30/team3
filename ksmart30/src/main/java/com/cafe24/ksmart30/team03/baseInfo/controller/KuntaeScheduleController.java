package com.cafe24.ksmart30.team03.baseInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KuntaeScheduleController {
	
	@GetMapping("/baseInfo/kuntae")
	public String KuntaeScheduleList() {
		return "baseInfo/kuntae";
	}
}