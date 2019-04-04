package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KuntaeScheduleController {
	
	@GetMapping("/baseInfo/kuntaeScheduleListView")
	public String kuntaeScheduleListView() {
		return "baseInfo/kuntaeScheduleView";
	}
}