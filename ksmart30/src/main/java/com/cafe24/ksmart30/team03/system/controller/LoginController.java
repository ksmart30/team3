package com.cafe24.ksmart30.team03.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.cafe24.ksmart30.team03.system.service.LoginService;
import com.cafe24.ksmart30.team03.system.vo.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired LoginService loginService;

	// 로그인 화면
	@GetMapping("/login")
	public String login() {
		System.out.println("(C)(Get) login() : 로그인 화면");
		return "system/login";
	}

	// 로그인처리
	@PostMapping("/login")
	public String login(HttpSession session, HttpServletRequest request, Login login) {
		System.out.println("(C)(Post) login() : 로그인 처리");
		// 로그인 처리 실행
		System.out.println("입력 받은 ID :" + login.getEMP_NO());
		System.out.println("입력 받은 PW :" + login.getPASS_WD());

		int result = loginService.login(session, request, login);

		// 로그인 처리 결과에 따른 경로이동 (1:성공 0:실패)
		if(result == 1) {
			return "redirect:/";
		}else {
			return "system/login";
		}
	}

	// 로그아웃 처리
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("(C)(Get) logout() : 로그아웃 처리");
		loginService.logout(session);
		return "redirect:/login";
	}
}
