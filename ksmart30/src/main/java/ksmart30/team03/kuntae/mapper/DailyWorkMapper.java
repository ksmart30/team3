package ksmart30.team03.kuntae.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.kuntae.domain.DailyWorkRequest;



@Mapper
public interface DailyWorkMapper {	
	//4.1 일일 근무 현황 리스트 출력
	 List<Map<String,Object>> getDayList1(DailyWorkRequest vo);
	

}
