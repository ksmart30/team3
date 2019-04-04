package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YidongController {
	@GetMapping("/person/personYidongListView")
	public String yidongList() {
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
