package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.ResultList;

@Mapper
public interface ResultNugaeMapper {

	//프로젝트 코드pjtcd 출력 메서드
		List<ResultList> getResultNugaeList();
}
