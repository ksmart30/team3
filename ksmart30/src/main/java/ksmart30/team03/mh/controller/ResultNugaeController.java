package ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.service.ResultNugaeService;

@Controller

public class ResultNugaeController {
	@Autowired private ResultNugaeService resultNugaeService;
	// 클릭 시 프로젝트 상세 정보 가져오기
	@GetMapping("/manHour/manHourResultNugaeList2")
	public @ResponseBody List<ResultList> manHourResultNugaeList2(@RequestParam(value="pjt_cd")String pjt_cd ){
		System.out.println("manHourResultNugaeList2 메서드 호출 컨트롤러");
		List<ResultList> result = resultNugaeService.getResultNugaeList2(pjt_cd);
		return result;
	}
	
	// M/H 계획/실적(프로젝트 누계) list가져오기
	@GetMapping("/manHour/manHourResultNugaeList")
	public @ResponseBody List<ResultList> manHourResultNugaeList() {
		System.out.println("manHourResultNugaeList 메서드 호출");
		List<ResultList> result = resultNugaeService.getResultNugaeList();
		return result;
	}
	
	// 화면 먼저 출력
	@GetMapping("/manHour/manHourResultNugaeView")
	public String manHourResultNugaeView(Model model) {
		System.out.println("manHourResultNugaeView 메서드 호출");
		List<ResultList> result = resultNugaeService.getResultNugaeList();
		model.addAttribute("resultList", result);
		System.out.println("resultList에 값 들어가는지 확인 : "+result);
		return "mh/result/resultPlanNugaeView";
	}
}
