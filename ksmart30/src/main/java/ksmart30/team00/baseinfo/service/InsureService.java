package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Insure;
import ksmart30.team00.baseinfo.mapper.InsureMapper;

@Service
public class InsureService {
    @Autowired InsureMapper insureMapper;
    
    // 10.2.9.2 4대보험 요율 계산처리 (국민연금)
    public Insure getFourInsureKukmin(Insure insure){
        System.out.println("(S) 10.2.9.2 4대보험 요율 계산처리 (국민연금) getFourInsureKukmin()");
        // 1. Service호출 -> 결과값 활용)
        Insure Kukmin = insureMapper.getFourInsure(insure);
        System.out.println("(M) 10.2.9.2 4대보험 요율 계산처리 (국민연금) getFourInsure() 쿼리 성공");
        // 2. 국민연금 계산하기
            // 2.1 근로자 부담금 계산 (입력값 * 요율(%))
                // 2.1.1 문자열을 정수로 변환
                double insureEmpRate = Integer.parseInt(Kukmin.getINSURE_EMP_RATE());
                System.out.println("가져온 근로자 부담금 : " + insureEmpRate);
            Kukmin.setINSURE_EMP_CAL((int)(insure.getINSURE_EMP_CAL() * insureEmpRate));
            System.out.println("계산된 근로자 부담금 : " + Kukmin.getINSURE_EMP_CAL());
            // 2.2 사업주 부담금 계산
                // 2.2.1 문자열을 정수로 변환
                double insureComRate = Integer.parseInt(Kukmin.getINSURE_COM_RATE());
                System.out.println("가져온 근로자 부담금 : " + insureComRate);
            Kukmin.setINSURE_COM_CAL((int)(insure.getINSURE_COM_CAL() * insureComRate));
            System.out.println("계산된 근로자 부담금 : " + Kukmin.getINSURE_COM_CAL()); 
            // 2.3 연금보험료(전체) 계산후 Setting
                // 2.3.1 전체 계산된 내용을 변수에 저장
                int insureTotal = ((Kukmin.getINSURE_COM_CAL() * Kukmin.getINSURE_EMP_CAL()));
                System.out.println("연금보험료(전체) : " + insureTotal);
            Kukmin.setINSURE_TOTAL(insureTotal);
        // 3. 리턴값 전달하기 
        return Kukmin; 
    }
}
