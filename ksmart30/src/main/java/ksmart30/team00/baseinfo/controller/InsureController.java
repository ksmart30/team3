package ksmart30.team00.baseinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public @ResponseBody Insure fourInsureKukminProcess(@RequestParam(value="INSURE_PAY") String INSURE_PAY) {
		System.out.println("(C) 10.2.9.2 4대보험 요율 계산처리 (국민연금) fourInsureKukminProcess()");
		// 1. 월 급여(문자열)을 정수형으로 변환
		Insure insure = new Insure();
			// 1.1 문자열 콤마(,)삭제
			int replaceInsurePay = Integer.parseInt(INSURE_PAY.replace(",",""));
			System.out.println("입력 받은 월 급여 : " + replaceInsurePay);
		// 2. domain에 변환한 월 급여를 Setting
		insure.setINSURE_PAY(replaceInsurePay);
		// 3. Service 호출 (리턴값 : Service에서 계산처리된 값)
		Insure Kukmin = insureService.getFourInsureKukmin(insure);
		// 4. 리턴
		return Kukmin;
	}

	// 10.2.9.3 4대보험 요율 게산처리 (건강보험)
	@GetMapping("/baseInfo/fourInsureKeungangProcess")
	public @ResponseBody Insure fourInsureKeungangProcess(@RequestParam(value="INSURE_PAY") String INSURE_PAY){
		System.out.println("(C) 10.2.9.3 4대보험 요율 계산처리 (건강보험) fourInsureKeungangProcess()");
		// 1. 월 급여(문자열)을 정수형으로 변환
		Insure insure = new Insure();
			// 1.1 문자열 콤마(,)삭제
			int replaceInsurePay = Integer.parseInt(INSURE_PAY.replace(",",""));
			System.out.println("입력 받은 월 급여 : " + replaceInsurePay);
		// 2. domain에 변환한 월 급여를 Setting
		insure.setINSURE_PAY(replaceInsurePay);
		// 3. Service 호출 (리턴값 : Service에서 계산처리된 값)
		Insure Keungang = insureService.getFourInsureKeungang(insure);
		// 4. 리턴
		return Keungang;
	}
}
