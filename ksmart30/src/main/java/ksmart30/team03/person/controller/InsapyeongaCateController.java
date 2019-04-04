package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InsapyeongaCateController {
	
	//인사평가항목(cate-list,cateInsert,cateUpdate)
	@GetMapping("/person/insapyeonga/cate")
	public String insapyeongaCateList() {
		return "person/insapyeonga/insapyeonga_cate_list";
	}
	@GetMapping("/person/insapyeonga/cateInsert")
	public String insapyeongaCateInsertForm() {
		return "person/insapyeonga/insapyeonga_cate_in";
	}
	@GetMapping("/person/insapyeonga/cateUpdate")
	public String insapyeongaCateUpdateForm() {
		return "person/insapyeonga/insapyeonga_cate_up";
	}
	
	



	
}
