package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InsapyeongaResultController {
	//인사평가 결과(result-list,result)
	@GetMapping("/person/insapyeonga/result")
	public String insapyeongaResultList() {
		return "person/insapyeonga/insapyeonga_result_list";
	}
}
