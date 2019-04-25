package ksmart30.team03.kuntae.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.kuntae.domain.BreakApply;
import ksmart30.team03.kuntae.service.BreakApplyService;

@Controller
public class BreakApplyController {
	@Autowired private BreakApplyService breakApplyService;
	// 휴가 신청 (조회) List로 보내기
	/*
	 * @GetMapping("/kuntae/breakApplyView") public String breakApplyList(Model
	 * model) { System.out.println("C : 휴가 신청 List"); List<BreakApply> data =
	 * breakApplyService.getBreakApplyList(); model.addAttribute("data", data);
	 * System.out.println("data=>"+data); return "/kuntae/breakApplyView"; }
	 */
	
	// 4.05 휴가신청 List Detail
	@GetMapping("/kuntae/breakApplyView2")
	public @ResponseBody List<Map<String, Object>> breakApplyList2(BreakApply vo){
		System.out.println("C : 휴가신청 List Ajax쓰겠음");
		System.out.println("C : vo =>"+ vo);
		List<Map<String, Object>> data = breakApplyService.getBreakApplyList2(vo);
		System.out.println("C : Ajax List data=>"+data);
		return data;
	}
	
	// 4.05 휴가신청 List
	@GetMapping("/kuntae/breakApplyView1")
	public @ResponseBody List<Map<String, Object>> breakApplyList(BreakApply vo){
		System.out.println("C : 휴가신청 List Ajax쓰겠음");
		System.out.println("C : vo =>"+ vo);
		List<Map<String, Object>> data = breakApplyService.getBreakApplyList(vo);
		System.out.println("C : Ajax List data=>"+data);
		return data;
	}
	
	// 4.05 휴가신청 List 처음 화면
	@GetMapping("/kuntae/breakApplyView")
	public String breakApplyList2() {
		System.out.println("Ajax화면 출력!!!");
		return "/kuntae/breakApplyView";
	}
	
	// 4.05.01휴가 신청 입력 폼
	@GetMapping("/kuntae/breakApplyWriteView")
	public String breakApplyWriteView() {
		return "/kuntae/breakApplyWriteView";
	}
	

}
