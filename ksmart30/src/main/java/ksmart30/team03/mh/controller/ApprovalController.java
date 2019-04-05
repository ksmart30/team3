package ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.service.ApprovalService;

@Controller
public class ApprovalController {
	@Autowired
	private ApprovalService approvalService;
	//5.2  실적 승인(List)
	@GetMapping("/manHour/approvalSearchView")
	public String approvalSearchView(Model model) {
		System.out.println("Controller approvalSearchView 요청");
		List<Result> approval = approvalService.approvalSearchView();
		model.addAttribute("approval", approval);
		return "mh/result/approvalSearchView";
	}
}
