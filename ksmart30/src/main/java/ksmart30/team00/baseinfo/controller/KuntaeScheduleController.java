package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;
import ksmart30.team00.baseinfo.service.KuntaeScheduleService;

@Controller
public class KuntaeScheduleController {
	@Autowired KuntaeScheduleService kuntaeScheduleService;

	// 10.3.5.1 근태월력표 리스트와 달력 조회
	@GetMapping("/baseInfo/kuntaeScheduleListView")
	public String kuntaeScheduleListView(Model model, KuntaeSchedule toDay) {
		System.out.println("(C) 10.3.5.1~2 근태월력표 리스트(왼쪽)와 달력(오른쪽) kuntaeScheduleListView()");
		// 1. Service 실행하여 근태월력표 리스트와 달력 정보 가져오기
		List<KuntaeSchedule> kuntaeList = kuntaeScheduleService.getKuntaeScheduleList(toDay);
		// 2. Model에 Setting하기(현재 근태월력표 리스트)
		model.addAttribute("kuntaeList", kuntaeList);
		// 3. "근태월력표 조회" 화면으로 이동
		return "baseInfo/kuntaeScheduleView";
	}

	// 10.3.5.2 근태월력표 검색
	@PostMapping("/baseInfo/kuntaeScheduleSearchProcess")
	public String kuntaeScheduleSearchProcess(Model model, KuntaeSchedule toDay) {
		// 1. Service 실행하여 근태월력표 검색 정보 가져오기
		List<KuntaeSchedule> kuntaeList = kuntaeScheduleService.getKuntaeScheduleCalendar(toDay);
		// 2. Model에 Setting하기(검색된 근태월력표 리스트)
		model.addAttribute("kuntaeList", kuntaeList);
		// 3. "근태월력표 조회" 화면으로 이동
		return "baseInfo/kuntaeScheduleView";
	}
}