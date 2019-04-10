package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;

@Mapper
public interface KuntaeScheduleMapper {

    // 10.3.5.1 근태월력표 리스트와 달력
    List<KuntaeSchedule> getKuntaeScheduleList(KuntaeSchedule toDay);

    // 10.3.5.2 근태월력표 검색
    List<KuntaeSchedule> getKuntaeScheduleSearch(KuntaeSchedule toDay);
}
