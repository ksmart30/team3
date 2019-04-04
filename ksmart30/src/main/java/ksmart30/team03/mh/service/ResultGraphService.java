package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.mapper.ResultGraphMapper;

@Service
public class ResultGraphService {
		@Autowired private ResultGraphMapper resultGraphMapper;
	
		
	//M/H계획 실적 그래프 리스트 출력
	public List<ResultList> getResultGraphList() {
		System.out.println("SERVICE : M/H계획 실적 그래프 리스트 출력");
		return resultGraphMapper.getResultGraphList();
	}
	
}
