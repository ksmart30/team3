package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.mapper.ResultNugaeMapper;

@Service
public class ResultNugaeService {
@Autowired ResultNugaeMapper resultNugeMapper;
	//list에 데이터 뿌려주기
	public List<ResultList> getResultNugaeList(){
		System.out.print("getResultNugaeList 메서드 호출(service)");
		return resultNugeMapper.getResultNugaeList();
	}
	public List<ResultList> getResultNugaeList2(String pjt_cd){
		System.out.print("getResultNugaeList2 메서드 호출(service)");
		return resultNugeMapper.getResultNugaeList2(pjt_cd);
	}
	
}
