package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.KuntaeSchedule;
import ksmart30.team00.baseinfo.mapper.KuntaeScheduleMapper;

@Service
public class KuntaeScheduleService {
    @Autowired KuntaeScheduleMapper kuntaeScheduleMapper;

    // 10.3.5.1 근태월력표 리스트(왼쪽)
    public List<KuntaeSchedule> getKuntaeScheduleList(KuntaeSchedule toDay) {
        System.out.println("(S) 10.3.5.1 근태월력표 리스트와 달력 getKuntaeScheduleList()");
        List<KuntaeSchedule> kuntaeList = kuntaeScheduleMapper.getKuntaeScheduleList(toDay);
        System.out.println("(M) 10.3.5.1 근태월력표 리스트와 달력 쿼리 완료");
        return kuntaeList;
    }

    // 10.3.5.2 근태월력표 검색
    public List<KuntaeSchedule> getKuntaeScheduleCalendar(KuntaeSchedule toDay) {
        System.out.println("(S) 10.3.5.2 근태월력표 검색 getKuntaeScheduleCalendar()");
        List<KuntaeSchedule> kuntaeCalendar = kuntaeScheduleMapper.getKuntaeScheduleSearch(toDay);
        System.out.println("(M) 10.3.5.2 근태월력표 검색 쿼리 완료");
        return kuntaeCalendar;
    }
}
