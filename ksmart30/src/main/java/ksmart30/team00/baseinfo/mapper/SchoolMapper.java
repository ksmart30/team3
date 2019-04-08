package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.School;

@Mapper
public interface SchoolMapper {
    
    // 10.3.3.1 학교코드 조회
    List<School> getSchoolList();
}
