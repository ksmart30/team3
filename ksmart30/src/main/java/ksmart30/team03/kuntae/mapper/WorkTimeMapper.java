package ksmart30.team03.kuntae.mapper;

import java.util.List;

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
	
	// 출 퇴근 기록부(개인별) 날짜 검색
	List<WorkTimeSingleList> getRecordSingleDateSearch(String WORK_DT, String END_DT);
	
	// 출 퇴근 기록부(Total) 사원번호 검색
	List<WorkTimeSingleList> getRecordTotalNoSearch(String EMP_NO);
		
	// 출 퇴근 기록부(Total) 당일 출 퇴근 명단 출력
	List<WorkTimeSingleList> getRecordTotalList();

	
}

