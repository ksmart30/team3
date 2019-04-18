package ksmart30.team03.kuntae.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import ksmart30.team03.kuntae.domain.WorkTimeSingleList;

@Mapper
public interface WorkTimeMapper {
	// 5.3 출퇴근기록부(개인별) List 출력
	/* List<WorkTimeSingleList> getRecordSingleList(); */
	
	// 출 퇴근 기록부(개인별) 사원번호 검색
	List<WorkTimeSingleList> getRecordSingleNoSearch(String EMP_NO);
	
	// 출 퇴근 기록부(개인별) 이름 검색
	List<WorkTimeSingleList> getRecordSingleNameSearch(String KOR_NM);
	
	// 출 퇴근 기록부 (Single, Total) 날짜 검색
	List<WorkTimeSingleList> getRecordSingleDateSearch(String WORK_DT, String END_DT);
	
	// 출 퇴근 기록부(Total) 사원번호 검색
	List<WorkTimeSingleList> getRecordTotalNoSearch(String EMP_NO);
		
	// 출 퇴근 기록부(Total) 당일 출 퇴근 명단 출력
	List<WorkTimeSingleList> getRecordTotalList();
	
	// 출 퇴근 기록부(Total) 전체 검색 
 	List<WorkTimeSingleList> getRecordTotalSearch(String WORK_DT, String END_DT, String EMP_NO);
 	
 	// 전체 검색(검색조건들을 vo로 받음)
 	List<Map<String, Object>> getRecordTotal(WorkTimeSingleList vo);
	
 	// 출퇴근 정정신청 List가져오기
 	List<WorkTimeSingleList> getWorkTimeView();
 	
 	// 출퇴근 정정신청  List 이름 검색
 	List<WorkTimeSingleList> getWorkTimeNameSearchView(String KOR_NM);
}

