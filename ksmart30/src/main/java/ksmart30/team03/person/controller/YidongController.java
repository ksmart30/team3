package ksmart30.team03.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.service.YidongService;

@Controller
public class YidongController {
	@Autowired YidongService yidongService;

	
	//화면 출력, 직원 list 출력
	@GetMapping("/person/personYidongListView")
	public String personYidongListView(Model model) {
		System.out.println("yidongList 메서드 호출 컨트롤러 ");
		List<Yidong> result = yidongService.getYidongList();
		model.addAttribute("yidongList", result);
		return "person/yidong/yidongListView";
	}
	//직원 클릭 시 정보를 insert form에 넘긴다
	@GetMapping("/person/personYidongListWriteView")
	public @ResponseBody List<Yidong> personYidongListWriteView(@RequestParam(value = "emp_no") String emp_no) {
		List<Yidong> result = yidongService.getYidongList2(emp_no);
		System.out.println("발령 전 정보 리스트 : "+result);
		return result;
	}
	
	//
	@GetMapping("/person/yidong/updateForm")
	public String yidongUpdateForm() {
		return "person/yidong/yidongModifyView";
	}
}
