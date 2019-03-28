package com.cafe24.ksmart30.team03.kuntae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkTimeController {
	/*
	 * WorkTimeController 
	 * workTimeInsertForm 출, 퇴근 정정 신청 
	 * workTimeInsertAction 출, 퇴근
	 * 정정 신청 처리 workTimeRecordList 출, 퇴근 기록부 (조회) 
	 * workTimeRecordSearch 출, 퇴근 기록부 (검색 처리)
	 */
	
	// 일일 근무 현황
	@GetMapping("/kuntae/daySearch")
	public String daySearch() {
		return "kuntae/day_search";
	}
	
	
	// 출, 퇴근 정정 신청
	@GetMapping("/kuntae/workTimeIn")
	public String breakApplyInsertForm() {
		return "kuntae/worktime_in";
	}
	
	// 출, 퇴근 정정 신청 처리
	@PostMapping("/kuntae/workTimeIn")
	public String workTimeInsertAction() {
		return "";
	}
	
	// 출, 퇴근 기록부 
	@GetMapping("/kuntae/recordTotal")
	public String workTimeRecordList() {
		return "kuntae/worktime_record_list";
	}
	
	// 출, 퇴근 기록부 (개인별)
	@GetMapping("/kuntae/recordSingle")
	public String workTimeRecordSingle() {
		return "kuntae/worktime_record_single";
	}
	
	// 출, 퇴근 기록부 (검색 처리)
	@PostMapping("/kuntae/workTimeRecord")
	public String workTimeRecordSearch() {
		return "kuntae/worktime_record_search";
	}
}
