package ksmart30.team03.mh.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;
import ksmart30.team03.mh.domain.ResultPersonList;
import ksmart30.team03.mh.mapper.ResultListMapper;

@Service
public class ResultListService {
	@Autowired
	private ResultListMapper resultListMapper ; 
	// M/H실적(월별) 개인 리스트
	public List<ResultPersonList> getresultListView(){
		System.out.println("service getresultListView 요청");
		return resultListMapper.getresultListView();
		
	}
	
	//M/H실적(월별) 개인 리스트 사원번호 검색 
	public List<Map<String,Object>> getApprovalSearchName(ResultPersonList resultPersonList){
		List<Map<String,Object>> vo = resultListMapper.getResultSearchName(resultPersonList);
		System.out.println("service getApprovalSearchName 요청");
		/*
		 * if(resultPersonList.getEMP_NO() =="" && resultPersonList.getWORK_YM()=="" ||
		 * resultPersonList.getEMP_NO() !="" && resultPersonList.getWORK_YM()=="" ||
		 * resultPersonList.getEMP_NO() =="" && resultPersonList.getWORK_YM()!="") { vo
		 * = resultListMapper.getResultSearchName2(resultPersonList); }else { vo =
		 * resultListMapper.getResultSearchName(resultPersonList); }
		 */
		return vo;
	}
	//M/H실적(월별) 개인 리스트  요일별 표시
	public List<KuntaeSchedule> getResultCalendar(){
		System.out.println("service getResultCalendar  요청");
		return resultListMapper.getResultCalendar();		
	}
}
