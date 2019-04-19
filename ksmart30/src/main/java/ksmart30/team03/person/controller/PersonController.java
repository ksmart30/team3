package ksmart30.team03.person.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;
import ksmart30.team03.person.service.PersonService;

@Controller
public class PersonController {
	@Autowired PersonService personService;
	
	//6.1.1인사기록카드 리스트폼 이동 컨트롤러
	@GetMapping("/person/personInsaView")
	public String personInsaView() {
		return "person/insa/personListView";
	}
	//6.1.1인사기록카드 리스트 직원 출력 컨트롤러
	@GetMapping("/person/personInsaList")
	public @ResponseBody List<Map<String, Object>> personInsaList(PersonRequest vo) {
		System.out.println("CONTROLLER : 직원list 출력");
		System.out.println("CONTROLLER VO: "+vo);	
		List<Map<String, Object>> data = personService.personListView(vo);			
		System.out.println("직원 검색 list : "+data);
		return data;
	}	

	//6.1.1인사기록카드 입력  컨트롤러
	@PostMapping("/person/personInsaWriteView")
	public String personInsaWriteView(Person person) {
		personService.addPersonInsa(person);
		System.out.println("CONTROLLER VO: "+person);
		return "person/insa/personListView";
	}
	//6.1.1인사기록카드 입력폼으로 이동하는 컨트롤러
	@GetMapping("/person/personInsaWriteView")
	public String personInsaWriteView(Model model) {
		//부서코드별 부서명 select option
		List<Map<String, Object>> data = personService.deptCdListView();
		//구분별 이름 select option
		List<Map<String, Object>> data2 = personService.gbCdListView();
		model.addAttribute("deptResult",data);
		model.addAttribute("gbResult",data2);
		return "person/insa/personWriteView";
	}
	//6.1.1 인사기록카드 수정 컨트롤러
	@GetMapping("/person/personInsaModifyView")
	public String personInsaModifyView(Model model, @RequestParam(value="EMP_NO") String EMP_NO) {
		System.out.println("CONTROLLER : 직원수정  , 사원번호 : "+ EMP_NO);
		Person data = personService.personInsaEmployeeModifyView(EMP_NO);
		model.addAttribute("EMP_NO", EMP_NO);
		model.addAttribute("result", data);
		//부서코드별 부서명 select option
		List<Map<String, Object>> data2 = personService.deptCdListView();		
		model.addAttribute("deptResult",data2);
		//구분별 이름 select option
		List<Map<String, Object>> data3 = personService.gbCdListView();	
		model.addAttribute("gbResult",data3);
		System.out.println("직원수정정보 : "+data);
		return "person/insa/personModifyView";
	}
	//6.1.1 인사기록카드 수정화면에서 가족사항 구분 select option
	@GetMapping("/person/personRelationView")
	public @ResponseBody List<Person> personRelationView(){		
		List<Person> data = personService.gbCdRelationListView();
		System.out.println("가족사항 추가 select option"+data);
		return data;	
	}	
	//6.1.2직원검색폼 이동 컨트롤러
	@GetMapping("/person/personInsaEmployeeSearchView")
	public String getPersonInsaEmployeeView(Model model) {
		System.out.println("CONTROLLER : 직원검색 폼 이동");	
		//부서코드별 부서명 select option
		List<Map<String, Object>> data2 = personService.deptCdListView();		
		model.addAttribute("deptResult",data2);
		//구분별 이름 select option
		List<Map<String, Object>> data3 = personService.gbCdListView();	
		model.addAttribute("gbResult",data3);
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
		System.out.println("CONTROLLER : 직원 디테일 출력 / emp_no : "+EMP_NO);
		List<Person> data = personService.personInsaEmployeeDetailView(EMP_NO);
		System.out.println("직원 list 디테일 : "+data);
		return data;
	}
	//6.1.1직원 인사기록카드 추가사항 입력(가족사항)
	@PostMapping("/person/personInsaFamiltModifyView")
	public String personInsaFamilyModifyProcess(Person vo) {
		System.out.println("CONTROLLER : 인사기록카드 가족사항 입력 : "+vo);
		personService.modifyPersonInsaFamily(vo);
		return "person/insa/personListView";
		
	}
		
}

