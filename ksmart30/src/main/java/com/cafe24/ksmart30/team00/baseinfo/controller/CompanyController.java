package com.cafe24.ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

	// 본사정보 조회(입력폼 형태)
	@GetMapping("/baseInfo/company")
	public String companyList() {
		return "baseInfo/company";
	}

	// 본사정보 수정 처리
	@PostMapping("/baseInfo/company/up")
	public String companyModify() {
		return "baseInfo/company";
	}
}
