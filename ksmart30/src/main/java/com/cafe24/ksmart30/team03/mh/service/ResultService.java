package com.cafe24.ksmart30.team03.mh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.ksmart30.team03.mh.mapper.ResultMapper;
import com.cafe24.ksmart30.team03.mh.vo.Result;

@Service
@Transactional
public class ResultService {
	@Autowired
	private ResultMapper resultMapper;
	
	//M/H 입력 
	public int addResult(Result result) {
		return resultMapper.resultWriteView(result);
	}
}
