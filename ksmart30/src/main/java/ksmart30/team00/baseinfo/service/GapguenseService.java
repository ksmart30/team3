package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Gapguense;
import ksmart30.team00.baseinfo.mapper.GapguenseMapper;

@Service
public class GapguenseService {
    @Autowired GapguenseMapper gapguenseMapper;

    // 10.2.10.1 갑근세 세액 조견표 조회
    public List<Gapguense> getGapguenseList() {
        System.out.println("(S) 10.2.10.1 갑근세 세액 조견표 조회 getGapguenseList()");
        // 1. Mapper실행후 결과값을 리턴하기위해 List타입의 변수 선언
        List<Gapguense> gapguenseList = gapguenseMapper.getGapguenseList();
        System.out.println("(M) 10.2.10.1 갑근세 세액 조견표 조회 쿼리완료");
        return gapguenseList;
    }
}
