package ksmart30.team01.business.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team01.business.mapper.BusinessYesanAdmitMapper;
import ksmart30.team01.business.mapper.BusinessYesanInputMapper;


@Service
@Transactional
public class BusinessYesanAdmitService {

@Autowired
BusinessYesanAdmitMapper businessYesanAdmitMapper;
@Autowired
BusinessYesanInputMapper businessYesanInputMapper;
	
	public List<Map<String,String>> getDeptList(){
		
		return businessYesanAdmitMapper.getDeptList();
	}

	public List<Map<String, String>> getProjectList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getProjectList(searchMap);
	}

	public List<Map<String, String>> getResultProjectList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getResultProjectList(searchMap);
	}

	public List<Map<String, String>> getResultDeptList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getResultEmpList(searchMap);
	}

	public Map<String, Object> getResultProject(String PJT_CD) {
		
		return businessYesanAdmitMapper.getResultProject(PJT_CD);
	}

	public Map<String, Object> getManufacture2(String PJT_CD) {
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


	  public int admitProcess(String PJT_CD) { 
		  System.out.println(PJT_CD+"<-- 맵퍼단계 전 파라미터");
		  return businessYesanAdmitMapper.admitProcess(PJT_CD);
	  }
}
