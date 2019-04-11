package ksmart30.team03.kuntae.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.kuntae.domain.KuntaeSearch;

@Mapper
public interface KuntaeMapper {
	//근태현황(월) list 검색 후 출력(검색조건을 vo로 받는다)
	List<Map<String,Object>> getSearch(KuntaeSearch vo);
	
}
