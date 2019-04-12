package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.baseinfo.service.BusinessCardService;
import ksmart30.team00.baseinfo.domain.BusinessCard;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class BusinessCardController {
	@Autowired
	BusinessCardService businessCardService;
	
	//기업카드
	@GetMapping("/baseInfo/businessCardView")
	public String businessCardView() {
		System.out.println("기업카드 businessCardController ControlItemCodeController.java");
		return "baseInfo/businessCardView";
	}
	//기업카드리스트
	@GetMapping("/businessCardList")
	public @ResponseBody List<BusinessCard> businessCardList() throws JsonProcessingException {
		System.out.println("기업카드리스트 businessCardList BusinessCardController");
		
		List<BusinessCard> businessCardList = businessCardService.businessCardList();
		System.out.println(businessCardList +"<--businessCardList BusinessCardController");
		return businessCardList;
	}
}
