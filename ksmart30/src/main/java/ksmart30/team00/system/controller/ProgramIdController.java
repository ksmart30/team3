package ksmart30.team00.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramIdController {
	
	@GetMapping("/system/programIdSearchView")
	public String programIdSearchView() {
		return "system/programIdView";
	}
}
