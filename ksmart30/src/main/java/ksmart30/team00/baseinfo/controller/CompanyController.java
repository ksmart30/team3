package ksmart30.team00.baseinfo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team00.baseinfo.domain.Company;
import ksmart30.team00.baseinfo.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired CompanyService companyService;
	@Autowired Company company;

	// 10.3.1.1 본사정보 조회(입력폼 형태)
	@GetMapping("/baseInfo/companyView")
	public String companyView(Model model) {
		System.out.println("(C) 10.3.1.1 본사정보 조회 companyView()");
		// 1. Service 호출 결과값 : (본사정보)
		company = companyService.getCompanyList();
		// 2. Model을 이용하여 본사정보를 화면에 보여주기 위해 세팅
		model.addAttribute("companyInfo", company);
		// 3. 본사정보 View로 이동
		return "baseInfo/companyView";
	}

	// 10.3.1.2 본사정보 수정처리
	@PostMapping("/baseInfo/companyModifyProcess")
	public String companyModifyProcess(Company company, HttpSession session) {
		System.out.println("(C) 10.3.1.2 본사정보 수정처리 companyModifyProcess()");
		// 1. Service 호출 (Mapper를 이용한 수정처리)
		companyService.modifyCompany(company, session);
		// 2. 본사정보 View로 이동
		return "redirect:/baseInfo/companyView";
	}
}
