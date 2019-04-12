package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.TotalCode;

/*
 * @file    TotalCodeMapper.java
 * @brief   TotalCodeMapper
 * @author  ksmart30 HSY
 */

@Mapper
public interface TotalCodeMapper {
	List<TotalCode> totalCodeTreeSelect();
	List<TotalCode> totalCodeClassifySelect(String LEVEL1_NM);
}
