package ksmart30.team03.mh.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;
import ksmart30.team03.mh.domain.ResultPersonList;

@Mapper
public interface ResultListMapper {
	//M/H실적(월별) 개인 리스트
	List<ResultPersonList> getresultListView();
	
	//M/H실적(월별) 개인 리스트 사원번호 검색 
	List<Map<String,Object>> getResultSearchName(ResultPersonList resultPersonList);
	//M/H실적(월별) 개인 리스트  요일별 표시
	List<KuntaeSchedule> getResultCalendar();
	
	// M/H실적(월별) 개인 리스트 사원번호 검색값이 없을때 
		//List<Map<String,Object>> getResultSearchName2(ResultPersonList resultPersonList);
}
