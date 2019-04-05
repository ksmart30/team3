package ksmart30.team03.kuntae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.WorkTimeSingleList;
import ksmart30.team03.kuntae.mapper.WorkTimeMapper;

@Service
public class WorkTimeService {
	@Autowired private WorkTimeMapper workTimeMapper;
	// 출퇴근(개인별) 리스트 출력
	public List<WorkTimeSingleList> getRecordSingleList(){
		System.out.println("S : 출, 퇴근 기록부 (개인별)");
		return workTimeMapper.getRecordSingleList();
	}
}
