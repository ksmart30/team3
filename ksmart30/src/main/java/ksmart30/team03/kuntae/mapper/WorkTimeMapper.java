package ksmart30.team03.kuntae.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.kuntae.domain.WorkTime;
import ksmart30.team03.kuntae.domain.WorkTimeSingleList;

@Mapper
public interface WorkTimeMapper {
	
	// 4.03 출 퇴근 기록부(개인별) 사원번호 검색
	List<WorkTimeSingleList> getRecordSingleNoSearch(String EMP_NO);
	
	// 4.03 출 퇴근 기록부(개인별) 이름 검색
	List<WorkTimeSingleList> getRecordSingleNameSearch(String KOR_NM);
	
	// 4.02,03 출 퇴근 기록부 (Single, Total) 날짜 검색
	List<WorkTimeSingleList> getRecordSingleDateSearch(String WORK_DT, String END_DT);
	
	// 4.02 출 퇴근 기록부(Total) 사원번호 검색
	List<WorkTimeSingleList> getRecordTotalNoSearch(String EMP_NO);
		
	// 4.02 출 퇴근 기록부(Total) 당일 출 퇴근 명단 출력
	List<WorkTimeSingleList> getRecordTotalList();
	
	// 4.02 출 퇴근 기록부(Total) 전체 검색 
 	List<WorkTimeSingleList> getRecordTotalSearch(String WORK_DT, String END_DT, String EMP_NO);
 	
 	// 전체 검색(검색 조건들을 vo로 받음)
 	List<Map<String, Object>> getSingleListDomain(WorkTimeSingleList vo);
	
 	// 4.04 출퇴근 정정신청 List가져오기
 	List<WorkTime> getWorkTimeView();
 	
 	// 4.04 출퇴근 정정신청  List 이름 검색
 	List<WorkTimeSingleList> getWorkTimeSearchView(String KOR_NM, String WORK_DT, String WORK_DT1);
 	
 	// 4.04 출퇴근 정정 신청 한 행의 지각 횟수와 지각 누계 정보 가져오기
 	List<WorkTime> getWorkTimeJigakSearch(String EMP_NO);
 	
 	// 4.05 출퇴근 리스트 검색
 	List<WorkTimeSingleList> getCheckOn(WorkTimeSingleList vo);
 	
 	// 4.05 출퇴근 입력처리
 	int addCheckOn(WorkTimeSingleList vo);
 	
 	// 4.05 퇴근 처리 중복 확인
 	List<WorkTimeSingleList> getCheckOff(WorkTimeSingleList vo);
 	
 	// 4.05 출퇴근 퇴근처리
 	int updateCheckOff(WorkTimeSingleList vo);

 	
}

