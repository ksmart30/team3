package com.cafe24.ksmart30.team03.mh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team03.mh.vo.Result;

@Mapper
public interface ResultMapper {
	//M/H 입력
	int resultWriteView(Result result);
}
