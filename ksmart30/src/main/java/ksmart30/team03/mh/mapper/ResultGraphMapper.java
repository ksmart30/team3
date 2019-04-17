package ksmart30.team03.mh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.mh.domain.ResultCost;
import ksmart30.team03.mh.domain.ResultList;
@Mapper
public interface ResultGraphMapper {
	//5.2.1 M/H 계획/실적 그래프 화면에 프로젝트 리스트(왼쪽) 뿌려주기
	List<ResultList> getResultGraphList();
	//5.2.1 M/H 계획/실적 그래프 화면에 프로젝트 리스트(왼쪽) 뿌려주기(날짜 검색 추가)
	List<ResultList> getResultGraphListDate(String CONTRACT_PRI1, String CONTRACT_PRI2);
	//5.2.1 M/H 계획 그래프 뿌려주기
	List<ResultList> getResultGraph(String pjt_cd);
	//5.2.1 M/H 실적 그래프 뿌려주기
	List<ResultList> getResultGraph2(String pjt_cd);
	
	//5.2.1 M/H 단계별 인건비 누계(계획) 그래프 뿌려주기
	List<ResultCost> getResultGraphPlanNugae(String pjt_cd); 
	//5.2.1 M/H 단계별 인건비 누계(실적) 그래프 뿌려주기
	List<ResultCost> getResultGraphResultNugae(String pjt_cd);
	
}
