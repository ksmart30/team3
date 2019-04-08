package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.School;
import ksmart30.team00.baseinfo.mapper.SchoolMapper;

@Service
public class SchoolService {
    @Autowired SchoolMapper schoolMapper;

    // 10.3.3.1 학교코드 조회
    public List<School> getSchoolList() {
        System.out.println("(S) 10.3.3.1 학교코드 조회 schoolListView()");
        // 1. Mapper 실행 (결과값 : schoolList(학교정보 리스트))
        List<School> schoolList = schoolMapper.getSchoolList();
        System.out.println("(M) 10.3.3.1 학교코드 조회 쿼리실행 완료");
        return schoolList;
    }
}
