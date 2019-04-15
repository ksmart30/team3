package ksmart30.team03.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.domain.YidongSearch;

@Mapper
public interface YidongRegisterMapper {
	//인사발령대장 list 출력
	List<Yidong> getYidongRegister();
	//인사발령대장 검색 list출력(ajax)
	List<Map<String,Object>> searchYidongRegister(YidongSearch vo);
	List<Map<String,Object>> searchYidongRegister2(YidongSearch vo);
}
