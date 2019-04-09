package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;

@Mapper
public interface KuntaeScheduleMapper {

    // 10.3.5.1 근태월력표 리스트(왼쪽)
    List<KuntaeSchedule> getKuntaeScheduleList(KuntaeSchedule toDay);

    // 10.3.5.2 근태월력표 달력(오른쪽)
    List<KuntaeSchedule> getKuntaeScheduleCalendar(KuntaeSchedule toDay);
}
