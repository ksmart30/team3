package com.cafe24.ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.ksmart30.team03.mh.service.ResultNugaeService;
import com.cafe24.ksmart30.team03.mh.vo.ResultList;

@Controller

public class ResultNugaeController {
	@Autowired private ResultNugaeService resultNugaeService;
	// M/H 계획/실적(프로젝트 누계) list가져오기
	
	@GetMapping("/resultplanlist")
	public @ResponseBody List<ResultList> resultPlanNugae2() {
		System.out.println("getPjtcd 메서드 호출");
		List<ResultList> result = resultNugaeService.getPjtcd();
		return result;
	}
	
	// 화면 먼저 출력
	@GetMapping("/manHour/plan/nugae")
	public String resultPlanNugae() {
		System.out.println("resultPlanNugae 메서드 호출");
		return "mh/result/result_plan_nugae";
	}
}
