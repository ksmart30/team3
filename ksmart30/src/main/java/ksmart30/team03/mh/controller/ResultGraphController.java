package ksmart30.team03.mh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.ResponseBody;

/*import org.springframework.web.bind.annotation.RestController;*/

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.service.ResultGraphService;

@Controller
public class ResultGraphController {
	@Autowired private ResultGraphService resultGraphService;
	// M/H 계획/실적(그래프) e
	/*
	 * @GetMapping("/manHour/manHourPlanGraphView") public String
	 * manHourPlanGraphView() { System.out.println("CONTROLLER : M/H계획 실적 화면으로 이동");
	 * return "mh/result/resultPlanGraphView"; }
	 */

	/*
	 * // M/H 계획/실적(그래프) 리스트 출력 컨트롤러
	 * 
	 * @GetMapping("/manHour/manHourResultGraphList") public List<ResultList>
	 * manHourPlanGraphList() {
	 * System.out.println("CONTROLLER : M/H계획 실적 그래프 리스트 출력"); List<ResultList> data
	 * = resultGraphService.resultSearch(); System.out.println(data);
	 * 
	 * return data; }
	 */
	// 5.2.1 M/H 계획/실적(그래프) 리스트 출력 컨트롤러
	@GetMapping("/manHour/manHourResultGraphView")
	public String manHourPlanGraphView(Model model) {
		System.out.println("CONTROLLER : M/H계획 실적 화면으로 이동");
		List<ResultList> data = resultGraphService.getResultGraphList();
		model.addAttribute("graphList", data);
		return "mh/result/resultPlanGraphView";
	}
	// 5.2.1 M/H 계획(그래프)에 해당하는 값 출력 컨트롤러
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
		
		/*	for(int i=0; i<data.size(); i++) {
			
				Map map =(HashMap)data.get(i);
				System.out.println(map+"map");
			
		}*/

		return data;
	}
	
	
	
}
