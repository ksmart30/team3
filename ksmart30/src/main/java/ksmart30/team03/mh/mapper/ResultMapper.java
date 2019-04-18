package ksmart30.team03.mh.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.Result;

@Mapper
public interface ResultMapper {
	//M/H 입력
	int resultWriteView(Result result);
	
	//M/H 실적 리스트
	List<Result> getListView();
	
	//M/H 실적 리스트 검색
	//검색이 있을떄
	List<Map<String,Object>> getListSearch(Result result);
	//검색이 없을때
	List<Map<String,Object>> getListSearch2(Result result);
	
	//입력 할때 프로젝트 선택
	List<Result> getSelectListView();
}
