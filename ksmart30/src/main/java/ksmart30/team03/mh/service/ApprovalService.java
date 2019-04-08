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
		System.out.println("실적승인 approvalSearchView 요청");
		return approvalMapper.getApprovalSearchView();	
	}
	public List<Result> getApprovalSearchDate(String WORK_DT) {
		System.out.println("실적승인 getApprovalSearchDate 날짜검색요청");
		String Search_WORK_DT = WORK_DT.substring(0,4)+WORK_DT.substring(5, 7)+WORK_DT.substring(8, 10);
		System.out.println(Search_WORK_DT);
		return approvalMapper.getApprovalSearchDate(Search_WORK_DT);
	}
	
}
