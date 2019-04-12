package ksmart30.team00.baseinfo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.baseinfo.domain.Insure;
import ksmart30.team00.baseinfo.service.InsureService;

@Controller
public class InsureController {
	@Autowired InsureService insureService;

	// 10.2.9.1 4대보험 요율 화면
	@GetMapping("/baseInfo/fourInsureView")
	public String fourInsureView() {
		
		return "baseInfo/fourInsureView";
	}

	// 10.2.9.2 4대보험 요율 계산처리 (국민연금)
	@GetMapping("/baseInfo/fourInsureKukminProcess")
	public @ResponseBody Insure fourInsureKukminProcess(@RequestParam(value="INSURE_PAY") String INSURE_PAY)throws JsonProcessingException {
		System.out.println("(C) 10.2.9.2 4대보험 요율 계산처리 (국민연금) fourInsureKukminProcess()");
		Insure insure = new Insure();
		insure.setINSURE_PAY(Integer.parseInt(INSURE_PAY));
		Insure Kukmin = insureService.getFourInsureKukmin(insure);
		return Kukmin;
	}
}
