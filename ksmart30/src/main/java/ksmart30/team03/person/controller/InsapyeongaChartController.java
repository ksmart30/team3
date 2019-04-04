package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InsapyeongaChartController {
	//인사평가표(chart-list,chartIn,chartUpdate)
		@GetMapping("/person/insapyeonga/chart")
		public String insapyeongaChartList() {
			return "person/insapyeonga/insapyeonga_chart_list";
		}
		@GetMapping("/person/insapyeonga/chartIn")
		public String insapyeongaChartInsertForm() {
			return "person/insapyeonga/insapyeonga_chart_in";
		}
		@GetMapping("/person/insapyeonga/chartUpdate")
		public String insapyeongaChartUpdateForm() {
			return "person/insapyeonga/insapyeonga_chart_up";
		}
		
}
