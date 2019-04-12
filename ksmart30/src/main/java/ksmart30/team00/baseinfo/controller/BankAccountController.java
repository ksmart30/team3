/*
 * @file    BankAccountController.java
 * @brief   은행지점별 계좌번호등록
 * @author  ksmart30 JST
 */
package ksmart30.team00.baseinfo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.baseinfo.service.BankAccountService;
import ksmart30.team00.baseinfo.domain.BankAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
@Controller
public class BankAccountController {
	@Autowired
	BankAccountService bankAccountService;
	
	
	// 10.3.3 은행지점별 계좌번호등록 화면요청
	/* @param   	    
	 * 	    
	 * @brief    bankaccount.html 화면출력
	 * 	   "http://localhost/baseInfo/bankaccount/in" 주소분기(get방식)
	 *             template폴더에 있는 bankaccount.html forward
	 * 	  
	 * @return  String(bankaccount.html 은행지점별 계좌번호등록화면)
	 */
	@GetMapping("/baseInfo/bankAccountView")
	public String bankAccountView() {
		System.out.println("addBankAccount BankAccountController.java");
		
		return "baseInfo/bankaccountView";
	}
	//트리메뉴
	@GetMapping("/jsttreemenu")
	public @ResponseBody List<BankAccount> addBankAccount() throws JsonProcessingException {
		System.out.println("treeMenu BankAccountController.java");
		List<BankAccount> treeList = bankAccountService.addBankAccount();
		
		return treeList;
	}
	//ajax 통해서 리스트 출력
	@GetMapping("/jsttreeselected")
	public @ResponseBody List<BankAccount> bankAccountList(@RequestParam(value="BANK_BRCH_CD") String BANK_BRCH_CD){
		System.out.println(BANK_BRCH_CD +"<--클릭한계좌 은행 이름");
		return bankAccountService.bankAccountList(BANK_BRCH_CD);
	}
	
	
}
