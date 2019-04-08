package ksmart30.team03.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	//5.2 실적승인(날짜 검색)
		@PostMapping("/manHour/approvalDateSearchView")
		public String approvalDateSearchView(Model model,@RequestParam(value="WORK_DT")String WORK_DT) {
			System.out.println("approvalDateSearchView 날짜검색요청");
			List<Result> resultdate = approvalService.getApprovalSearchDate(WORK_DT);
			model.addAttribute("approval", resultdate);
			return "mh/result/approvalSearchView";
			
		}
	
	
}
