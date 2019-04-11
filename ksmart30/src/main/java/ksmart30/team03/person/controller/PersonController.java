package ksmart30.team03.person.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;
import ksmart30.team03.person.service.PersonService;

@Controller
public class PersonController {
	@Autowired PersonService personService;
	
	//6.1.1인사기록카드 리스트 출력 컨트롤러
	@GetMapping("person/personInsaView")
	public String personInsaView() {
		return "person/insa/personListView";
	}	
	//6.1.1인사기록카드 입력(리스트) 컨트롤러
	@GetMapping("/person/personInsaWriteView")
	public String personInsaWriteView() {
		return "person/insa/personWriteView";
	}	
	//6.1.1 인사기록카드 수정 컨트롤러
	@GetMapping("/person/personInsaModifyView")
	public String personInsaModifyView() {
		return "person/insa/personModifyView";
	}
	//6.1.2직원검색폼 이동 컨트롤러
	@GetMapping("/person/personInsaEmployeeSearchView")
	public String getPersonInsaEmployeeView() {
		System.out.println("CONTROLLER : 직원검색 폼 이동");		
		return "person/insa/personSearchView";
	}
	//6.1.2직원검색 list 출력 컨트롤러

	@GetMapping("/person/personInsaEmployeeView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaEmployeeList(PersonRequest vo) {
		System.out.println("CONTROLLER : 직원list 출력");
		System.out.println("CONTROLLER : "+vo);		
		List<Map<String, Object>> data = personService.personInsaEmployeeSearchView(vo);		
		System.out.println("직원 검색 list : "+data);
		return data;
	}
	//6.1.2직원 디테일 컨트롤러
	@GetMapping("/person/personInsaEmployeeDetailView")
	public @ResponseBody List<Person> getPersonInsaEmployeeDetail(@RequestParam(value="EMP_NO")String EMP_NO) {
		System.out.println("CONTROLLER : 직원 디테일 출력");
		List<Person> data = personService.personInsaEmployeeDetailView(EMP_NO);
		System.out.println("직원 list 디테일 : "+data);
		return data;
	}
	
		
}

