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
	
	//M/H 실적 디테일 출력
	List<Result> getResultListDetailView(String WORK_DT);
		
	//M/H ajax 실적 리스트 
	List<Map<String,Object>> getListView2(Result result);
	
	//M/H 입력 PJT 명 입력시 작업단계 자동 설정
	List<Map<String,Object>> getpjtSelectView(Result result);
	
	//M/H 입력 PJT 명 목록 가져오기
	List<Map<String,Object>> getSelectPjtNameView(Result result);
	
	//입력 할때 프로젝트 선택
	List<Result> getSelectListView();
	
}
