package ksmart30.team03.mh.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ApprovalMapper {
	//5.2  실적 승인(List)
	List<Result> getApprovalSearchView();
	
	//5.2 실적 승인(List)검색
	// 검색이 있을때
	List<Map<String,Object>> getApprovalSearchDate(Result result);
	// 검색이 없을때
	List<Map<String,Object>> getApprovalSearchDate2(Result result); 
}
