package ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.service.ResultNugaeService;

@Controller

public class ResultNugaeController {
	@Autowired private ResultNugaeService resultNugaeService;
	
	
	// M/H 계획/실적(프로젝트 누계) list가져오기
	@GetMapping("/manHour/manHourResultNugaeList")
	public @ResponseBody List<ResultList> manHourResultNugaeList() {
		System.out.println("manHourResultNugaeList 메서드 호출");
		List<ResultList> result = resultNugaeService.getResultNugaeList();
		return result;
	}
	
	// 화면 먼저 출력
	@GetMapping("/manHour/manHourResultNugaeView")
	public String manHourResultNugaeView() {
		System.out.println("manHourResultNugaeView 메서드 호출");
		return "mh/result/resultPlanNugaeView";
	}
}
