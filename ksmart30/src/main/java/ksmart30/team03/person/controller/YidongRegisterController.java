package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class YidongRegisterController {
	@GetMapping("/person/personYidongRegisterView")
	public String registerList() {
		return "person/yidong/registerListView";
	}
	@GetMapping("/person/personYidongRegisterSearch")
	public String registerSearch() {
		return "person/yidong/registerSearchView";
	}
}
