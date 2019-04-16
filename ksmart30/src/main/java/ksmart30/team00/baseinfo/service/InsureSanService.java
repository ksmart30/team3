package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.InsureSan;
import ksmart30.team00.baseinfo.mapper.InsureSanMapper;

@Service
public class InsureSanService {
    @Autowired InsureSanMapper insureSanMapper;

    // 10.2.9.5 산재보험 대분류 리스트 가져오기
    public List<InsureSan> getInsureSanjeLargeList() {
        System.out.println("(S) 10.2.9.5 산재보험 대분류 리스트 가져오기 getInsureSanjeLargeList()");
        // 1. Mapper 요청 (결과값 : 산재보험 대분류 리스트)
        List<InsureSan> sanjeLargeList = insureSanMapper.getInsureSanjeLargeList();
        System.out.println("(M) 10.2.9.5 산재보험 대분류 리스트 가져오기 쿼리 성공");
        // 2. 결과값 확인
        System.out.println("가져온 산재보험 대분류 리스트 (1행): " + sanjeLargeList.get(0));
        // 3. 리턴
        return sanjeLargeList;
    }

    // 10.2.9.6 산재보험 중분류 리스트 가져오기
    public List<InsureSan> getInsureSanjeMiddleList(InsureSan insureSan) {
        System.out.println("(S) 10.2.9.6 산재보험 중분류 리스트 가져오기 getInsureSanjeMiddleList()");
        // 1. Mapper 요청 (결과값 : 산재보험 중분류 리스트)
        List<InsureSan> sanjeMiddleList  = insureSanMapper.getInsureSanjeMiddleList(insureSan);
        System.out.println("(M) 10.2.9.6 산재보험 중분류 리스트 가져오기 쿼리 성공");
        // 2. 결과값 확인
        System.out.println("가져온 산재보험 중분류 리스트 (1행) : " + sanjeMiddleList.get(0));
        // 3. 리턴
        return sanjeMiddleList;
    }

}
