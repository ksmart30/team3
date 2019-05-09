package ksmart30.team01.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.mapper.BusinessYesanOutputMapper;

@Service
public class BusinessYesanOutputService {
	@Autowired
	BusinessYesanOutputMapper businessYesanOutputMapper;
	
	//부서리스트
	public List<Map<String,String>> businessOutputList(){
		System.out.println("businessOutputList BusinessYesanOutputService.java");
		List<Map<String,String>> outputList = businessYesanOutputMapper.businessOutputList();
		return outputList;
	}
	//프로젝트코드 팝업창(코드,코드명)
	public List<Business> businessSearchList(Business business){
		System.out.println("businessSearchList BusinessYesanOutputService.java");
		List<Business> businessList = businessYesanOutputMapper.businessSearchList(business);
		return businessList;
	}
	//사업성코드 리스트 출력
	public List<Business> businessList(Business business){
		System.out.println("사업성코드 리스트 출력 서비스 businessList BusinessYesanOutputService.java");
		List<Business> list = null;
		if(business.getPJT_CD() == "") {
			list = businessYesanOutputMapper.businessList(business);
		}else {
			String pjtCode = business.getPJT_CD().substring(0,5);
			business.setPJT_CD(pjtCode);
			System.out.println(business.getPJT_CD());
			list = businessYesanOutputMapper.businessList(business);
		}

		System.out.println(list+"<--사업성코드리스트 서비스리퇀!!");
		for(int i=0; i<list.size(); i++) {
			business = list.get(i);
			String pjtCd =  business.getPJT_CD();
			String pjtType =  business.getPJT_TYPE();
			String pjtCdType = pjtCd+pjtType;
			business.setPJT_CD(pjtCdType);
		}
		return list;
	}
	//사업성코드 리스트(라디오)
	public List<Business> businessList2(Business business){
		System.out.println("사업성코드 리스트 출력(라디오) 서비스 businessList BusinessYesanOutputService.java");
		List<Business> list = null;
		list = businessYesanOutputMapper.businessList2(business);
		for(int i=0; i<list.size(); i++) {
			business = list.get(i);
			String pjtCd =  business.getPJT_CD();
			String pjtType =  business.getPJT_TYPE();
			String pjtCdType = pjtCd+pjtType;
			business.setPJT_CD(pjtCdType);
		}
		if(business.getACT_STAT() == "") {
			list = businessYesanOutputMapper.businessList(business);
			for(int i=0; i<list.size(); i++) {
				business = list.get(i);
				String pjtCd =  business.getPJT_CD();
				String pjtType =  business.getPJT_TYPE();
				String pjtCdType = pjtCd+pjtType;
				business.setPJT_CD(pjtCdType);
			}
			
		}
		return list;
	}
}
