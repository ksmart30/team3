package ksmart30.team03.mh.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart30.team03.mh.domain.ProjectEnd;


@Mapper
public interface ProjectEndMapper {
	//5.2.6 프로젝트 종료 프로젝트 list 출력 
	List<ProjectEnd> getManHourProjectEndList();
	//5.2.6 프로젝트 단계종료처리 list 중 사업성 검토 
	List<ProjectEnd> getManHourProjectEndBusinessManageList(ProjectEnd projectEnd);
	//5.2.6 프로젝트 단계종료처리 list 중 계약프로젝트 관리
	List<ProjectEnd> getManHourProjectEndProjectManageList(ProjectEnd projectEnd);
	//5.2.6 계약프로젝트, 사업성검토 종료구분 select box list 출력
	List<Map<String, Object>> endProjectGbListView();
}
