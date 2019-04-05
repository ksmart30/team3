package ksmart30.team03.kuntae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.kuntae.domain.WorkTimeSingleList;
import ksmart30.team03.kuntae.service.WorkTimeService;

@Controller
public class WorkTimeController {
	@Autowired private WorkTimeService workTimeService;
	
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
	
	/*
	 * // 출, 퇴근 기록부 (개인별)
	 * 
	 * @GetMapping("/kuntae/recordSingleView") public List<WorkTimeSingleList>
	 * recordSingleView() { System.out.println("C : 출, 퇴근 기록부 (개인별)");
	 * List<WorkTimeSingleList> result = workTimeService.getRecordSingleList();
	 * return result; }
	 */
	
// 출, 퇴근 기록부 (개인별)
  @GetMapping("/kuntae/recordSingleView") 
  public String recordSingleView(Model model) { 
  System.out.println("C : 출, 퇴근 기록부 (개인별)"); List<WorkTimeSingleList>
  data = workTimeService.getRecordSingleList();
  model.addAttribute("singleList", data); 
  return "/kuntae/recordSingleView"; }
	 
	
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
