package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
	
	@GetMapping("/baseInfo/schoolCode")
	public String schoolSearch() {
		return "baseInfo/school";
	}
}
