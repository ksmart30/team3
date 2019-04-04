package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.ResultList;
@Mapper
public interface ResultGraphMapper {
	//M/H 계획/실적 그래프 화면에 프로젝트 리스트(왼쪽) 뿌려주기
	List<ResultList> getResultGraphList();
	
}
