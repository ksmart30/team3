package ksmart30.team00.baseinfo.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Insure;

@Mapper
public interface InsureMapper {

    // 10.2.9 4대보험 요율 정보 가져오기
    Insure getFourInsure(Insure insure);

}
