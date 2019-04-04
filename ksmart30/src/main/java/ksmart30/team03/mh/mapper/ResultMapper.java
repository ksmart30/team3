package ksmart30.team03.mh.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ResultMapper {
	//M/H 입력
	int resultWriteView(Result result);
}
