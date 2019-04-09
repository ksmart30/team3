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
        System.out.println("(S) 10.3.5.1 근태월력표 리스트(왼쪽) getKuntaeScheduleList()");
        List<KuntaeSchedule> kuntaeList = kuntaeScheduleMapper.getKuntaeScheduleList(toDay);
        System.out.println("(M) 10.3.5.1 근태월력표 리스트(왼쪽) 쿼리 완료");
        return kuntaeList;
    }

    // 10.3.5.2 근태월력표 달력(오른쪽)
    public List<KuntaeSchedule> getKuntaeScheduleCalendar(KuntaeSchedule toDay) {
        System.out.println("(S) 10.3.5.2 근태월력표 달력(오른쪽) getKuntaeScheduleCalendar()");
        List<KuntaeSchedule> kuntaeCalendar = kuntaeScheduleMapper.getKuntaeScheduleCalendar(toDay);
        System.out.println("(M) 10.3.5.2 근태월력표 달력(오른쪽) 쿼리 완료");
        return kuntaeCalendar;
    }
}
