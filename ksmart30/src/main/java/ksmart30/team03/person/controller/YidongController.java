package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YidongController {
	@GetMapping("/person/yidong/list")
	public String yidongList() {
		return "person/yidong/yidong_list";
	}
	@GetMapping("/person/yidong/insertForm")
	public String yidongInsertForm() {
		return "person/yidong/yidong_in";
	}
	@GetMapping("/person/yidong/updateForm")
	public String yidongUpdateForm() {
		return "person/yidong/yidong_up";
	}
}
