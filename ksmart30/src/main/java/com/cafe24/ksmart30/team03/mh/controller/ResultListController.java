package com.cafe24.ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultListController {
	//M/H 실적 조회
	@GetMapping("/manHour/result/list")
	public String resultList() {
		return "mh/result/result_search";
	}
	// M/H실적(프로젝트별 누계)
	@GetMapping("/manHour/result/nugae")
	public String a() {
		return "mh/result/a";
	}
	// M/H실적(수행유형별 - 전사그래프)
	@GetMapping("/manHour/result/total")
	public String b() {
		return "mh/result/b";
	}
	// M/H실적(수행유형별 - 본부그래프)
	@GetMapping("/manHour/result/hq")
	public String c() {
		return "mh/result/c";
	}
	// M/H실적(프로젝트 인건비 누계)
	@GetMapping("/manHour/result/cost")
	public String d() {
		return "mh/result/d";
	}
	// M/H 계획/실적(그래프)
	@GetMapping("/manHour/plan/graph")
	public String e() {
		return "mh/result/e";
	}
	// M/H 계획/실적(프로젝트 누계)
	@GetMapping("/manHour/plan/nugae")
	public String f() {
		return "mh/result/f";
	}
	// M/H 계획/실적(당해)
	@GetMapping("/manHour/plan/year")
	public String g() {
		return "mh/result/g";
	}
	// 프로젝트 단계완료 미입력 List
	@GetMapping("/manHour/project/notYet")
	public String h() {
		return "mh/result/h";
	}
	// 프로젝트 일정관리
	@GetMapping("/manHour/project/plan")
	public String i() {
		return "mh/result/i";
	}
}
