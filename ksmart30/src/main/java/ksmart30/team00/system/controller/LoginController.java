package ksmart30.team00.system.controller;

import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ksmart30.team00.system.domain.Login;
import ksmart30.team00.system.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	// 0.1 로그인 화면
	@GetMapping("/loginView")
	public String login() {
		System.out.println("(C)(Get) login() : 로그인 화면");
		return "system/loginView";
	}

	// 0.2 로그인처리
	@PostMapping("/loginView")
	public String loginView(HttpSession session, HttpServletRequest request, Login login) throws UnknownHostException {
		System.out.println("(C)(Post) login() : 로그인 처리");
		// 1. 로그인 처리 실행
		System.out.println("입력 받은 ID :" + login.getEMP_NO());
		System.out.println("입력 받은 PW :" + login.getPASS_WD());

		int result = loginService.getLogin(session, request, login);

		// 2. 로그인 처리 결과에 따른 경로이동 (1:성공 0:실패)
		if(result == 1) {
			return "redirect:/";
		}else {
			return "system/loginView";
		}
	}

	// 0.3 로그아웃 처리
	@GetMapping("/logoutProcess")
	public String logoutProcess(HttpSession session) {
		System.out.println("(C)(Get) logout() : 로그아웃 처리");
		loginService.logout(session);
		return "redirect:/loginView";
	}
}
