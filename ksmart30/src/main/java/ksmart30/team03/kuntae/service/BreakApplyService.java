package ksmart30.team03.kuntae.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.BreakApply;
import ksmart30.team03.kuntae.mapper.BreakApplyMapper;

@Service
public class BreakApplyService {
	@Autowired private BreakApplyMapper breakApplyMapper;

	// 4.05 휴가신청 List Ajax
	public List<Map<String, Object>> getBreakApplyList(BreakApply vo){
		System.out.println("S : 휴가 신청 List Ajax");
		List<Map<String, Object>> data = breakApplyMapper.getBreakApplyList(vo);
		System.out.println("S : data =>"+ data);
		return data;
	}
	
	// 4.05 휴가신청 List Detail
	public List<Map<String, Object>> getBreakApplyList2(BreakApply vo){
		System.out.println("S : 휴가 신청 List Detail");
		List<Map<String, Object>> data = breakApplyMapper.getBreakApplyList2(vo);
		System.out.println("S : data =>"+ data);
		return data;
	}
		
}
