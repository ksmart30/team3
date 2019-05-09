package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessYesanAdmitMapper {
	List<Map<String,String>> getDeptList();

	List<Map<String, String>> getProjectList(Map<String, Object> searchMap);

	List<Map<String, String>> getResultProjectList(Map<String, Object> searchMap);

	List<Map<String, String>> getResultEmpList(Map<String, Object> searchMap);

	Map<String, Object> getResultProject(String PJT_CD);
	
	Map<String, Object> BusinessYesanSum(String PJT_CD);
	
	List<Map<String,Object>> getProjectJejo2 (String PJT_CD);
	
	List<Map<String,Object>> getProjectMhPlan (String PJT_CD);
	
	List<Map<String,Object>> getProjectJejo1Left (String PJT_CD);
	
	List<Map<String,Object>> getProjectJejo1Right (String PJT_CD);
	
	Map<String,Object> getProjectReport (String PJT_CD);

	int admitProcess(String PJT_CD);
}
