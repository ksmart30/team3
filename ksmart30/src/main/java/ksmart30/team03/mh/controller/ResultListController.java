package ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.service.ResultListService;

@Controller
public class ResultListController {
	@Autowired
	private ResultListService resultListService ;
	//M/H실적(월별) 개인 리스트
	@GetMapping("/manHour/resultListView")
	public String resultListView(Model model) {
		System.out.println("controller resultListView 요청");
		List<Result> ListView = resultListService.getresultListView();
		model.addAttribute("ListView", ListView);
		return "mh/result/resultListView";
	}
	
	// M/H실적(프로젝트별 누계) a
	@GetMapping("/manHour/result/nugae")
	public String resultNugae() {
		return "mh/result/result_nugae";
	}
	// M/H실적(수행유형별 - 전사그래프) b
	@GetMapping("/manHour/result/total")
	public String resultTotal() {
		return "mh/result/result_total";
	}
	// M/H실적(수행유형별 - 본부그래프) c
	@GetMapping("/manHour/result/hq")
	public String resultHq() {
		return "mh/result/result_hq";
	}
	// M/H실적(프로젝트 인건비 누계) d
	@GetMapping("/manHour/result/cost")
	public String resultCost() {
		return "mh/result/result_cost";
	}
	// M/H 계획/실적(그래프) e

	// M/H 계획/실적(프로젝트 누계) f

	// M/H 계획/실적(당해) g

	// 프로젝트 단계완료 미입력 List h
	@GetMapping("/manHour/project/notYet")
	public String resultProjectNotyet() {
		return "mh/result/result_project_notyet";
	}
	// 프로젝트 일정관리 i
	@GetMapping("/manHour/project/plan")
	public String resultProjectPlan() {
		return "mh/result/result_project_plan";
	}
			
}
