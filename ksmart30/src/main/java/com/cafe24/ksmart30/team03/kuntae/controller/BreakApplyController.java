package com.cafe24.ksmart30.team03.kuntae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BreakApplyController {

	// 휴가 신청 (list)
	@GetMapping("/kuntae/breakApply")
	public String breakApplyList() {
		return "kuntae/breakapply_list";
	}
	
	// 휴가 신청 입력 처리
	@PostMapping("/kuntae/breakApply/in")
	public String breakApplyInsertAction() {
		return "";
	}
	
	// 휴가 신청 버튼 누를 시 Form
	@GetMapping("/kuntae/breakApply/in")
	public String breakApplyInsertForm() {
		return "kuntae/breakapply_in";
	}
}
