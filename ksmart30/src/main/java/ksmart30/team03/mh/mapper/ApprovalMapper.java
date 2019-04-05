package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ApprovalMapper {
	//5.2  실적 승인(List)
	List<Result> getapprovalSearchView();
	
	//5.2 실적 승인(List)검색
	List<Result> getapprovalSearch();
}
