package ksmart30.team02.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.UnpaidDomain;
import ksmart30.team02.account.service.UnpaidService;

@Controller
public class UnpaidController {
	@Autowired
	private UnpaidService unpaidService;
	
	@GetMapping("/acc/unpaidView")
	public String unpaidView() {
		return "account/unpaidView";
	}
	
	/* @param  @RequestParam(value="SLIP_DATE") String SLIP_DATE
	 * @brief  AJax slip_date로 리스트 출력
	 * @return  List<UnpaidDomain>
	 */
	@GetMapping("/unpaidView")
	public @ResponseBody List<UnpaidDomain> searchView(@RequestParam(value="SLIP_DATE") String SLIP_DATE){
		return unpaidService.getUnpaidContentsList(SLIP_DATE);
	}
	/* @param  @RequestParam(value="account") String account
	 * @brief  AJax 계정과목코드 및 리스트 출력
	 * @return  List<UnpaidDomain>
	 */
	@GetMapping("/unpaidaccountSearchView")
	public @ResponseBody List<Map<String,String>> accountSearchView(@RequestParam(value="account") String account) throws JsonProcessingException{
		System.out.println("unpaidaccountSearch호출");
		return unpaidService.getAccountCode(account);
	}
}
