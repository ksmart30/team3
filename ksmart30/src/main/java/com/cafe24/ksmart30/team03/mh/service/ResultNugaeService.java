package com.cafe24.ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team03.mh.mapper.ResultNugaeMapper;
import com.cafe24.ksmart30.team03.mh.vo.ResultList;

@Service
public class ResultNugaeService {
@Autowired ResultNugaeMapper resultNugeMapper;
	//list에 프로젝트코드pjt_cd 뿌려주기
	public List<ResultList> getPjtcd(){
		System.out.print("getPjtcd 메서드 호출(service)");
		return resultNugeMapper.getPjtcd();
	}
}
