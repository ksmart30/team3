package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ResultMapper {
	//M/H 입력
	int resultWriteView(Result result);
	
	//M/H 실적 리스트
	List<Result> getListView();
}
