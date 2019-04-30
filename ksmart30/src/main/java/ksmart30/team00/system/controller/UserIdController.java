package ksmart30.team00.system.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.system.domain.UserId;
import ksmart30.team00.system.service.UserIdService;

@Controller
public class UserIdController {
	@Autowired UserIdService userIdService;
	@Autowired UserId resultUserId;
	
	// 11.1.1 User-ID 화면
	@GetMapping("/system/userIdSearchView")
	public String userIdSearchView() {
		System.out.println("(C) 11.1.1 User-ID 화면 userIdSearchView()");
		return "system/userIdView";
	}

	// 11.1.2 User-ID 등록처리(수정 포함)
	@GetMapping("/system/userIdWriteProcess")
	public @ResponseBody UserId UserIdWriteProcess(HttpSession httpSession, UserId userId) {
		System.out.println("(C) 11.1.2 User-ID 등록처리 userIdSearchView()");
		// 1. 등록처리를 위한 Service호출
		resultUserId = userIdService.addUserId(httpSession, userId);
		System.out.println("최종 리턴 결과는 ?(0:비밀번호오류 / 1:수정처리 / 2:입력처리) : " + resultUserId.getRESULT());
		// 2. 리턴
		return resultUserId;
	}

	// 11.1.3 User-ID 조회
	@GetMapping("/system/userIdView")
	public @ResponseBody UserId userIdView(UserId userId){
		System.out.println("(C) 11.1.3 User-ID 조회 userIdView()");
		// 1. Service호출(결과값 : 사원 User-ID정보)
		resultUserId = userIdService.getUserId(userId);
		// 2. 리턴
		return resultUserId;
	}
}
