package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
	
	@GetMapping("/baseInfo/departmentListView")
	public String departmentListView() {
		return "baseInfo/departmentView";
	}
}
