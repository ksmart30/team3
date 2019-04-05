package ksmart30.team03.kuntae.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.kuntae.domain.WorkTimeSingleList;

@Mapper
public interface WorkTimeMapper {
	// 5.3 출퇴근기록부(개인별) List 출력
	List<WorkTimeSingleList> getRecordSingleList();
}
