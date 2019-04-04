package ksmart30.team03.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class YidongRegisterController {
	@GetMapping("/person/yidong/register")
	public String registerList() {
		return "person/yidong/register_list";
	}
	@GetMapping("/person/yidong/registerSearch")
	public String registerSearch() {
		return "person/yidong/register_search";
	}
}
