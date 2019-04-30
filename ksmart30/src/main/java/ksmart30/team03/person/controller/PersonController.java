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

import ksmart30.team03.person.domain.Education;
import ksmart30.team03.person.domain.Family;
import ksmart30.team03.person.domain.FamilyCare;
import ksmart30.team03.person.domain.License;
import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;
import ksmart30.team03.person.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	PersonService personService;

	// 6.1.1인사기록카드 리스트폼 이동 컨트롤러
	@GetMapping("/person/personInsaView")
	public String personInsaView() {
		return "person/insa/personListView";
	}

	// 6.1.1인사기록카드 리스트 직원 출력 컨트롤러
	@GetMapping("/person/personInsaList")
	public @ResponseBody List<Map<String, Object>> personInsaList(PersonRequest vo) {
		System.out.println("CONTROLLER : 직원list 출력");
		System.out.println("CONTROLLER VO: " + vo);
		List<Map<String, Object>> data = personService.personListView(vo);
		System.out.println("직원 검색 list : " + data);
		return data;
	}

	// 6.1.1인사기록카드 입력 컨트롤러
	@PostMapping("/person/personInsaWriteView")
	public String personInsaWriteView(Person person) {
		personService.addPersonInsa(person);
		System.out.println("CONTROLLER VO: " + person);
		return "person/insa/personListView";
	}

	// 6.1.1인사기록카드 입력폼으로 이동하는 컨트롤러
	@GetMapping("/person/personInsaWriteView")
	public String personInsaWriteView(Model model) {
		// 부서코드별 부서명 select option
		List<Map<String, Object>> data = personService.deptCdListView();
		// 구분별 이름 select option
		List<Map<String, Object>> data2 = personService.gbCdListView();
		model.addAttribute("deptResult", data);
		model.addAttribute("gbResult", data2);
		return "person/insa/personWriteView";
	}

	// 6.1.1 인사기록카드 수정 컨트롤러(기본, 추가사항 list 출력)
	@GetMapping("/person/personInsaModifyView")
	public String personInsaModifyView(Model model, @RequestParam(value = "EMP_NO") String EMP_NO) {
		System.out.println("CONTROLLER : 직원수정  , 사원번호 : " + EMP_NO);
		Person data = personService.personInsaEmployeeModifyView(EMP_NO);
		model.addAttribute("EMP_NO", EMP_NO);
		model.addAttribute("result", data);
		// 부서코드별 부서명 select option
		List<Map<String, Object>> data2 = personService.deptCdListView();
		model.addAttribute("deptResult", data2);
		// 구분별 이름 select option
		List<Map<String, Object>> data3 = personService.gbCdListView();
		model.addAttribute("gbResult", data3);
		System.out.println("직원수정정보 : " + data);
		//EMP_NO에 해당하는 가족사항 list를 model로 보냄
		List<Family> data4 = personService.getPersonInsaInfoFamily(EMP_NO); 
		model.addAttribute("familyList", data4);
		System.out.println("가족사항 LIST : " + data4);
		//EMP_NO에 해당하는 자격,면허 list를 model로 보냄
		List<License> data5 = personService.getPersonInsaInfoLicense(EMP_NO);
		System.out.println("자격,면허  LIST : " + data5);
		model.addAttribute("licenseList", data5);
		//EMP_NO에 해당하는 부양가족 list를 model로 보냄
		List<FamilyCare> data6 = personService.getPersonInsaInfoFamilyCare(EMP_NO);
		model.addAttribute("familyCare", data6);
		System.out.println("부양가족 List : "+data6);
		List<Education> data7 = personService.getPersonInsaInfoEducation(EMP_NO);
		model.addAttribute("educationList", data7);
		System.out.println("학력사항 List : "+data7);
		return "person/insa/personModifyView";
	}
	// 6.1.1 인사기록카드 수정화면에서 가족사항 구분 select option
	@GetMapping("/person/personRelationView")
	public @ResponseBody List<Person> personRelationView() {
		List<Person> data = personService.gbCdRelationListView();
		System.out.println("가족사항 추가 select option" + data);
		return data;
	}
	
	// 6.1.2직원검색폼 이동 컨트롤러
	@GetMapping("/person/personInsaEmployeeSearchView")
	public String getPersonInsaEmployeeView(Model model) {
		System.out.println("CONTROLLER : 직원검색 폼 이동");
		// 부서코드별 부서명 select option
		List<Map<String, Object>> data2 = personService.deptCdListView();
		model.addAttribute("deptResult", data2);
		// 구분별 이름 select option
		List<Map<String, Object>> data3 = personService.gbCdListView();
		model.addAttribute("gbResult", data3);
		return "person/insa/personSearchView";
	}
	// 6.1.2직원검색 list 출력 컨트롤러
	@GetMapping("/person/personInsaEmployeeView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaEmployeeList(PersonRequest vo) {
		System.out.println("CONTROLLER : 직원list 출력");
		System.out.println("CONTROLLER : " + vo);
		List<Map<String, Object>> data = personService.personInsaEmployeeSearchView(vo);
		System.out.println("직원 검색 list : " + data);
		return data;
	}
	// 6.1.2직원 디테일 컨트롤러
	@GetMapping("/person/personInsaEmployeeDetailView")
	public @ResponseBody List<Person> getPersonInsaEmployeeDetail(@RequestParam(value = "EMP_NO") String EMP_NO) {
		System.out.println("CONTROLLER : 직원 디테일 출력 / emp_no : " + EMP_NO);
		List<Person> data = personService.personInsaEmployeeDetailView(EMP_NO);
		System.out.println("직원 list 디테일 : " + data);
		return data;
	}		
	// 6.1.1직원 인사기록카드 추가사항 입력 액션(가족사항)
	@GetMapping("/person/personInsaFamilyModifyView")
	public @ResponseBody List<Family> personInsaFamilyProcess(Family family) {
		System.out.println("CONTROLLER : 인사기록카드 가족사항 입력 액션 : " + family);
		personService.modifyPersonInsaFamily(family);
		String EMP_NO = family.getEMP_NO();
		List<Family> data = personService.getPersonInsaInfoFamily(EMP_NO); 
		return data;
	}
	// 6.1.1직원 인사기록카드 추가사항 입력 액션(부양가족)
	@GetMapping("/person/personInsaFamilyCareModifyView")
	public @ResponseBody List<FamilyCare> personInsaFamilyCareModifyProcess(FamilyCare familyCare){
		System.out.println("CONTROLLER : 인사기록카드 부양가족 입력 액션 : " + familyCare);
		//부양가족 insert 메서드
		personService.modifyPersonInsaFamilyCare(familyCare);
		String EMP_NO = familyCare.getEMP_NO();
		List<FamilyCare> data = personService.getPersonInsaInfoFamilyCare(EMP_NO);		
		return data;
	}
	// 6.1.1직원 인사기록카드 추가사항 입력 액션(자격,면허사항)
	@GetMapping("/person/personInsaLicenseModifyView")
	public @ResponseBody List<License> personInsaLicenseModifyProcess(License license){
		System.out.println("CONTROLLER : 인사기록카드 면허,자격 입력 액션 : " + license);
		//부양가족 insert 메서드
		personService.modifyPersonInsaLicense(license);
		String EMP_NO = license.getEMP_NO();
		List<License> data = personService.getPersonInsaInfoLicense(EMP_NO);		
		return data;
	}		
	//6.1.1직원 인사기록카드 추가사항(자격,면허) 입력 select box
	@GetMapping("/person/personInsaLicenseView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaLicenseList() {
		List<Map<String, Object>> data = personService.licenseListView();
		System.out.println("CONTROLLER : 자격,면허 select box 출력" + data);
		return data;
	}
	//6.1.1직원 인사기록카드 추가사항(학력사항) 입력 select box
	@GetMapping("/person/personInsaEducationView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaEducationList(){
		List<Map<String, Object>> data = personService.educationListView();
		return data;		
	}
	//6.1.1직원 인사기록카드 추가사항(학력사항)  select list
	@PostMapping("/person/personInsaEducationSelectView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaEducationSelect(){
		List<Map<String, Object>> data = personService.schoodGbListView();
		System.out.println("CONTROLLER : 학력사항 select list 출력" + data);
		return data;		
	}
	//6.1.1 직원 인사기록카드 추가사항(전공) select list
	@PostMapping("/person/personInsaMajorView")
	public @ResponseBody List<Map<String, Object>> getPersonInsaMajorList(){
		List<Map<String, Object>> data = personService.majorGbListView();
		return data;		
	}

}
