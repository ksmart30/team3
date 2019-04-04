package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InsapyeongaInsertController {
	//인사평가 입력(in)
	@GetMapping("/person/insapyeonga/in")
	public String insapyeongaInsertForm() {
		return "person/insapyeonga/insapyeonga_in";
	}
	
}
