package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.InsureSan;

@Mapper
public interface InsureSanMapper {

    // 1. 산재보험 대분류 리스트 가져오기
    List<InsureSan> getInsureSanjeLargeList();

    // 2. 산재보험 중분류 리스트 가져오기
    List<InsureSan> getInsureSanjeMiddleList(InsureSan insureSan);
}
