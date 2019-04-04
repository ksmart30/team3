package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

	// 본사정보 조회(입력폼 형태)
	@GetMapping("/baseInfo/companyView")
	public String companyView() {
		return "baseInfo/companyView";
	}

	// 본사정보 수정 처리
	@PostMapping("/baseInfo/companyModifyProcess")
	public String companyModifyProcess() {
		return "baseInfo/companyView";
	}
}
