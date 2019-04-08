package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.mapper.ResultMapper;

@Service
@Transactional
public class ResultService {
	@Autowired
	private ResultMapper resultMapper;
	
	//M/H 입력 
	public int addResult(Result result) {
		return resultMapper.resultWriteView(result);
	}
	//M/H 실적 리스트
	public List<Result> getListView(){
		return resultMapper.getListView();
		
	}
}
