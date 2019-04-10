package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.mapper.ResultListMapper;

@Service
public class ResultListService {
	@Autowired
	private ResultListMapper resultListMapper ; 
	// M/H실적(월별) 개인 리스트
	public List<Result> getresultListView(){
		System.out.println("service getresultListView 요청");
		return resultListMapper.getresultListView();
		
	}
}
