package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team00.baseinfo.domain.Major;
import ksmart30.team00.baseinfo.service.MajorService;

@Controller
public class MajorController {
	@Autowired MajorService majorService;

	// 10.3.4.1 전공코드 조회
	@GetMapping("/baseInfo/majorListView")
	public String majorListView(Model model) {
		System.out.println("(C) 10.3.4.1 전공코드 조회 majorListView()");
		// 1. Service 실행 (결과값 : majorList(전공정보 리스트))
		List<Major> majorList = majorService.getMajorList();
		// 2. Model에 Setting
		model.addAttribute("majorList", majorList);
		// 3. "전공코드 입력" 화면으로 이동
		return "baseInfo/majorView";
	}

	// 10.3.4.2 전공코드 검색
	@PostMapping("/baseInfo/majorSearchProcess")
	public String majorSearchProcess() {
		return null;
	}
}
