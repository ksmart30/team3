package ksmart30.team02.account.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team02.account.domain.SlipAdmit;
import ksmart30.team02.account.mapper.SlipAdmitMapper;

@Service
public class SlipAdmitService {
	@Autowired
	SlipAdmitMapper slipAdmitMapper;
	
	public List<SlipAdmit> slipAdmitList(SlipAdmit slipAdmit){
		//전표헤더
		System.out.println("slipAdmitList SlipAdmitService.java");	
	 	//날짜검색 첫번째 - 빼는 과정
		String slip_date = slipAdmit.getSLIP_DATE();
	 	String slip_date1 = slip_date.substring(0, 4);
	 	String slip_date2 = slip_date.substring(5, 7);
	 	String slip_date3 = slip_date.substring(8, 10);
	 	slip_date = slip_date1+slip_date2+slip_date3;
	 	System.out.println(slip_date+"slip_Date 전표헤더 Service!!");
	 	slipAdmit.setSLIP_DATE(slip_date);
	 	//날짜검색2번째 - 빼는과정
	 	String slip_dateB = slipAdmit.getSLIP_DATE2();
	 	String slip_dateB1 = slip_dateB.substring(0, 4);
	 	String slip_dateB2 = slip_dateB.substring(5, 7);
	 	String slip_dateB3 = slip_dateB.substring(8, 10);
	 	slip_dateB = slip_dateB1+slip_dateB2+slip_dateB3;
	 	slipAdmit.setSLIP_DATE2(slip_dateB);
	 	List<SlipAdmit> slipList = slipAdmitMapper.slipAdmitList(slipAdmit);
	 	System.out.println(slipList+"slipList 전표헤더 Service!!");
		return slipList;
	}
	public List<SlipAdmit> slipAdmitList2(SlipAdmit slipAdmit){
		//전표상세
		System.out.println("slipAdmitList2 SlipAdmitService.java");	
		//날짜검색 첫번째 - 빼는 과정
		String slip_date = slipAdmit.getSLIP_DATE();
	 	String slip_date1 = slip_date.substring(0, 4);
	 	String slip_date2 = slip_date.substring(5, 7);
	 	String slip_date3 = slip_date.substring(8, 10);
	 	slip_date = slip_date1+slip_date2+slip_date3;
	 	System.out.println(slip_date+"slip_Date 전표상세!! Service");
	 	slipAdmit.setSLIP_DATE(slip_date);
	 	//날짜검색2번째 - 빼는과정
	 	String slip_dateB = slipAdmit.getSLIP_DATE2();
	 	String slip_dateB1 = slip_dateB.substring(0, 4);
	 	String slip_dateB2 = slip_dateB.substring(5, 7);
	 	String slip_dateB3 = slip_dateB.substring(8, 10);
	 	slip_dateB = slip_dateB1+slip_dateB2+slip_dateB3;
	 	slipAdmit.setSLIP_DATE2(slip_dateB);
	 	System.out.println(slip_dateB+"slip_dateB 전표상세!! Service");
	 	List<SlipAdmit> slipList = slipAdmitMapper.slipAdmitList2(slipAdmit);
	 	//계정과목코드 + 세목  합처주는과정
	 	for(int i=0; i<slipList.size(); i++) {
	 		SlipAdmit slipAdmit2 = slipList.get(i);
	 		String acc_cd1 =  slipAdmit2.getACC_CD();
	 		String acc_dtl = slipAdmit2.getACC_DTL_CD();
	 		String acc_cd = acc_cd1+"-"+acc_dtl;
	 		slipAdmit2.setACC_CD(acc_cd);
	 	}
	 	
	 	System.out.println(slipList+"slipList 전표상세!! Service");
		return slipList;
	}
	//계정과목리스트
	public List<Map<String , String>> getAccountCode(String account){
		System.out.println("getAccountCode SlipAdmitService.java");
		List<Map<String,String>> list = slipAdmitMapper.getAccountCodeList(account);
		
		return list;
	}
	
}
