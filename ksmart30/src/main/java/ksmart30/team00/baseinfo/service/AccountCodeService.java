/* 10.2.5.계정과목코드
 * @file      AccountCodeService.java
 * @brief    계정과목코드 서비스 계층
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.AccountCodeMapper;
import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Service
public class AccountCodeService {
	@Autowired
	AccountCodeMapper accountcodemapper;
	// 10.2.5.계정과목코드
	/* @brief  AccountCodeMapper내 selectAccountCodeList메서드 호출, 숫자값 문자값으로 전환중 	                
	 * @return  List<AccountCode> list
	 */
	//AccountCodeMapper내 selectAccountCodeList메서드 호출, 숫자값 문자값으려 변환 후 리턴.
	public List<AccountCodeDomain> getAccountCodeList(){
		System.out.println("02 getAccountCodeList 단위테스트");
		List<AccountCodeDomain> list = accountcodemapper.selectAccountCodeList();
		/*
		 * for(int i=0; i<list.size(); i++) { if(list.get(i).getAccClas() == "1") {
		 * list.get(i).setAccClas("자산"); }
		 * 
		 * }
		 */
		return list;
	}
	public List<ControlItemCodeDomain> getControlItemCodeList(){
		System.out.println("02 getControlItemCodeList 단위테스트");
		List<ControlItemCodeDomain> controlItemCodelist =  accountcodemapper.selectControlItemCodeList();
		return controlItemCodelist;
	}
}
