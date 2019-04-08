package ksmart30.team03.kuntae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BreakApplyController {

	// 휴가 신청 (조회)
	@GetMapping("/kuntae/breakApplyView")
	public String breakApplyView() {
		return "/kuntae/breakApplyView";
	}
	
	// 휴가 신청 입력
	@GetMapping("/kuntae/breakApplyWriteView")
	public String breakApplyWriteView() {
		return "/kuntae/breakApplyWriteView";
	}
	

}
