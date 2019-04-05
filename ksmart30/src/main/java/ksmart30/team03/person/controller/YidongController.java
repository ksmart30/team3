package ksmart30.team03.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.service.YidongService;

@Controller
public class YidongController {
	@Autowired YidongService yidongService;

	@GetMapping("/person/personYidongListView")
	public String yidongList(Model model) {
		System.out.println("yidongList 메서드 호출 컨트롤러 ");
		List<Yidong> result = yidongService.getYidongList();
		model.addAttribute("yidongList", result);
		return "person/yidong/yidongListView";
	}
	@GetMapping("/person/yidong/insertForm")
	public String yidongInsertForm() {
		return "person/yidong/yidongWriteView";
	}
	@GetMapping("/person/yidong/updateForm")
	public String yidongUpdateForm() {
		return "person/yidong/yidongModifyView";
	}
}
