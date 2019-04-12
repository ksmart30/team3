package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.BankAccount;

@Mapper
public interface BankAccountMapper {
	//은행지점별 계좌번호등록
	List<BankAccount> addBankAccount();
	
	//은행지점별 계좌번호등록 리스트
	List<BankAccount> bankAccountList(String BRCH_LONG_NM);
	List<BankAccount> bankAccountList1(String ACNT_NO);
}
