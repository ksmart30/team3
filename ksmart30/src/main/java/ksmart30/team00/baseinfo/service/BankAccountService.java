package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.BankAccountMapper;
import ksmart30.team00.baseinfo.domain.BankAccount;

import groovy.transform.builder.InitializerStrategy.SET;

@Service
public class BankAccountService {
	@Autowired
	BankAccountMapper bankAccountMapper;
	
	//은행지점별 계좌번호등록
	public List<BankAccount> addBankAccount(){
		System.out.println("은행지점별 계좌번호등록 addBankAccount BankAccountService.java");
		List<BankAccount> list = bankAccountMapper.addBankAccount();
		System.out.println(list+"은행지점별 계좌번호등록 addBankAccount BankAccountService.java");
		
		for(int i=0; i<list.size(); i++) {
			
			switch(list.get(i).getBANK_BRCH_CD()) {
			
			//신한은행
			case "999010" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("1");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//우리은행
			case "999020" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("2");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//기업은행
			case "999030" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("3");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//국민은행
			case "999040" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("4");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//KEB하나은행
			case "999050" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("5");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//농협
			case "999060" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("6");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//산업은행
			case "999070" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("7");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//KEB하나은행(구 외환)
			case "999080" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("8");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//엔지니어링공제조합
			case "999090" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("9");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//김상희
			case "999100" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("10");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//미래에셋생명보험
			case "999110" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("11");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//제일은행
			case "999120" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("12");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//동양증권
			case "999130" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("13");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
				
			//폭스바겐파이낸셜
			case "999140" :
				list.get(i).setId(list.get(i).getACNT_NO());
				list.get(i).setPid("14");
				list.get(i).setName(list.get(i).getACNT_NO());
				break;
			}
		}
		return list;
	}
	
	//은행지점별 계좌번호등록
	public List<BankAccount> bankAccountList(String BANK_BRCH_CD){
		System.out.println("은행지점별 계좌번호등록 bankAccountList BankAccountService.java");
			List<BankAccount> list = null;
			try {
				if(Integer.parseInt(BANK_BRCH_CD.substring(0,1)) > 0) {
					//한행
					list = bankAccountMapper.bankAccountList1(BANK_BRCH_CD);
					BANK_BRCH_CD = list.get(0).getBRCH_LONG_NM();
					
					//리스트
					list = bankAccountMapper.bankAccountList(BANK_BRCH_CD);
				}
			}catch(Exception e){
				list = bankAccountMapper.bankAccountList(BANK_BRCH_CD);
			}
			
			System.out.println(list.toString()+"<--구분값");
				
			
			return list;
		}
	}

