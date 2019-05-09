package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.service.BusinessYesanOutputService;

@Controller
public class BusinessYesanOutputControlle {
	@Autowired
	BusinessYesanOutputService businessYesanOutputService;
	
	@GetMapping("/business/businessYesanOutputView")
	public String businessYesanOutputView(Model model) {
		List<Map<String,String>> list = businessYesanOutputService.businessOutputList();
		model.addAttribute("list",list);
		System.out.println(list.toString()+"<--부서리스트가져오나연?");
		return "/business/businessYesanOutputView";
	}
	//프로젝트코드 (팝업창 코드,코드명)조회
	@GetMapping("/businessYesanOutputView")
	public @ResponseBody List<Business> businessSearchList(Business business){
		System.out.println("계약프로젝트조회 businessSearchView BusinessYesanOutputControlle.java");
		List<Business> businessList = businessYesanOutputService.businessSearchList(business);
		System.out.println(businessList+"<--businessList 컨트롤러 리턴가즈아!!");
		return businessList;
	}
	//사업성검토 리스트출력
	@GetMapping("/businessYesanList")
	public @ResponseBody List<Business> businessList(Business business){
		System.out.println(business+"<---받아온다니까 깐뜨롤라!!");
		System.out.println("사업성코드 리스트 출력 깐뜨롤라 businessList BusinessYesanOutputControlle.java");
		List<Business> list =  businessYesanOutputService.businessList(business);
		System.out.println(list+"<--사업성코드 리스트 리퇀! 깐뜨롤라~");
		return list;
	}
	//사업성검토 리스트(라디오)
	@GetMapping("/businessYesanList2")
	public @ResponseBody List<Business> businessList2(Business business){
		System.out.println("사업성코드 리스트 출력 깐뜨롤라 businessList BusinessYesanOutputControlle.java");
		List<Business> list =  businessYesanOutputService.businessList2(business);
		System.out.println(list+"<--사업성코드 리스트 리퇀! 깐뜨롤라~");
		return list;
	}
}
