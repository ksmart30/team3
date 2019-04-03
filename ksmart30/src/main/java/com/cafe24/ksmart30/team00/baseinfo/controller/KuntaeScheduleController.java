package com.cafe24.ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KuntaeScheduleController {
	
	@GetMapping("/baseInfo/kuntae")
	public String KuntaeScheduleList() {
		return "baseInfo/kuntae";
	}
}