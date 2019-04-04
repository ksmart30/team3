package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.ksmart30.team03.mh.service.ResultService;
import com.cafe24.ksmart30.team03.mh.vo.Result;

@Controller
public class ResultController {
	@Autowired
	private ResultService resultService;
	//M/H 실적 입력 폼
	@GetMapping("/manHour/resultView")
	public String resultWriteView() {
		return "mh/result/resultWriteView";
	}
	@PostMapping("/manHour/resultView")
	public String resultWriteView(Result result) {
		resultService.addResult(result);
		return "redirect:/resultWriteView";
		
	}

}
