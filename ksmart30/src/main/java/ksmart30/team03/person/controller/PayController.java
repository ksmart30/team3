package ksmart30.team03.person.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.PayGiveTake;
import ksmart30.team03.person.domain.PayMonth;
import ksmart30.team03.person.domain.PayPeriod;
import ksmart30.team03.person.domain.PayYear;
import ksmart30.team03.person.service.PayService;

@Controller
public class PayController {
	@Autowired PayService payService;
	@Autowired PayMonth payMonth;
	@Autowired PayYear payYear;

	// 6.4.1.1 급여 계산 및 등록화면
	@GetMapping("/person/personPayCalWriteView")
	public String personPayCalWriteView() {
		return "person/pay/personPayCalWriteView";
	}

	// 6.4.1.2 급여 계산 (지급, 공제항목)
	@GetMapping("/person/personPayCalListView")
	public @ResponseBody List<PayGiveTake> personPayCalListView(PayGiveTake payGiveTake) {
		System.out.println("(C) 6.4.1.2 급여 계산 (지급, 공제항목) personPayCalListView()");
		// 1. Service호출 (결과값 : 사원 급여급정보)
		List<PayGiveTake> giveTakeList = payService.getPersonPayCalList(payGiveTake);
		// 2. 리턴
		return giveTakeList;
	}
	// 6.4.1.3 급여 계산 (기간적용항목 / 지급 및 공제)
	@GetMapping("/person/personPayCalPeriodListView")
	public @ResponseBody List<PayPeriod> persionPayCalPeriod(PayPeriod payPeriod) {
		System.out.println("(C) 6.4.1.3 급여 계산 (기간적용항목 / 공제) persionPayCalPeriod()");
		// 1. Service호출 (결과값 : 사원 기간적용항목 정보)
		List<PayPeriod> payPeriodList = payService.getPersonPayCalPeriodList(payPeriod);
		// 2. 리턴
		return payPeriodList;
	}

	//6.4.1.4 급여 대장 화면
	@GetMapping("/person/personPayRegisterView")
	public String personPayRegisterView(Model model) {
		System.out.println("(C) 6.4.1.4 급여 대장 화면 personPayRegisterView()");
		/* Model을 이용한 바로조회	
		// 1. 오늘 년,월 구하기(초기값)
		Date date = new Date();
		String year = Integer.toString(date.getYear()+1900);	// 년
		String month = Integer.toString(date.getMonth()+1);		// 월

		if((month+"").length() < 2) {	// 0 ~ 9 자리 0 채움 
			month = "0" + month;
		}
		String getToday = year+month;	// 오늘년월
		System.out.println("오늘년월 : " + getToday);
		// 2. 초기값 세팅(년월, 부서코드, 사원번호)
			// 1.1 급여대장 (월간) Domain Setting
			payMonth.setPAY_YYMM(getToday);
			// 1.2 급여대장 (연간) Domain Setting
			payYear.setPAY_YYMM(getToday.substring(0, 4));
			// 1.3 부서명초기화
			payMonth.setDEPT_NM("");
			payYear.setDEPT_NM("");
			// 1.4 사원명 초기화
			payMonth.setKOR_NM("");
			payYear.setKOR_NM("");
		// 2. Service호출 (결과값 : 월간, 연간 급여정보)
		List<PayMonth> searchPayMonth = payService.getPersionPayMonthList(payMonth);	// 월간
		List<PayYear> searchPayYear = payService.getPersionPayYearList(payYear);		// 연간
		// 3. Model에 setting
		model.addAttribute("personPayMonthList", searchPayMonth);	// 월간
		model.addAttribute("personPayYearList", searchPayYear);		// 연간
		// 4. 리턴 
		*/
		return "person/pay/personPayRegisterView";
	}

	// 6.4.1.5 급여 대장 검색 (월간)
	@GetMapping("/person/personPayRegisterMonthSearchProcess")
	public @ResponseBody List<PayMonth> personPayRegisterMonthSearchProcess(@RequestParam(value="PAY_YYMM") String payYymm, @RequestParam(value="DEPT_NM") String deptNm, @RequestParam(value="KOR_NM") String korNm) {
		System.out.println("(C) 6.4.1.5 급여 대장 검색 (월간, 연간) personPayRegisterMonthSearchProcess()");
		// 1. 검색일자 Domain에 Setting (년도만 검색하므로 월을 지우기 위해 subStirng사용)
		payMonth.setPAY_YYMM(payYymm.replace("-", ""));
		payMonth.setDEPT_NM(deptNm);
		payMonth.setKOR_NM(korNm);
		System.out.println(payMonth.getPAY_YYMM());
		System.out.println(payMonth.getDEPT_NM());
		System.out.println(payMonth.getKOR_NM());
		// 1. Service호출 (결과값 : 검색된 사원 급여정보(월간))
		List<PayMonth> searchPayMonth = payService.getPersionPayMonthList(payMonth);
		// 2 결과값 리턴
		return searchPayMonth;
	}

	// 6.4.1.6 급여 대장 검색 (연간)
	@GetMapping("/person/personPayRegisterYearSearchProcess")
	public @ResponseBody List<PayYear> personPayRegisterYearSearchProcess(@RequestParam(value="PAY_YYMM") String payYymm, @RequestParam(value="DEPT_NM") String deptNm, @RequestParam(value="KOR_NM") String korNm) {
		System.out.println("(C) 6.4.1.6 급여 대장 검색 (연간) personPayRegisterYearSearchProcess()");
		// 1. 검색일자 Domain에 Setting (년도만 검색하므로 월을 지우기 위해 subStirng사용)
		payYear.setPAY_YYMM(payYymm.substring(0, 4));
		payYear.setDEPT_NM(deptNm);
		payYear.setKOR_NM(korNm);
		System.out.println(payYear.getPAY_YYMM());
		System.out.println(payYear.getDEPT_NM());
		System.out.println(payYear.getKOR_NM());
		// 2. Service호출 (결과값 : 검색된 사원 급여정보(연간))
		List<PayYear> searchPayYear = payService.getPersionPayYearList(payYear);
		// 3. 결과값 리턴
		return searchPayYear;
	}
}
