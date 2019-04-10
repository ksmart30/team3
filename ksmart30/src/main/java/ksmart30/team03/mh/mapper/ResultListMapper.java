package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ResultListMapper {
	//M/H실적(월별) 개인 리스트
	List<Result> getresultListView();
}
