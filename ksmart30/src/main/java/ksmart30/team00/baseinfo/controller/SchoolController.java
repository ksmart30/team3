package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
	
	@GetMapping("/baseInfo/schoolListView")
	public String schoolListView() {
		return "baseInfo/schoolView";
	}
}
