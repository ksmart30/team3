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
	@GetMapping("/kuntae/ok")
	public String kuntaeOkList() {
		return "kuntae/kuntae_ok_list";
	}
	
	// 근태승인처리 (검색 처리)
	@PostMapping("/kuntae/ok")
	public String kuntaeOkSearch() {
		return "";
	}
	
	// 근태승인처리 (승인 처리)
	@GetMapping("/kuntae/ok/action")
	public String kuntaeOkSearchAction() {
		return "kuntae/kuntae_ok_search";
	}
	
	// 근태현황(일, 월)
	@GetMapping("/kuntae/search")
	public String kuntaeSearch() {
		return "kuntae/kuntae_search";
	}
}
