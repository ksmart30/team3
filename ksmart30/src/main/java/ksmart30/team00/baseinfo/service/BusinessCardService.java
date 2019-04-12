package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.BusinessCardMapper;
import ksmart30.team00.baseinfo.domain.BusinessCard;

@Service
public class BusinessCardService {
	@Autowired
	BusinessCardMapper businessCardMapper;
	//기업카드 리스트
	public List<BusinessCard> businessCardList(){
		System.out.println("기업카드 리스트 businessCardList BusinessCardService.java");
		List<BusinessCard> businessCardList =  businessCardMapper.businessCardList();
		System.out.println(businessCardList+"<--businessCardList BusinessCardService.java");
		
		return businessCardList;
	}
}
