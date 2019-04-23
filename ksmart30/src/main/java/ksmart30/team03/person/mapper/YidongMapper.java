package ksmart30.team03.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.Yidong;

@Mapper
public interface YidongMapper {
	List<Yidong> getYidongList();
	List<Yidong> getYidongList2(String emp_no);
	List<Yidong> getYidongList3(String emp_no);
	List<Yidong> searchYidongList(String KOR_NM);
	List<Map<String, Object>> appGb();
	int addYidongList(Yidong yidong);
}
