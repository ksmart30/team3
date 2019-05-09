/* 01.03.05.사업성분석검토현황-진행/종료 현황
 * @file      BusinessStateHyunhwangService.java
 * @brief    진행/종료 서비스 계층
 * @author  ksmart30 박찬업
 */
package ksmart30.team01.business.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team01.business.domain.BusinessStateJinhaengHyunhwangDomain;
import ksmart30.team01.business.mapper.BusinessStateHyunhwangMapper;

@Service
public class BusinessStateHyunhwangService {
@Autowired
BusinessStateHyunhwangMapper businessStateHyunhwangMapper;
	
	//01.03.05.사업성분석검토현황-진행현황-사업성 검토 리스트 조회	    
	/* @brief  businessStateHyunhwangMapper내 getBusinessState1BonbuHyunhwangInfo, getBusinessState2BonbuHyunhwangInfo, 
	 * getBusinessState3BonbuHyunhwangInfo, getBusinessState4BonbuHyunhwangInfo, getBusinessState5BonbuHyunhwangInfo, 
	 * getBusinessStateJinhaengHyunhwangInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> businessStateHyunhwangList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<TotalCode> list1 = businessStateHyunhwangMapper.getBusinessState1BonbuHyunhwangInfo();
		int sumTotl1 = 0;
		int sumBiz11 = 0;
		int sumBiz21 = 0;
		for(int i=0; i<list1.size(); i++) {
			TotalCode totalCodeList1 = list1.get(i);
			sumTotl1 += Integer.parseInt(totalCodeList1.getTOTL());
			sumBiz11 += Integer.parseInt(totalCodeList1.getBIZ1());
			sumBiz21 += Integer.parseInt(totalCodeList1.getBIZ2());
		}
		map.put("sumTotl1", sumTotl1);
		map.put("sumBiz11", sumBiz11);
		map.put("sumBiz21", sumBiz21);
		map.put("list1", list1);
		
		List<TotalCode> list2 = businessStateHyunhwangMapper.getBusinessState2BonbuHyunhwangInfo();
		int sumTotl2 = 0;
		int sumBiz12 = 0;
		int sumBiz22 = 0;
		for(int i=0; i<list2.size(); i++) {
			TotalCode totalCodeList2 = list2.get(i);
			sumTotl2 += Integer.parseInt(totalCodeList2.getTOTL());
			sumBiz12 += Integer.parseInt(totalCodeList2.getBIZ1());
			sumBiz22 += Integer.parseInt(totalCodeList2.getBIZ2());
		}
		map.put("sumTotl2", sumTotl2);
		map.put("sumBiz12", sumBiz12);
		map.put("sumBiz22", sumBiz22);
		map.put("list2", list2);
		
		List<TotalCode> list3 = businessStateHyunhwangMapper.getBusinessState3BonbuHyunhwangInfo();
		int sumTotl3 = 0;
		int sumBiz13 = 0;
		int sumBiz23 = 0;
		for(int i=0; i<list3.size(); i++) {
			TotalCode totalCodeList3 = list3.get(i);
			sumTotl3 += Integer.parseInt(totalCodeList3.getTOTL());
			sumBiz13 += Integer.parseInt(totalCodeList3.getBIZ1());
			sumBiz23 += Integer.parseInt(totalCodeList3.getBIZ2());
		}
		map.put("sumTotl3", sumTotl3);
		map.put("sumBiz13", sumBiz13);
		map.put("sumBiz23", sumBiz23);
		map.put("list3", list3);
		
		List<TotalCode> list4 = businessStateHyunhwangMapper.getBusinessState4BonbuHyunhwangInfo();
		int sumTotl4 = 0;
		int sumBiz14 = 0;
		int sumBiz24 = 0;
		for(int i=0; i<list4.size(); i++) {
			TotalCode totalCodeList4 = list4.get(i);
			sumTotl4 += Integer.parseInt(totalCodeList4.getTOTL());
			sumBiz14 += Integer.parseInt(totalCodeList4.getBIZ1());
			sumBiz24 += Integer.parseInt(totalCodeList4.getBIZ2());
		}
		map.put("sumTotl4", sumTotl4);
		map.put("sumBiz14", sumBiz14);
		map.put("sumBiz24", sumBiz24);
		map.put("list4", list4);
		
		List<TotalCode> list5 = businessStateHyunhwangMapper.getBusinessState5BonbuHyunhwangInfo();
		int sumTotl5 = 0;
		int sumBiz15 = 0;
		int sumBiz25 = 0;
		for(int i=0; i<list5.size(); i++) {
			TotalCode totalCodeList5 = list5.get(i);
			sumTotl5 += Integer.parseInt(totalCodeList5.getTOTL());
			sumBiz15 += Integer.parseInt(totalCodeList5.getBIZ1());
			sumBiz25 += Integer.parseInt(totalCodeList5.getBIZ2());
		}
		map.put("sumTotl5", sumTotl5);
		map.put("sumBiz15", sumBiz15);
		map.put("sumBiz25", sumBiz25);
		map.put("list5", list5);		
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengList = businessStateHyunhwangMapper.getBusinessStateJinhaengHyunhwangInfo();
		map.put("jinhaengList", jinhaengList);
		return map;
	}

	//01.03.05.사업성분석검토현황-진행현황-수주구분별 리스트 조회	    
	/* @param TotalCode totalCode
	 * @brief  businessStateHyunhwangMapper내 getSujuGubunInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> sujuGubunListProcess(TotalCode totalCode){
		Map<String, Object> map = new HashMap<String, Object>();
		if(totalCode.getSYS_COD().equals("설계1본부")){
			totalCode.setSYS_COD("7500");	
		} else if(totalCode.getSYS_COD().equals("설계2본부")){
			totalCode.setSYS_COD("7600");
		} else if(totalCode.getSYS_COD().equals("설계3본부")){
			totalCode.setSYS_COD("7700");
		} else if(totalCode.getSYS_COD().equals("설계4본부")){
			totalCode.setSYS_COD("7800");
		} else if(totalCode.getSYS_COD().equals("설계5본부")){
			totalCode.setSYS_COD("7900");
		}
		System.out.println("totalCode : " + totalCode);
		List<BusinessStateJinhaengHyunhwangDomain> sujuGubunList = businessStateHyunhwangMapper.getSujuGubunInfo(totalCode);
		System.out.println("sujuGubunList : " + sujuGubunList);
		map.put("sujuGubunList", sujuGubunList);
		return map;
	}

	//01.03.05.사업성분석검토현황-진행현황-진행상태별 리스트 조회   
		/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain
		 * @brief  businessStateHyunhwangMapper내 getJinhaengSangtaeInfo, getJinhaengSangtaeInfo메서드 호출
		 * @return  Map<String, Object> map
		 */	
	public Map<String, Object> jinhaengSangtaeListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		if(businessStateJinhaengHyunhwangDomain.getDEPT_NM() != null) {
			if(businessStateJinhaengHyunhwangDomain.getDEPT_NM().substring(0, 5).equals("설계1본부")) {
				businessStateJinhaengHyunhwangDomain.setDEPT_CD("7500");
			} else if(businessStateJinhaengHyunhwangDomain.getDEPT_NM().substring(0, 5).equals("설계2본부")) {
				businessStateJinhaengHyunhwangDomain.setDEPT_CD("7600");
			} else if(businessStateJinhaengHyunhwangDomain.getDEPT_NM().substring(0, 5).equals("설계3본부")) {
				businessStateJinhaengHyunhwangDomain.setDEPT_CD("7700");
			} else if(businessStateJinhaengHyunhwangDomain.getDEPT_NM().substring(0, 5).equals("설계4본부")) {
				businessStateJinhaengHyunhwangDomain.setDEPT_CD("7800");
			} else if(businessStateJinhaengHyunhwangDomain.getDEPT_NM().substring(0, 5).equals("설계5본부")) {
				businessStateJinhaengHyunhwangDomain.setDEPT_CD("7900");
			}
		}		
		System.out.println("businessStateJinhaengHyunhwangDomain.getDEPT_NM() : " + businessStateJinhaengHyunhwangDomain.getDEPT_NM());
		System.out.println("businessStateJinhaengHyunhwangDomain.getDEPT_CD() : " + businessStateJinhaengHyunhwangDomain.getDEPT_CD());
		businessStateJinhaengHyunhwangDomain.setACT_STAT("1");//미승인
		List<BusinessStateJinhaengHyunhwangDomain> meSeunginSangtaeList = businessStateHyunhwangMapper.getJinhaengSangtaeList(businessStateJinhaengHyunhwangDomain);
		businessStateJinhaengHyunhwangDomain.setACT_STAT("2");//진행
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengSangtaeList = businessStateHyunhwangMapper.getJinhaengSangtaeList(businessStateJinhaengHyunhwangDomain);
		System.out.println("jinhaengSangtaeList : " + jinhaengSangtaeList);
		map.put("jinhaengSangtaeList", jinhaengSangtaeList);
		System.out.println("meSeunginSangtaeList : " + meSeunginSangtaeList);
		map.put("meSeunginSangtaeList", meSeunginSangtaeList);
		return map;
	}

	//01.03.05.사업성분석검토현황-진행현황-현재 사업성 검토 조회   
	/* @param  BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain
	 * @brief  businessStateHyunhwangMapper내 getJinhaengSangtaeInfo, getJinhaengSangtaeInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> hyunjaeJinhaengInfoProcess(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<BusinessStateJinhaengHyunhwangDomain> hyunjaeInfo = businessStateHyunhwangMapper.getHyunjaeJinhaengInfo();
		//System.out.println("hyunjaeInfo :" + hyunjaeInfo);
		map.put("hyunjaeInfo", hyunjaeInfo);
		return map;
	}
	
	//01.03.05.사업성분석검토현황-진행현황-현재 사업성 검토 조회   
	/* @brief  businessStateHyunhwangMapper내 getJinhaengSangtaeInfo, getJinhaengSangtaeInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> jinhaengInfoProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		if(businessStateJinhaengHyunhwangDomain.getDEPT_CD() == null) {
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7500");
		}		
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengInfo = businessStateHyunhwangMapper.getJinhaengSangtaeInfo(businessStateJinhaengHyunhwangDomain);
		//System.out.println("jinhaengInfo :" + jinhaengInfo);
		map.put("jinhaengInfo", jinhaengInfo);
		return map;
	}
	
	//01.03.05.사업성분석검토현황-종료현황-본부별 사업성검토 리스트 
	/* @brief  businessStateHyunhwangMapper내 getJinhaengSangtaeInfo, getJinhaengSangtaeInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> bonbuBusinessEndListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		if(businessStateJinhaengHyunhwangDomain.getDEPT_CD() == null && businessStateJinhaengHyunhwangDomain.getEND_DATE() == null) {
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7500");
			SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy", Locale.KOREA );
			Date date = new Date ();
			String time = mSimpleDateFormat.format(date);
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList1 = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl1 = 0;
			int sumBiz11 = 0;
			int sumBiz21 = 0;
			for(int i=0; i<businessEndList1.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList11 = businessEndList1.get(i);
				sumTotl1 += Integer.parseInt(businessEndList11.getTOTL());
				sumBiz11 += Integer.parseInt(businessEndList11.getBIZ1());
				sumBiz21 += Integer.parseInt(businessEndList11.getBIZ2());
				//System.out.println("sumTotl1 :" + sumTotl1);
			}
			/*
			 * List<BusinessStateJinhaengHyunhwangDomain> yearlyBusinessList =
			 * businessStateHyunhwangMapper.getYearlyBusinessList(
			 * businessStateJinhaengHyunhwangDomain); map.put("yearlyBusinessList",
			 * yearlyBusinessList);
			 */
			map.put("sumTotl1", sumTotl1);
			map.put("sumBiz11", sumBiz11);
			map.put("sumBiz21", sumBiz21);
			map.put("businessEndList1", businessEndList1);
			
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7600");
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList2 = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl2 = 0;
			int sumBiz12 = 0;
			int sumBiz22 = 0;
			for(int i=0; i<businessEndList2.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList22 = businessEndList2.get(i);
				sumTotl2 += Integer.parseInt(businessEndList22.getTOTL());
				sumBiz12 += Integer.parseInt(businessEndList22.getBIZ1());
				sumBiz22 += Integer.parseInt(businessEndList22.getBIZ2());
				//System.out.println("sumTotl2 :" + sumTotl2);
			}
			map.put("sumTotl2", sumTotl2);
			map.put("sumBiz12", sumBiz12);
			map.put("sumBiz22", sumBiz22);
			map.put("businessEndList2", businessEndList2);
			
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7700");
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList3 = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl3 = 0;
			int sumBiz13 = 0;
			int sumBiz23 = 0;
			for(int i=0; i<businessEndList3.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList33 = businessEndList3.get(i);
				sumTotl3 += Integer.parseInt(businessEndList33.getTOTL());
				sumBiz13 += Integer.parseInt(businessEndList33.getBIZ1());
				sumBiz23 += Integer.parseInt(businessEndList33.getBIZ2());
				//System.out.println("sumTotl3 :" + sumTotl3);
			}
			map.put("sumTotl3", sumTotl3);
			map.put("sumBiz13", sumBiz13);
			map.put("sumBiz23", sumBiz23);
			map.put("businessEndList3", businessEndList3);
			
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7800");
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList4 = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl4 = 0;
			int sumBiz14 = 0;
			int sumBiz24 = 0;
			for(int i=0; i<businessEndList4.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList44 = businessEndList4.get(i);
				sumTotl4 += Integer.parseInt(businessEndList44.getTOTL());
				sumBiz14 += Integer.parseInt(businessEndList44.getBIZ1());
				sumBiz24 += Integer.parseInt(businessEndList44.getBIZ2());
				//System.out.println("sumTotl4 :" + sumTotl4);
			}
			map.put("sumTotl4", sumTotl4);
			map.put("sumBiz14", sumBiz14);
			map.put("sumBiz24", sumBiz24);
			map.put("businessEndList4", businessEndList4);
			
			businessStateJinhaengHyunhwangDomain.setDEPT_CD("7900");
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList5 = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl5 = 0;
			int sumBiz15 = 0;
			int sumBiz25 = 0;
			for(int i=0; i<businessEndList5.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList55 = businessEndList5.get(i);
				sumTotl5 += Integer.parseInt(businessEndList55.getTOTL());
				sumBiz15 += Integer.parseInt(businessEndList55.getBIZ1());
				sumBiz25 += Integer.parseInt(businessEndList55.getBIZ2());
				//System.out.println("sumTotl5 :" + sumTotl5);
			}
			map.put("sumTotl5", sumTotl5);
			map.put("sumBiz15", sumBiz15);
			map.put("sumBiz25", sumBiz25);
			map.put("businessEndList5", businessEndList5);
						
			return map;
		} else {
			//System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
			List<BusinessStateJinhaengHyunhwangDomain> businessEndList = businessStateHyunhwangMapper.getbonbuBusinessEndList(businessStateJinhaengHyunhwangDomain);
			//System.out.println("businessEndList :" + businessEndList);
			int sumTotl = 0;
			int sumBiz1 = 0;
			int sumBiz2 = 0;
			for(int i=0; i<businessEndList.size(); i++) {
				BusinessStateJinhaengHyunhwangDomain businessEndList2 = businessEndList.get(i);
				sumTotl += Integer.parseInt(businessEndList2.getTOTL());
				sumBiz1 += Integer.parseInt(businessEndList2.getBIZ1());
				sumBiz2 += Integer.parseInt(businessEndList2.getBIZ2());
			}
			map.put("sumTotl", sumTotl);
			map.put("sumBiz1", sumBiz1);
			map.put("sumBiz2", sumBiz2);
			map.put("businessEndList", businessEndList);
			
			
			return map;
		}		
	}
	//01.03.05.사업성분석검토현황-종료현황-본부별 사업성검토 리스트 
	/* @brief  businessStateHyunhwangMapper내 getJinhaengSangtaeInfo, getJinhaengSangtaeInfo메서드 호출
	 * @return  Map<String, Object> map
	 */	
	public Map<String, Object> jinhaengSangtaeEndListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		if(businessStateJinhaengHyunhwangDomain.getEND_DATE() == null) {
			SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy", Locale.KOREA );
			Date date = new Date ();
			String time = mSimpleDateFormat.format(date);
			businessStateJinhaengHyunhwangDomain.setEND_DATE("2018");
		}		
		System.out.println("businessStateJinhaengHyunhwangDomain :" + businessStateJinhaengHyunhwangDomain);
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengEndList = businessStateHyunhwangMapper.getJinhaengSangtaeEndList(businessStateJinhaengHyunhwangDomain);
		System.out.println("jinhaengEndList :" + jinhaengEndList);
		map.put("jinhaengEndList", jinhaengEndList);
		return map;
	}
}
