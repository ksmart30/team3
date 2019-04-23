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

import ksmart30.team03.kuntae.service.KuntaeService;
import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.service.PersonService;
import ksmart30.team03.person.service.YidongRegisterService;
import ksmart30.team03.person.service.YidongService;

@Controller
public class YidongController {
	@Autowired YidongService yidongService;
	@Autowired KuntaeService kuntaeService;
	@Autowired PersonService personService;
	@Autowired YidongRegisterService yidongRegisterService;
	//화면 출력, 직원 list 출력
	@GetMapping("/person/personYidongListView")
	public String personYidongListView(Model model) {
		System.out.println("yidongList 메서드 호출 컨트롤러 ");
		List<Map<String,Object>> data = yidongService.appGb();
		List<Map<String,Object>> data2 = kuntaeService.deptCd();
		List<Yidong> result = yidongService.getYidongList();
		model.addAttribute("yidongList", result);
		model.addAttribute("appGb", data);
		model.addAttribute("deptCd", data2);
		
		//구분별 이름 select option
		List<Map<String, Object>> data3 = personService.gbCdListView();	
		model.addAttribute("gbResult",data3);
		
		return "person/yidong/yidongListView";
	}
	
	//인사이동 등록
	@PostMapping("/person/personYidongListView")
	public String personYidongListView(Yidong yidong) {
		yidongService.addYidongList(yidong);
		System.out.println("vo의 입력값 (Controller)"+yidong);
		return "person/yidong/yidongListView";
	}
	//직원 클릭 시 정보를 insert form에 넘긴다
	@GetMapping("/person/personYidongListWriteView")
	public @ResponseBody List<Yidong> personYidongListWriteView(Model model,@RequestParam(value = "emp_no") String emp_no) {
		List<Yidong> result = yidongService.getYidongList2(emp_no);
		List<Yidong> result2 = yidongRegisterService.getYidongRegister();
		model.addAttribute("registerList2", result2);
		System.out.println("발령 전 정보 리스트 : "+result);
		return result;
	}
	//직원 클릭 시 발령정보를 list에 넘긴다
	@GetMapping("/person/personYidongListWriteView2")
	public @ResponseBody List<Yidong> personYidongListWriteView2(@RequestParam(value = "emp_no") String emp_no) {
		List<Yidong> result = yidongService.getYidongList3(emp_no);
		System.out.println("발령 전 정보 리스트 : "+result);
		return result;
	}
	
	//직원 검색, 검색 list 출력
	
	@GetMapping("/person/personYidongListSearch")
	public String personYidongListSearch(Model model,@RequestParam(value="KOR_NM")String KOR_NM) {
		System.out.println("personYidongListSearch 메서드 호출 컨트롤러 ");
		List<Yidong> result2 = yidongService.searchYidongList(KOR_NM);
		List<Map<String,Object>> data = yidongService.appGb();
		List<Map<String,Object>> data2 = kuntaeService.deptCd();
		List<Map<String, Object>> data3 = personService.gbCdListView();	

		System.out.println("직원 검색 리스트 : "+result2);
		model.addAttribute("yidongList", result2);
		model.addAttribute("appGb", data);
		model.addAttribute("deptCd", data2);
		model.addAttribute("gbResult",data3);
		
		return "person/yidong/yidongListView";
		
	}
	
	
	@GetMapping("/person/yidong/updateForm")
	public String yidongUpdateForm() {
		return "person/yidong/yidongModifyView";
	}
}
