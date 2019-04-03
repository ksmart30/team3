package com.cafe24.ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team03.mh.vo.ResultList;

@Mapper
public interface ResultNugaeMapper {

	//프로젝트 코드pjtcd 출력 메서드
		List<ResultList> getPjtcd();
}
