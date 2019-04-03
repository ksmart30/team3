package com.cafe24.ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.ResponseBody;
/*import org.springframework.web.bind.annotation.RestController;*/

import com.cafe24.ksmart30.team03.mh.service.ResultGraphService;
import com.cafe24.ksmart30.team03.mh.vo.ResultList;

@Controller
public class ResultGraphController {
	@Autowired private ResultGraphService resultGraphService;
	// M/H 계획/실적(그래프) e
		@GetMapping("/manHour/manHourPlanGraphView")
		public String manHourPlanGraphView() {
			System.out.println("CONTROLLER : M/H계획 실적 화면으로 이동");
			return "mh/result/resultPlanGraphView";
		}
		
		// M/H 계획/실적(그래프) 리스트 출력 컨트롤러
		@GetMapping("/manHour/manHourResultGraphList")
		public @ResponseBody List<ResultList> manHourPlanGraphList() {
			System.out.println("CONTROLLER : M/H계획 실적 그래프 리스트 출력");	
			List<ResultList> data = resultGraphService.resultSearch();
			System.out.println(data);
			return data;
		}
		
		
	
}
