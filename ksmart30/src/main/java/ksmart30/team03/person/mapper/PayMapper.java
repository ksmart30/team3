package ksmart30.team03.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.PayGiveTake;

@Mapper
public interface PayMapper {

    // 1. 급여 입력 및 계산조회
    List<PayGiveTake> getPersonPayCalList(PayGiveTake payGiveTake);

}
