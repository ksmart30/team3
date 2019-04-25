package ksmart30.team03.kuntae.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.kuntae.domain.BreakApply;

@Mapper
public interface BreakApplyMapper {
	
	// 4.05 휴가 신청 List 사용 위해 검색조건을 vo로 받음
	List<Map<String, Object>> getBreakApplyList(BreakApply vo);	
	
	// 4.05 휴가 신청 List detail
	List<Map<String, Object>> getBreakApplyList2(BreakApply vo);	
}
