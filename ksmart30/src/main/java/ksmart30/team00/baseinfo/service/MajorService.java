package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Major;
import ksmart30.team00.baseinfo.mapper.MajorMapper;

@Service
public class MajorService {
    @Autowired MajorMapper majorMapper;

    // 10.3.4.1 전공코드 조회
    public List<Major> getMajorList() {
        System.out.println("(S) 10.3.4.1 전공코드 조회 getMajorList()");
        // 1. Mapper 실행 (결과값 : majorList(전공정보 리스트))
        List<Major> majorList = majorMapper.getMajorList();
        System.out.println("(M) 10.3.4.1 전공코드 조회 쿼리실행 완료");
        return majorList;
    }
}
