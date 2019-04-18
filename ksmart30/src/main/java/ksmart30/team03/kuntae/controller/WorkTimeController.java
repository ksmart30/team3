package ksmart30.team03.kuntae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ksmart30.team03.kuntae.domain.WorkTimeSingleList;
import ksmart30.team03.kuntae.service.WorkTimeService;

@Controller
public class WorkTimeController {
	@Autowired private WorkTimeService workTimeService;
	
	
	// 출 퇴근 기록부(Total) 당일 출 퇴근 명단 출력
	@GetMapping("/kuntae/recordTotalView")
	public String recordTotalView(Model model) {
		System.out.println("C : Total 기록부 화면 먼저 호출");
		List<WorkTimeSingleList> data = workTimeService.getRecordTotalList();
		model.addAttribute("data", data);
		return "/kuntae/recordTotalView";
	}
	
	// 출, 퇴근 기록부(Total) 사원번호 검색
 	@GetMapping("/kuntae/recordTotal")
	public @ResponseBody List<WorkTimeSingleList> recordTotalNoSearch(@RequestParam(value = "EMP_NO") String EMP_NO){
		System.out.println("C : Total 사원번호 검색");
		List<WorkTimeSingleList> data = workTimeService.getRecordTotalNoSearch(EMP_NO);
		System.out.println("C : Total EMP_NO data 정보  =>" +data);
		return data;
	}
 	
 	// 출,퇴근기록부(Total) 전체 검색
 	@GetMapping("/kuntae/recordTotalSearch")
 	public @ResponseBody List<WorkTimeSingleList> recordTotalSearch(@RequestParam(value="WORK_DT") String WORK_DT, @RequestParam(value="END_DT")String END_DT, @RequestParam(value="EMP_NO")String EMP_NO){
 		System.out.println("C : Total 전체 검색");
 		List<WorkTimeSingleList> data = workTimeService.getRecordTotalSearch(WORK_DT, END_DT, EMP_NO);
 		System.out.println("C : Total data 정보=>"+data);
 		return data;
 	}
	
	/*
	 * // 출, 퇴근 기록부 (개인별)
	 * 
	 * @GetMapping("/kuntae/recordSingleView") 
	 * public List<WorkTimeSingleList> recordSingleView() { 
	 * System.out.println("C : 출, 퇴근 기록부 (개인별)");
	 * List<WorkTimeSingleList> result = workTimeService.getRecordSingleList();
	 * return result; }
	 */
	
	// 출, 퇴근 기록부 (개인별)
	/*
	 * @GetMapping("/kuntae/recordSingleView") 
	 * public String recordSingleView(Model model) { 
	 * System.out.println("C : 출, 퇴근 기록부 (개인별)"); 
	 * List<WorkTimeSingleList> data = workTimeService.getRecordSingleList();
	 * model.addAttribute("singleList", data); System.out.println("C 개인별 data :"+data); 
	 * return "/kuntae/recordSingleView"; }
	 */
	
	// 출, 퇴근 기록부 (개인별) 이름 검색
	@GetMapping("/kuntae/recordSingleName")
	public @ResponseBody List<WorkTimeSingleList> recordingSingleName(@RequestParam(value = "KOR_NM") String KOR_NM){
		System.out.println("C : 이름 검색 ");
		System.out.println("C : KOR_NM =>"+ KOR_NM);
		List<WorkTimeSingleList> data = workTimeService.getRecordSignleName(KOR_NM);
		System.out.println("C : KOR_NM data 정보=>"+ data);
		return data;
	}
	
	// 출, 퇴근 기록부 (개인별) 사원번호 검색
	@GetMapping("/kuntae/recordSingle")
	public @ResponseBody List<WorkTimeSingleList> recordSingleList(@RequestParam(value = "EMP_NO") String EMP_NO){
		System.out.println("C : 사원번호 검색 ");
		System.out.println("C : EMP_NO 요청 =>" + EMP_NO);
		List<WorkTimeSingleList> data = workTimeService.getRecordSingle(EMP_NO);
		System.out.println("C : EMP_NO data 정보  =>" +data);
		return data;
	}
	
	// 출, 퇴근 기록부 (개인별) 날짜 검색
	@GetMapping("/kuntae/recordDateSearchProcess")
	public @ResponseBody List<WorkTimeSingleList> recordTotalDateSearchProcess( @RequestParam(value = "WORK_DT") String WORK_DT, @RequestParam(value="END_DT")String END_DT){
		System.out.println("C : 날짜 검색 ");
		System.out.println("C : WORK_DT 요청 =>" + WORK_DT+" END_DT 요청 =>" +END_DT);
		List<WorkTimeSingleList> data2 = workTimeService.getRecordSingleDateSearch(WORK_DT, END_DT);			
		System.out.println("dayData =>" + data2);
		return data2;
	}
	 
	// 화면 호출
	@GetMapping("/kuntae/recordSingleView")
	public String recordSingleView() {
		System.out.println("C : recordSingleView 화면먼저호출^^");
		return "/kuntae/recordSingleView";
	}
	
	
	// 출, 퇴근 정정 신청 
	@GetMapping("/kuntae/workTimeView")
	public String workTimeView(Model model) {
		System.out.println("C : workTimeView 화면먼저호출");
		List<WorkTimeSingleList> data = workTimeService.getWorkTimeView();
		model.addAttribute("data", data);
		return "/kuntae/workTimeView";
	}
	
	// 출퇴근 정정 신청 List 이름 검색
	@GetMapping("/kuntae/workTimeNameSearch")
	public @ResponseBody List<WorkTimeSingleList> workTimeNameSearchView(@RequestParam(value="KOR_NM")String KOR_NM){
		System.out.println("C : workTimeView List 검색");
		List<WorkTimeSingleList> data = workTimeService.getWorkTimeNameSearchView(KOR_NM);
		System.out.println("C : 이름 검색 data =>"+ data);
		return data;
	}

	
}
