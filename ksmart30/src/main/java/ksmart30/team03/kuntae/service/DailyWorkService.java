package ksmart30.team03.kuntae.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.DailyWorkRequest;
import ksmart30.team03.kuntae.mapper.DailyWorkMapper;

@Service
public class DailyWorkService {
	@Autowired private DailyWorkMapper dailyWorkMapper;
	
	public  List<Map<String,Object>> getDayList1(DailyWorkRequest vo){
		System.out.println("SERVICE : 일일근무현황 검색LIST");
		return dailyWorkMapper.getDayList1(vo);
	}

}
