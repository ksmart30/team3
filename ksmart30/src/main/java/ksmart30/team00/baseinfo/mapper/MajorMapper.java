package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Major;

@Mapper
public interface MajorMapper {

    // 10.3.4.1 전공코드 조회
    List<Major> getMajorList();
}
