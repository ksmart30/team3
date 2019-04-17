package ksmart30.team03.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.Yidong;

@Mapper
public interface YidongMapper {
	List<Yidong> getYidongList();
	List<Yidong> getYidongList2(String emp_no);
	List<Yidong> searchYidongList(String KOR_NM);
}
