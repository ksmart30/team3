package ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessGroupController {
	
	@GetMapping("/system/accessGroupMenuListView")
	public String accessGroupMenuListView() {
		return "system/accessGroupMenuView";
	}

	@GetMapping("/system/accessGroupDepListView")
	public String accessGroupDepListView() {
		return "system/accessGroupDepView";
	}
	
	@GetMapping("/system/accessGroupWorkListView")
	public String accessGroupWorkListView() {
		return "system/accessGroupWorkView";
	}
}
