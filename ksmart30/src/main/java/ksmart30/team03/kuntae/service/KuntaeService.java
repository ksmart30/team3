package ksmart30.team03.kuntae.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.KuntaeSearch;
import ksmart30.team03.kuntae.mapper.KuntaeMapper;

@Service
public class KuntaeService {
	@Autowired KuntaeMapper kuntaeMapper;
	//근태현황(월) list 검색 후 출력
	public List<Map<String,Object>> getSearch(KuntaeSearch vo){
		System.out.println("getSearch 메서드 호출(Service)");
		List<Map<String,Object>> result = kuntaeMapper.getSearch(vo);
		System.out.println("근태현황 검색 결과 : "+result);
		return result;
	}
	public List<Map<String,Object>> deptCd(){
		List<Map<String,Object>> result = kuntaeMapper.deptCd();
		return result;
	}
}
