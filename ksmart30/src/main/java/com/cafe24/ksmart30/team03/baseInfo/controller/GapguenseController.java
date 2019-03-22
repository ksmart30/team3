package com.cafe24.ksmart30.team03.baseInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GapguenseController {
	
	@GetMapping("/baseInfo/gapguense")
	public String gapguenseSearch() {
		return "baseInfo/gapguense";
	}
}
