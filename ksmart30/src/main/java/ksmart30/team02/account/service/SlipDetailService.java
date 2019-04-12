package ksmart30.team02.account.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team02.account.mapper.SlipDetailMapper;

/*
 * @file    SlipDetailService.java
 * @brief   8.2 전표상세검색
 * @author  ksmart30 HSY
 */

@Service
@Transactional
public class SlipDetailService {
	@Autowired private SlipDetailMapper slipdetailmapper;
	
	// 8.2 전표상세검색
	/* @param   String account
	 * @brief   SlipDetailMapper 인터페이스 메서드 호출(계정과목리스트)후 List<Map<String,String>> controller에 객체 전달
	 * @return  List<Map<String,String>>
	 */
	public List<Map<String,String>> getAccountCode(String account){
		List<Map<String,String>> list = slipdetailmapper.getAccountCodeList(account);
		System.out.println(list.toString());
		return list;
	}
	
	// 8.2 전표상세검색
	/* @param   String dept
	 * @brief   SlipDetailMapper 인터페이스 메서드 호출(부서리스트)후 List<Map<String,String>> controller에 객체 전달
	 * @return  List<Map<String,String>>
	 */
	public List<Map<String,String>> getDeptCode(String dept){
		List<Map<String,String>> list = slipdetailmapper.getDeptCodeList(dept);
		System.out.println(list.toString());
		return list;
	}
	
	// 8.2 전표상세검색
	/* @param   String cust
	 * @brief   SlipDetailMapper 인터페이스 메서드 호출(거래처리스트)후 List<Map<String,String>> controller에 객체 전달
	 * @return  List<Map<String,String>>
	 */
	public List<Map<String,String>> getCustCode(String cust){
		List<Map<String,String>> list = slipdetailmapper.getCustCodeList(cust);
		System.out.println(list.toString());
		return list;
	}
	
	// 8.2 전표상세검색
	/* @param   String Map<String,Object> searchMap
	 * @brief   SlipDetailMapper 인터페이스 메서드 호출(조검검색조회리스트)후 List<Map<String,Object>> controller에 객체 전달
	 * @return  List<Map<String,Object>>
	 */
	public List<Map<String,Object>> getSlipList(Map<String,Object> searchMap){
		HashMap<String, Object> map = new HashMap<String, Object>();
		//전달된 Map->HashMap 다운캐스팅
		map.putAll(searchMap);
		List<Map<String,Object>> list = slipdetailmapper.getSlipList(map);
		System.out.println(list.toString()+"<--list 현재값");
		return list;
	}
}
