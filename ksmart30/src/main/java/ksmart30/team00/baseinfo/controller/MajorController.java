package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MajorController {
	
	@GetMapping("/baseInfo/majorListView")
	public String majorListView() {
		return "baseInfo/majorView";
	}
}
