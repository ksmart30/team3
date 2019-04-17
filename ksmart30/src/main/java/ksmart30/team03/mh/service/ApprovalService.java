package ksmart30.team03.mh.service;

import java.util.List;
import java.util.Map;

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
	//5.2 실적 승인(List) 날짜검색
	public List<Map<String,Object>> getApprovalSearchDate(Result result) {
		System.out.println("실적승인 getApprovalSearchDate 날짜검색요청");
		List<Map<String,Object>> vo = approvalMapper.getApprovalSearchDate(result);
		if(result.getWORK_DT() =="" && result.getWORK_DT2()=="" || 
		   result.getWORK_DT()!= "" && result.getWORK_DT2()=="" ||
		   result.getWORK_DT() =="" && result.getWORK_DT2()!= "" ) {
			vo = approvalMapper.getApprovalSearchDate2(result);
		}else {
			 vo = approvalMapper.getApprovalSearchDate(result); 
		}
		return vo ;
		
	}
	
}
