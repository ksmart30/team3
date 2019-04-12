package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Gapguense;

@Mapper
public interface GapguenseMapper {

    // 10.2.10.1 갑근세 세액 조견표 조회(결과값 : 갑근세 세액 조견표 리스트)
    List<Gapguense> getGapguenseList();
}
