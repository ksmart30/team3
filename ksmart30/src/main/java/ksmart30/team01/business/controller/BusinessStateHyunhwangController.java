/* 01.03.05.사업성분석검토현황-진행/종료 현황
 * @file      BusinessStateHyunhwangController.java
 * @brief    진행/종료 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team01.business.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team01.business.domain.BusinessStateJinhaengHyunhwangDomain;
import ksmart30.team01.business.service.BusinessStateHyunhwangService;

@Controller
public class BusinessStateHyunhwangController {
@Autowired
BusinessStateHyunhwangService businessStateHyunhwangService;
	
	// 01.03.05.사업성분석검토현황-진행현황 View
	/* @param  Model model 	    
	 * @brief  BusinessStateHyunhwangService내 businessStateHyunhwangList메서드 호출
	 * 	       "http://localhost/business/businessStateHyunhawngView" 주소분기(get방식)
	 *          template폴더에 있는 businessStateHyunhwangView.html forward
	 * 	                같은표현: @RequestMapping(value="/business/businessStateHyunhawngView", method = RequestMethod.GET)
	 * @return  String(business/businessStateHyunhwangView)
	 */
	@GetMapping("/business/businessStateHyunhwangView")
	public String businessStateHyunhwangView(Model model) {		
		Map<String, Object> map = businessStateHyunhwangService.businessStateHyunhwangList();			
		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy"+"년"+" MM"+"월"+" dd"+"일 현재 진행 사업성검토", Locale.KOREA );
		Date date = new Date ();
		String time = mSimpleDateFormat.format(date);
		model.addAttribute("map", map);
		model.addAttribute("time", time);
		return "business/businessStateHyunhwangView";
	}
	
	// 01.03.05.사업성분석검토현황-진행현황-사업성 검토 리스트	    
	/* @brief  BusinessStateHyunhwangService내 businessStateHyunhwangList메서드 호출
	 * 	       "http://localhost/business/businessListProcess" 주소분기(get방식)         
	 * 	                같은표현: @RequestMapping(value="/business/businessListProcess", method = RequestMethod.POST)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/business/businessListProcess")
	public @ResponseBody Map<String, Object> businessListProcess() {		
		Map<String, Object> map = businessStateHyunhwangService.businessStateHyunhwangList();
		//System.out.println("map.businessListProcess : " + map);				
		return map;
	}
	
	// 01.03.05.사업성분석검토현황-진행현황-수주구분별 리스트
	/* @param  TotalCode totalCode	    
	 * @brief  BusinessStateHyunhwangService내 sujuGubunSearchProcess메서드 호출
	 * 	       "http://localhost/business/sujuGubunListProcess" 주소분기(POST방식)
	 * 	                같은표현: @RequestMapping(value="/business/sujuGubunListProcess", method = RequestMethod.POST)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/business/sujuGubunListProcess")
	public @ResponseBody Map<String, Object> sujuGubunListProcess(TotalCode totalCode) {
		System.out.println("totalCode : " + totalCode);		
		Map<String, Object> map = businessStateHyunhwangService.sujuGubunListProcess(totalCode);			
		return map;
	}
	
	// 01.03.05.사업성분석검토현황-진행현황-진행상태별 리스트
	/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain 	    
	 * @brief  BusinessStateHyunhwangService내 jinhaengSangtaeListProcess메서드 호출
	 * 	       "http://localhost/business/jinhaengSangtaeListProcess" 주소분기(POST방식)        
	 * 	                같은표현: @RequestMapping(value="/business/jinhaengSangtaeListProcess", method = RequestMethod.POST)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/business/jinhaengSangtaeListProcess")
	public @ResponseBody Map<String, Object> jinhaengSangtaeListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain) {
		System.out.println("businessStateJinhaengHyunhwangDomain : " + businessStateJinhaengHyunhwangDomain);
		Map<String, Object> map = businessStateHyunhwangService.jinhaengSangtaeListProcess(businessStateJinhaengHyunhwangDomain);					
		return map;
	}
	
	// 01.03.05.사업성분석검토현황-진행현황-진행상태별 리스트
	/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain 	    
	 * @brief  BusinessStateHyunhwangService내 jinhaengSangtaeListProcess메서드 호출
	 * 	       "http://localhost/business/jinhaengSangtaeListProcess" 주소분기(POST방식)        
	 * 	                같은표현: @RequestMapping(value="/business/jinhaengSangtaeListProcess", method = RequestMethod.POST)
	 * @return  Map<String, Object> map
	 */
	@GetMapping("/business/hyunjaeJinhaengInfoProcess")
	public @ResponseBody Map<String, Object> hyunjaeJinhaengInfoProcess() {
		Map<String, Object> map = businessStateHyunhwangService.hyunjaeJinhaengInfoProcess();	
		return map;
	}
	
	// 01.03.05.사업성분석검토현황-진행현황-진행상태별 사업성검토 리스트	    
	/* @brief  BusinessStateHyunhwangService내 hyunjaeJinhaengInfoProcess메서드 호출
	 * 	       "http://localhost/business/jinhaengInfoProcess" 주소분기(POST방식)        
	 * 	                같은표현: @RequestMapping(value="/business/jinhaengInfoProcess", method = RequestMethod.GET)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/business/jinhaengInfoProcess")
	public @ResponseBody Map<String, Object> jinhaengInfoProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain) {
	//System.out.println("jinhaengInfoProcess ");
	Map<String, Object> map = businessStateHyunhwangService.jinhaengInfoProcess(businessStateJinhaengHyunhwangDomain);
	return map;
	}
	
	// 01.03.05.사업성분석검토현황-종료현황-본부별 사업성 검토 리스트
	/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain    
	 * @brief  BusinessStateHyunhwangService내 businessStateHyunhwangList메서드 호출
	 * 	       "http://localhost/business/bonbuBusinessEndListProcess" 주소분기(get방식)
	 * @return  Map<String, Object> map
	 */
	@GetMapping("/business/bonbuBusinessEndListProcess")
	public @ResponseBody Map<String, Object> bonbuBusinessEndListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain) {		
		System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
		Map<String, Object> map = businessStateHyunhwangService.bonbuBusinessEndListProcess(businessStateJinhaengHyunhwangDomain);		
		return map;
	}
	
	// 01.03.05.사업성분석검토현황-종료현황-진행상태&수주구분별 리스트
	/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain 	    
	 * @brief  BusinessStateHyunhwangService내 jinhaengSangtaeEndListProcess메서드 호출
	 * 	       "http://localhost/business/jinhaengSangtaeEndListProcess" 주소분기(get방식)
	 * @return  Map<String, Object> map
	 */
	@PostMapping("/business/jinhaengSangtaeEndListProcess")
	public @ResponseBody Map<String, Object> jinhaengSangtaeEndListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain) {		
		System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
		Map<String, Object> map = businessStateHyunhwangService.jinhaengSangtaeEndListProcess(businessStateJinhaengHyunhwangDomain);		
		return map;
	}
}
