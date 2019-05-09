package ksmart30.team01.business.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team01.business.mapper.BusinessYesanInputMapper;

@Service
@Transactional
public class BusinessYesanInputService {
	
	@Autowired BusinessYesanInputMapper businessYesanInputMapper;
	
	public List<Map<String,String>> getDeptList(){
		return businessYesanInputMapper.getDeptList();
	}
	
	public List<Map<String,String>> getProjectList(Map<String,Object> searchMap){
		return businessYesanInputMapper.getProjectList(searchMap);
	}
	
	public List<Map<String,String>> getResultProjectList(Map<String,Object> searchMap){
		
		return businessYesanInputMapper.getResultProjectList(searchMap);
	}
	
	public List<Map<String,String>> getResultDeptList(Map<String,Object> searchMap){
	
		return businessYesanInputMapper.getResultEmpList(searchMap);
	}
	
	public Map<String,Object> getResultProject (String PJT_CD){
		
		return businessYesanInputMapper.getResultProject(PJT_CD);
	}
	public Map<String,Object> getProjectDetail (String PJT_CD){
		/*
		 * System.out.println(PJT_CD1+"<-service");
		 * System.out.println(businessYesanInputMapper.getProjectSchedule(PJT_CD1));
		 */
		
		  Map<String,Object> map = new HashMap<String,Object>(); 
		  map.put("schedule",businessYesanInputMapper.getProjectSchedule(PJT_CD));
		  map.put("mhPlan", businessYesanInputMapper.getProjectMhPlan(PJT_CD));
		  map.put("manufacture1Left", businessYesanInputMapper.getProjectJejo1Left(PJT_CD));
		  map.put("manufacture1Right",businessYesanInputMapper.getProjectJejo1Right(PJT_CD));
		  map.put("manufacture2", businessYesanInputMapper.getProjectJejo2(PJT_CD));
		  map.put("bizReport", businessYesanInputMapper.getProjectReport(PJT_CD));
		  
		  System.out.println(map.get("schedule"));
		  System.out.println(map.get("mhPlan"));
		  System.out.println(map.get("manufacture1Left"));
		  System.out.println(map.get("manufacture1Right"));
		  System.out.println(map.get("manufacture2"));
		  System.out.println(map.get("bizReport"));
		 
		return map;
	}
}
