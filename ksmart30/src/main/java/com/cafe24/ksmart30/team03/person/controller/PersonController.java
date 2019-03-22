package com.cafe24.ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
	
	//5.1인사기록카드 입력(리스트) 컨트롤러
	@GetMapping("/person/insa/personnelRecord")
	public String personInsertForm() {
		return "person/insa/person_in";
	}	
	//5.1.2직원검색폼 이동 컨트롤러
	@GetMapping("/person/insa/employeeSearch")
	public String personSearchForm() {
		return "person/insa/person_search";
	}
}
