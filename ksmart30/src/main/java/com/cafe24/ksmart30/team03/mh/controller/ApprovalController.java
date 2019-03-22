package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApprovalController {
	//M/H 실적 승인
	@GetMapping("/manHour/approval")
	public String resultApproval() {
		return "mh/result/result_approval_search";
	}

}
