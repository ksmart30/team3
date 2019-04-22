package ksmart30.team03.kuntae.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ksmart30.team03.kuntae.domain.DailyWorkRequest;
import ksmart30.team03.kuntae.service.DailyWorkService;
import ksmart30.team03.person.service.PersonService;

@Controller
public class DailyWorkController {
	@Autowired private DailyWorkService dailyWorkService;
	@Autowired private PersonService personService;

	//4.1일일근무현황 폼으로 이동하는 컨트롤러(부서코드를 model로 보내는)
	@GetMapping("/kuntae/daySearchView")
	public String dayList(Model model) {
		System.out.println("CONTROLLER : 일일근무현황 ");		
		List<Map<String, Object>> data = personService.deptCdListView();		
		model.addAttribute("deptResult",data);
		System.out.println("data2 : " + data);
		return "/kuntae/daySearchView";	
	}
	
	//4.1일일근무현황 검색 클릭시 list출력하는 컨트롤러
	@GetMapping("/kuntae/daySearch")
	public @ResponseBody List<Map<String, Object>> daySearch(DailyWorkRequest vo) {
		System.out.println("CONTROLLER : 일일근무현황  date 검색 컨트롤러 : "+vo);		
		List<Map<String, Object>> data = dailyWorkService.getDayList1(vo);	
		System.out.println("CONTROLLER : 일일근무현황 data"+data);
		return data;	
	}	
	
	@GetMapping("/kuntae/dayEmployeeDetailView")
	public @ResponseBody List<Map<String, Object>> dayEmployeeDetailView(DailyWorkRequest vo){
		System.out.println("CONTROLLER : 일일근무현황  date,detp_cd 컨트롤러 : "+vo);
		List<Map<String, Object>> data = dailyWorkService.getEmployeeDetailList(vo);
		System.out.println("CONTROLLER : 일일근무현황 부서원 상세 조회 : "+data);
		return data;	
	}
	
	
}
