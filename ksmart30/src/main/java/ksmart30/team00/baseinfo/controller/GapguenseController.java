package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.domain.Gapguense;
import ksmart30.team00.baseinfo.service.GapguenseService;

@Controller
public class GapguenseController {
	@Autowired GapguenseService gapguenseService;

	// 10.2.10.1 갑근세 세액 조견표 조회
	@GetMapping("/baseInfo/gapguenseView")
	public String gapguenseView(Model model) {
		System.out.println("(C) 10.2.10.1 갑근세 세액 조견표 조회 gapguenseView()");
		// 1. Service 실행 (갑근세 리스트 가져오기)
		List<Gapguense> gapguenseList = gapguenseService.getGapguenseList();
		// 2. Model에 Setting
		model.addAttribute("gapguenseList", gapguenseList);
		// 3. 갑근세세액 조견표 화면으로 이동
		return "baseInfo/gapguenseView";
	}
}
