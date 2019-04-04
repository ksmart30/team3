package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonnelStatsController {
	
	//5.1.3 인원현황통계 컨트롤러
	@GetMapping("/person/insa/personnelStats")
	public String personnelStatsList() {
		return "person/insa/personnel_stats_list";
	}
}