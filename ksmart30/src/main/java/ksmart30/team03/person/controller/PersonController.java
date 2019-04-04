package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
	
	//5.1.1인사기록카드 리스트 출력 컨트롤러
	@GetMapping("/person/personInsaPersonnelRecordView")
	public String personInsaView() {
		return "person/insa/personListView";
	}	
	//5.1.2직원검색폼 이동 컨트롤러
	@GetMapping("/person/personInsaEmployeeSearchView")
	public String personSearchForm() {
		return "person/insa/personSearchView";
	}
	//5.1.1인사기록카드 입력(리스트) 컨트롤러
	@GetMapping("/person/personInsaWriteView")
	public String personInsaWriteView() {
		return "person/insa/personInView";
	}	
	
	//5.1.1 인사기록카드 수정 컨트롤러
	@GetMapping("/person/personInsaModifyView")
	public String personInsaModifyView() {
		return "person/insa/personUpView";
	}	
}
