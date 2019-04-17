package ksmart30.team03.kuntae.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.kuntae.domain.KuntaeSearch;
import ksmart30.team03.kuntae.service.KuntaeService;

@Controller
public class KuntaeController {
	@Autowired KuntaeService kuntaeService;
	
	// 근태승인처리 (조회)
	@GetMapping("/kuntae/okView")
	public String okView() {
		return "/kuntae/okView";
	}
	
	// 근태현황(일, 월) 화면 이동
	@GetMapping("/kuntae/searchView")
	public String searchView(Model model) {
		System.out.println("근태현황 화면 이동");
		List<Map<String,Object>> data2 = kuntaeService.deptCd();
		model.addAttribute("result",data2);
		return "/kuntae/searchView";
	}
	
	// 근태현황(월) list 검색 후 출력
	@GetMapping("/kuntae/searchView2")
	public @ResponseBody List<Map<String, Object>> searchView(KuntaeSearch vo){
		System.out.println("getSearchList메서드 호출(Controller)");
		System.out.println("Controller 입력값 : "+vo);
		List<Map<String,Object>> data = kuntaeService.getSearch(vo);
		
		System.out.println("근태현황(월)list"+data);
		return data;
	}
	
}
