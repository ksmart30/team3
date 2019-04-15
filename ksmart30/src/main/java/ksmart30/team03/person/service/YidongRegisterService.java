package ksmart30.team03.person.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.domain.YidongSearch;
import ksmart30.team03.person.mapper.YidongRegisterMapper;

@Service
public class YidongRegisterService {
@Autowired YidongRegisterMapper yidongRegisterMapper;
	//인사발령대장 list출력
	public List<Yidong> getYidongRegister(){
		System.out.println("getYidongRegister 메서드 호출 서비스");
		return yidongRegisterMapper.getYidongRegister();
	}
	//인사발령대장 검색 list출력(ajax)
	public List<Map<String,Object>> searchYidongRegister(YidongSearch vo){
		System.out.println("searchYidongRegister 메서드 호출 서비스");
		List<Map<String,Object>> result = yidongRegisterMapper.searchYidongRegister(vo);
		//날짜 값이 비었으면 승인여부로만 출력
		if(vo.getAPPOINT_DT() =="" && vo.getAPPOINT_DT2()==""||
			vo.getAPPOINT_DT() !="" && vo.getAPPOINT_DT2()==""||
			vo.getAPPOINT_DT() =="" && vo.getAPPOINT_DT2()!="") {
			System.out.println("날짜값 null인 경우 승인여부로 출력");
			result = yidongRegisterMapper.searchYidongRegister2(vo);
		}else {
			result = yidongRegisterMapper.searchYidongRegister(vo);
		}
		
		System.out.println("인사발령대장 list 검색 결과 : "+result);
		return result;
	}
}
