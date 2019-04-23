package ksmart30.team03.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.person.domain.PayGiveTake;
import ksmart30.team03.person.domain.PayMonth;
import ksmart30.team03.person.domain.PayYear;
import ksmart30.team03.person.mapper.PayMapper;

@Service
public class PayService {
    @Autowired PayMapper payMapper;

    // 6.4.1.2 급여 계산 및 등록조회
    public List<PayGiveTake> getPersonPayCalList(PayGiveTake payGiveTake) {
        System.out.println("(S) 6.4.1.2 급여 계산 및 등록조회 getPersonPayCalList()");
        // 1. Mapper 호출 (결과값 : 사원 급여급 정보)
        List<PayGiveTake> giveTakeList = payMapper.getPersonPayCalList(payGiveTake);
        System.out.println("(M) 6.4.1.2 급여 계산 및 등록조회 쿼리 성공");
        return giveTakeList;
    }

    // 6.4.1.3 급여 대장 검색 (월간)
    public List<PayMonth> getPersionPayMonthList(PayMonth payMonth) {
        System.out.println("(S) 6.4.1.3 급여 대장 검색 (월간) getPersionPayMonthList()");
        // 1. Mapper 호출 (결과값 : 사원 월간 급여정보)
        List<PayMonth> searchPayMonth = payMapper.getPersionPayMonthList(payMonth);
        System.out.println("(M) 6.4.1.3 급여 대장 검색 (월간) 쿼리 성공");
        // 2. 결과값 리턴 
        return searchPayMonth;
    }

    // 6.4.1.4 급여 대장 검색 (연간)
    public List<PayYear> getPersionPayYearList(PayYear payYear) {
        System.out.println("(S) 6.4.1.4 급여 대장 검색 (연간) getPersionPayYearList()");
        // 1. Mapper 호출 (결과값 : 사원 연간 급여정보)
        List<PayYear> searchPayYear = payMapper.getPersionPayYearList(payYear);
        System.out.println("(M) 6.4.1.4 급여 대장 검색 (연간) 쿼리 성공");
        // 2. 결과값 리턴 
        return searchPayYear;
    }
}
