package ksmart30.team03.mh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.Result;
import ksmart30.team03.mh.mapper.ApprovalMapper;

@Service
public class ApprovalService {
	@Autowired
	private ApprovalMapper approvalMapper;
	//5.2  실적 승인(List)
	public List<Result> approvalSearchView(){
		System.out.println("approvalSearchView 요청");
		return approvalMapper.getapprovalSearchView();	
	}
	
}
