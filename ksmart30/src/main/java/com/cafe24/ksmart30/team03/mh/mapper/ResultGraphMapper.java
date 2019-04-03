package com.cafe24.ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team03.mh.vo.ResultList;
@Mapper
public interface ResultGraphMapper {
	//M/H 계획/실적 그래프 화면에 프로젝트 리스트(왼쪽) 뿌려주기
	List<ResultList> resultSelect();
	
}
