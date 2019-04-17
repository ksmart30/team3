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
	
	// 휴가신청 List
	/*
	 * public List<BreakApply> getBreakApplyList(){
	 * System.out.println("S : 휴가신청 List"); return
	 * breakApplyMapper.getBreakApplyList(); }
	 */
	
	// 휴가신청 List Ajax
	public List<Map<String, Object>> getBreakApplyList(BreakApply vo){
		System.out.println("S : 휴가 신청 List Ajax");
		List<Map<String, Object>> data = breakApplyMapper.getBreakApplyList(vo);
		System.out.println("S : data =>"+ data);
		return data;
	}
	
}
