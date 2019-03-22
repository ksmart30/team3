package com.cafe24.ksmart30.team03.kuntae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KuntaeController {
	/*
	 * kuntaeApprovalList 근태승인처리 (조회) get
	 * kuntaeApprovalSearch 근태승인처리 (검색 처리) post
	 * kuntaeApprovalSearchAction 근태승인처리 (승인 처리) get
	 * kuntaeStateSearch 근태현황(일, 월) get
	 */
	
	// 근태승인처리 (조회)
	@GetMapping("/kuntae/approval")
	public String kuntaeApprovalList() {
		return "kuntae/kuntae_approval_list";
	}
	
	// 근태승인처리 (검색 처리)
	@PostMapping("/kuntae/approval")
	public String kuntaeApprovalSearch() {
		return "";
	}
	
	// 근태승인처리 (승인 처리)
	@GetMapping("/kuntae/approval/action")
	public String kuntaeApprovalSearchAction() {
		return "kuntae/kuntae_approval_search";
	}
	
	// 근태현황(일, 월)
	@GetMapping("/kuntae/search")
	public String kuntaeStateSearch() {
		return "kuntae/kuntae_search";
	}
}
