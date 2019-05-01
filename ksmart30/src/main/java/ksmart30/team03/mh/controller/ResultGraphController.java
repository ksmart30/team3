package ksmart30.team03.mh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.mh.domain.ResultCost;

/*import org.springframework.web.bind.annotation.RestController;*/

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.service.ResultGraphService;

@Controller
public class ResultGraphController {
	@Autowired private ResultGraphService resultGraphService;

	// 5.2.1 M/H 계획/실적(그래프) 리스트 출력 컨트롤러
	@GetMapping("/manHour/manHourResultGraphView")
	public String manHourPlanGraphView(Model model) {
		System.out.println("CONTROLLER : M/H계획 실적 화면으로 이동");
		List<ResultList> data = resultGraphService.getResultGraphList();
		model.addAttribute("graphList", data);
		return "mh/result/resultPlanGraphView";
	}
	
	
	// 5.2.1 M/H 계획/실적(그래프) 리스트 출력 컨트롤러 (날짜검색추가)
	@GetMapping("/manHour/manHourResultGraphSearchView")
	public String manHourPlanGraphSearchView(Model model,@RequestParam(value="CONTRACT_PRI1") String CONTRACT_PRI1, @RequestParam(value="CONTRACT_PRI2") String CONTRACT_PRI2) {
		System.out.println("CONTROLLER : M/H계획 실적 검색화면으로 이동");
		System.out.println("시작날짜 : "+ CONTRACT_PRI1+" 마감날짜 : "+CONTRACT_PRI2);
		List<ResultList> data2 = resultGraphService.getResultGraphListDate(CONTRACT_PRI1, CONTRACT_PRI2);
		System.out.println("날짜별 검색 data"+data2);
		model.addAttribute("graphList", data2);
		return "mh/result/resultPlanGraphView";
	}

	/* // 5.2.1 M/H 계획(그래프)에 해당하는 값 출력 컨트롤러
	@GetMapping("/manHour/manHourResultGraph")
	public @ResponseBody List<ResultList> manHourPlanGraphList(@RequestParam(value = "pjt_cd") String pjt_cd) {
		System.out.println("cd : " + pjt_cd);
		List<ResultList> data = resultGraphService.getResultGraph(pjt_cd);
		System.out.println("CONTROLLER 그래프 list : "+data);
		return data;
	}
	
	// 5.2.1 M/H 실적(그래프)에 해당하는 값 출력 컨트롤러
	@GetMapping("/manHour/manHourResultGraph2")
	public @ResponseBody List<ResultList> manHourPlanGraphList2(@RequestParam(value = "pjt_cd") String pjt_cd) {
		System.out.println("cd : " + pjt_cd);
		List<ResultList> data = resultGraphService.getResultGraph2(pjt_cd);
		System.out.println("data2"+data);		
		return data;
	}
	
	 // 5.2.1 M/H 인건비 계획(그래프)에 해당하는 값 출력 컨트롤러 
	 
	 @GetMapping("/manHour/manHourResultGraphPlanNugae") 
	 public @ResponseBody List<ResultCost> manHourPlanGraphListPlanNugae(@RequestParam(value = "pjt_cd") String  pjt_cd) {
		 System.out.println("cd : " + pjt_cd); 
		 List<ResultCost> data = resultGraphService.getResultGraphPlanNugae(pjt_cd); 
		 System.out.println("data3"+data);
		 return data; 
	 }	
	// 5.2.1 M/H 인건비 실적(그래프)에 해당하는 값 출력 컨트롤러
	 
	 @GetMapping("/manHour/manHourResultGraphResultNugae") 
	 public @ResponseBody List<ResultCost> manHourPlanGraphListResultNugae(@RequestParam(value = "pjt_cd") String  pjt_cd) {
		 System.out.println("cd : " + pjt_cd); 
		 List<ResultCost> data = resultGraphService.getResultGraphResultNugae(pjt_cd); 
		 System.out.println("data4"+data);
		 return data; 
	 }	 */
	 
	// 5.2.1 M/H 인건비 실적,계획 및 일한시간 실적,계획 (그래프)에 해당하는 값 출력 컨트롤러	
	 @PostMapping("/manHour/manHourResultGraph")
		public @ResponseBody Map<String, Object> manHourResultGraph(String pjt_cd) {
		System.out.println("RestController projectManageHyunhwangMonthSangseProcess 메서드 실행");
		return resultGraphService.getResultGraph(pjt_cd);		
	}
	 
	 


}
