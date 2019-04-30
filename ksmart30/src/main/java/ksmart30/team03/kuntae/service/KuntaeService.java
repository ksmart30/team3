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
	//근태승인처리 검색
	public List<Map<String,Object>> getOkSearch(KuntaeSearch vo){
		System.out.println("getOkSearch 메서드 호출(Service)");
		List<Map<String,Object>> result = kuntaeMapper.getOkSearch(vo);
		if(vo.getFRDATE() =="" && vo.getTODATE()==""||
				vo.getFRDATE() !="" && vo.getTODATE()==""||
				vo.getFRDATE() =="" && vo.getTODATE()!="") {
				System.out.println("날짜값 null인 경우 나머지 입력값으로 출력");
				result = kuntaeMapper.getOkSearch2(vo);
			}else {
				result = kuntaeMapper.getOkSearch(vo);
			}
		System.out.println("근태승인처리 검색 list 결과 : "+result);
		return result;
		
	}
	//근태승인처리 클릭 시 정보 가져오기
	public List<Map<String,Object>> getOkSearch2(String EMP_NO, String APP_DATE){
		System.out.println("클릭 시 정보 가져오기 (Service)");
		return kuntaeMapper.getOkSearch3(EMP_NO,APP_DATE);
	}
	//근태승인처리 하기
	public int okViewApproval(String EMP_NO, String APP_DATE, String CONFIRM_YN){
		System.out.println("근태승인처리 하자 (Service)");
		int result=0;
		if(CONFIRM_YN=="" || CONFIRM_YN=="0") {
			System.out.println("근태승인 N일 때");
			result = kuntaeMapper.okViewApproval(EMP_NO,APP_DATE);
		}else {
			System.out.println("근태승인 Y일 때");
			result = 0;
		}
		return result;
	}
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
	public List<Map<String,Object>> appGb(){
		List<Map<String,Object>> result = kuntaeMapper.appGb();
		return result;
	}
}
