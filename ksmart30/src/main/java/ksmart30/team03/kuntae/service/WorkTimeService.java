package ksmart30.team03.kuntae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.WorkTimeSingleList;
import ksmart30.team03.kuntae.mapper.WorkTimeMapper;

@Service
public class WorkTimeService {
	@Autowired private WorkTimeMapper workTimeMapper;
	/*
	 * // 출퇴근(개인별) 리스트 출력 
	 * public List<WorkTimeSingleList> getRecordSingleList(){
	 * System.out.println("S : 출, 퇴근 기록부 (개인별)"); 
	 * return workTimeMapper.getRecordSingleList(); }
	 */
	
	// 출,퇴근 기록부(개인별) 사원번호 검색
	public List<WorkTimeSingleList> getRecordSingle(String EMP_NO){
		System.out.println("S : Single 사원번호 선택 EMP_NO =>"+EMP_NO);
		return workTimeMapper.getRecordSingleNoSearch(EMP_NO);
	}
	
	// 출,퇴근 기록부(개인별) 이름 검색
	public List<WorkTimeSingleList> getRecordSignleName(String KOR_NM){
		System.out.println("S : Single 이름 검색 KOR_NM =>"+ KOR_NM);
		return workTimeMapper.getRecordSingleNameSearch(KOR_NM);
	}
	
	// 출,퇴근 기록부(개인별) 날짜 검색
	public List<WorkTimeSingleList> getRecordSingleDateSearch(String WORK_DT, String END_DT){
		System.out.println("S : Single 시작 날짜 WORK_DT =>"+ WORK_DT + "끝난 날짜 END_DT =>" + END_DT);
		return workTimeMapper.getRecordSingleDateSearch(WORK_DT, END_DT);
	}
	
	// 출,퇴근 기록부(Total) 당일 출퇴근 명단 
	public List<WorkTimeSingleList> getRecordTotalList(){
		System.out.println("S : Total 당일 출퇴근 명단 화면");
		return workTimeMapper.getRecordTotalList();
	}
	
	
	// 출,퇴근 기록부(Total) 날짜 검색
	public List<WorkTimeSingleList> getRecordTotalNoSearch(String EMP_NO){
		System.out.println("S : Total 사원번호 선택 EMP_NO =>"+EMP_NO);
		return workTimeMapper.getRecordTotalNoSearch(EMP_NO);
	}
	
	// 
	
}
