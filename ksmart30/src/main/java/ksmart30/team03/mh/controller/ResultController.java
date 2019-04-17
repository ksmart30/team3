package ksmart30.team03.mh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.service.ResultService;

@Controller
public class ResultController {
	@Autowired
	private ResultService resultService;
	//M/H 실적 입력 폼   &  M/H 실적 리스트 
	@GetMapping("/manHour/resultWriteView")
	public String resultWriteView(Model model) {
		System.out.println("resultWriteView 폼 실행");
		
		List<Result> list = resultService.getListView();
		model.addAttribute("list", list);
		return "mh/result/resultWriteView";
		}
		
		//M/H 실적 입력 액션 
		@PostMapping("/manHour/resultWriteView")
		public String resultWriteView(Result result) {
			System.out.println("resultWriteView 액션");		
			resultService.addResult(result);
			return "redirect:/manHour/resultWriteView";						
		}
		
	  // M/H 실적 입력 내에 개인별 날짜검색
	  @GetMapping("/manHour/resultWriteDateSerachView") 
	  public @ResponseBody List<Map<String,Object>> resultWriteSearchView(Result result){
	  System.out.println("resultWriteView 날짜검색 요청"); 
	  List<Map<String,Object>> resultdate = resultService.getListSearchView(result); 
	  return resultdate;
	  
	  }
	 
}
