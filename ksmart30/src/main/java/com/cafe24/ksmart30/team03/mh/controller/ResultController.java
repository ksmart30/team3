package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResultController {
	//M/H 실적 입력 폼
	@GetMapping("/manHour/resultView")
	public String resultWriteView() {
		return "mh/result/resultWriteView";
	}

}
