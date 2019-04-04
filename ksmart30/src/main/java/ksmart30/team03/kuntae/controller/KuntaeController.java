package ksmart30.team03.kuntae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KuntaeController {

	
	// 근태승인처리 (조회)
	@GetMapping("/kuntae/okView")
	public String okView() {
		return "/kuntae/okView";
	}
	
	// 근태현황(일, 월)
	@GetMapping("/kuntae/searchView")
	public String searchView() {
		return "/kuntae/searchView";
	}

}
