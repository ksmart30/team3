package ksmart30.team03.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.Yidong;

@Mapper
public interface YidongRegisterMapper {
	List<Yidong> getYidongRegister();
}
