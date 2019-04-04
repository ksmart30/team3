package ksmart30.team03.mh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.service.ResultService;

@Controller
public class ResultController {
	@Autowired
	private ResultService resultService;
	//M/H 실적 입력 폼
	@GetMapping("/manHour/resultWriteView")
	public String resultWriteView() {
		return "mh/result/resultWriteView";
	}
	@PostMapping("/manHour/resultWriteView")
	public String resultWriteView(Result result) {
		resultService.addResult(result);
		return "redirect:/resultWriteView";
		
	}

}
