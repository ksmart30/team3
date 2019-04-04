package ksmart30.team03.kuntae.controller;

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
	
	// 일일 근무 현황 (조회)
	@GetMapping("/kuntae/daySearchView")
	public String daySearchView() {
		return "/kuntae/daySearchView";
	}
	
	// 출, 퇴근 기록부 (조회)
	@GetMapping("/kuntae/recordTotalView")
	public String recordTotalView() {
		return "/kuntae/recordTotalView";
	}
	
	// 출, 퇴근 기록부 (개인별)
	@GetMapping("/kuntae/recordSingleView")
	public String recordSingleView() {
		return "/kuntae/recordSingleView";
	}	
	
	// 출, 퇴근 정정 신청
	@GetMapping("/kuntae/workTimeView")
	public String workTimeView() {
		return "/kuntae/workTimeView";
	}
	
	// 출, 퇴근 정정 신청 처리
	@PostMapping("/kuntae/workTimeIn")
	public String workTimeInsertAction() {
		return "";
	}
	
	// 출, 퇴근 기록부 (검색 처리)
	@PostMapping("/kuntae/workTimeRecord")
	public String workTimeRecordSearch() {
		return "kuntae/worktime_record_search";
	}	
}
