package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultListController {
	//M/H 실적 조회
	@GetMapping("/manHour/result/list")
	public String resultList() {
		return "mh/result/result_search";
	}
	
}
