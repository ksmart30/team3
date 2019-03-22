package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {
	//M/H 실적 입력 폼
	@GetMapping("/manHour/result")
	public String resultIn() {
		return "mh/result/result_in";
	}

}
