package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.mapper.ResultGraphMapper;

@Service
public class ResultGraphService {
		@Autowired private ResultGraphMapper resultGraphMapper;
	
		
	//5.2.1 M/H계획 실적 그래프 리스트 출력
	public List<ResultList> getResultGraphList() {
		System.out.println("SERVICE : M/H계획 실적 그래프 리스트 출력");
		return resultGraphMapper.getResultGraphList();
	}
	//5.2.1M/H 계획 그래프 차트에 입력될 값 출력
	public List<ResultList> getResultGraph(String pjt_cd) {
		System.out.println("SERVICE : M/H계획 실적 그래프 값 출력");
		return resultGraphMapper.getResultGraph(pjt_cd);
	}
	//5.2.1 M/H 계획 그래프 차트에 입력될 값 출력
		public List<ResultList> getResultGraph2(String pjt_cd) {
			System.out.println("SERVICE : M/H계획 실적 그래프 값 출력");
			return resultGraphMapper.getResultGraph2(pjt_cd);
		}
	
	
}
