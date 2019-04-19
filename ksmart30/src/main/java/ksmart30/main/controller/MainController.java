package ksmart30.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	@GetMapping("/")
	public String index(HttpSession httpSession) {
		System.out.println("Controller index()호출 ");
		// 1. 세션값 확인 (로그인 정보)
		System.out.println("Session ID : " + httpSession.getAttribute("EMP_NO"));
		System.out.println("Session NM : " + httpSession.getAttribute("KOR_NM"));
		return "index";
	}

	@GetMapping("/errorView")
	public String errorView() {
		return "errorView";
	}
}
