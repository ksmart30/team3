package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team00.baseinfo.domain.School;
import ksmart30.team00.baseinfo.service.SchoolService;

@Controller
public class SchoolController {
	@Autowired SchoolService schoolService;

	// 10.3.3.1 학교코드 조회
	@GetMapping("/baseInfo/schoolListView")
	public String schoolListView(Model model) {
		System.out.println("(C) 10.3.3.1 학교코드 조회 schoolListView()");
		// 1. Service 실행 (결과값 : schoolList(학교정보 리스트))
		List<School> schoolList = schoolService.getSchoolList();
		// 2. Model에 Setting
		model.addAttribute("schoolList", schoolList);
		// 3. "학교코드 입력" 화면으로 이동
		return "baseInfo/schoolView";
	}
	// 10.3.3.2 학교코드 검색
	@PostMapping("/baseInfo/schoolSearchProcess")
	public String schoolSearchProcess() {
		return null;
	}
}
