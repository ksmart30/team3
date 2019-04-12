package ksmart30.team00.baseinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Insure;
import ksmart30.team00.baseinfo.mapper.InsureMapper;

@Service
public class InsureService {
    @Autowired InsureMapper insureMapper;
    
    // 10.2.9.2 4대보험 요율 계산처리 (국민연금)
    public Insure getFourInsureKukmin(Insure insure) {
        System.out.println("(S) 10.2.9.2 4대보험 요율 계산처리 (국민연금) getFourInsureKukmin()");
        // 1. 국민연금 No번호 입력 (10번, Setting)
        insure.setINSURE_NO("10");
        // 2. Service호출 -> 결과값 활용)
        Insure Kukmin = insureMapper.getFourInsure(insure);
        System.out.println("(M) 10.2.9.2 4대보험 요율 계산처리 (국민연금) getFourInsure() 쿼리 성공");
        System.out.println("쿼리 결과 값 : " + Kukmin);
        // 3. 국민연금 계산하기
            // 3.1 근로자 부담금 계산 (입력값 * 요율(%))
                // 3.1.1 문자열을 정수로 변환
                double insureEmpRate = Double.parseDouble(Kukmin.getINSURE_EMP_RATE());
                System.out.println("가져온 근로자 부담금 : " + insureEmpRate);
                // 3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
            Kukmin.setINSURE_EMP_CAL1(((int)(insure.getINSURE_PAY() * insureEmpRate))-(((int)(insure.getINSURE_PAY() * insureEmpRate))%10));
            System.out.println("계산된 근로자 부담금 : " + Kukmin.getINSURE_EMP_CAL1());
            // 3.2 사업주 부담금 계산
                // 3.2.1 문자열을 정수로 변환
                double insureComRate = Double.parseDouble(Kukmin.getINSURE_COM_RATE());
                System.out.println("가져온 사업주 부담금 : " + insureComRate);
                // 3.2.2 일의 자리를 내림 ( val() - (val() % 10) )
            Kukmin.setINSURE_COM_CAL1(((int)(insure.getINSURE_PAY() * insureComRate))-(((int)(insure.getINSURE_PAY() * insureComRate))%10));
            System.out.println("계산된 사업주 부담금 : " + Kukmin.getINSURE_COM_CAL1()); 
            // 3.3 연금보험료(전체) 계산후 Setting
                // 3.3.1 전체 계산된 내용을 변수에 저장
                int insureTotal = ((Kukmin.getINSURE_COM_CAL1() + Kukmin.getINSURE_EMP_CAL1()));
                System.out.println("연금보험료(전체) : " + insureTotal);
            Kukmin.setINSURE_TOTAL1(insureTotal);
            // 4. 최종 Setting된 국민연금 정보
            System.out.println(Kukmin);
        // 5. 리턴값 전달하기 
        return Kukmin; 
    }

    // 10.2.9.3 4대보험 요율 계산처리 (건강보험 - 기본, 장기요양보험료)
    public Insure getFourInsureKeungang(Insure insure) {
        // 1. 건강보험 리턴을 위한 객체 생성
        Insure returnKeungang = new Insure();

        System.out.println("(S) 10.2.9.3 4대보험 요율 계산처리 (건강보험 - 기본) getFourInsureKeungang()");
        // 1. 건강보험료 -기본
        // 1.1 건강보험료 No번호 입력 (30번, Setting)
        insure.setINSURE_NO("30");
        // 1.2 Service호출 -> 결과값 활용)
        Insure Keungang1 = insureMapper.getFourInsure(insure);
        System.out.println("(M) 10.2.9.3 4대보험 요율 계산처리 (건강보험 - 기본) getFourInsure() 쿼리 성공");
        System.out.println("쿼리 결과 값 (건강보험 - 기본) : " + Keungang1);
        // 1.3 건강보험료 -기본 계산하기
            // 1.3.1 근로자 부담금 계산 (입력값 * 요율(%))
                // 1.3.1.1 문자열을 정수로 변환
                double insureEmpRate1 = Double.parseDouble(Keungang1.getINSURE_EMP_RATE());
                System.out.println("가져온 근로자 부담금 : " + insureEmpRate1);
                // 1.3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
            returnKeungang.setINSURE_EMP_CAL1(((int)(insure.getINSURE_PAY() * insureEmpRate1))-(((int)(insure.getINSURE_PAY() * insureEmpRate1))%10));
            System.out.println("계산된 근로자 부담금 : " + returnKeungang.getINSURE_EMP_CAL1());
            // 1.3.2 사업주 부담금 계산
                // 1.3.2.1 문자열을 정수로 변환
                double insureComRate1 = Double.parseDouble(Keungang1.getINSURE_COM_RATE());
                System.out.println("가져온 사업주 부담금 : " + insureComRate1);
                // 1.3.2.2 일의 자리를 내림 ( val() - (val() % 10) )
            returnKeungang.setINSURE_COM_CAL1(((int)(insure.getINSURE_PAY() * insureComRate1))-(((int)(insure.getINSURE_PAY() * insureComRate1))%10));
            System.out.println("계산된 사업주 부담금 : " + returnKeungang.getINSURE_COM_CAL1());
            // 1.3.3 건강보험료 -기본 전체 계산후 Setting
                // 1.3.3.1 전체 계산된 내용을 변수에 저장
                int insureTotal1 = ((returnKeungang.getINSURE_COM_CAL1() + returnKeungang.getINSURE_EMP_CAL1()));
                System.out.println("건강보험 - 기본(전체) : " + insureTotal1);
            returnKeungang.setINSURE_TOTAL1(insureTotal1);
        
        // 2. 건강보험료 - 장기요양보험료
        // 2.1 장기요양보험료 No번호 입력 (31번, Setting)
        insure.setINSURE_NO("31");
        // 2.2 Service호출 -> 결과값 활용)
        Insure Keungang2 = insureMapper.getFourInsure(insure);
        System.out.println("(M) 10.2.9.4 4대보험 요율 계산처리 (건강보험 - 장기요양보험) getFourInsure() 쿼리 성공");
        System.out.println("쿼리 결과 값 (건강보험 - 장기요양보험) : " + Keungang2);
        // 2.3 장기요양보험료 계산하기
            // 2.3.1 근로자 부담금 계산 (입력값 * 요율(%))
                // 2.3.1.1 문자열을 정수로 변환
                double insureEmpRate2 = Double.parseDouble(Keungang2.getINSURE_EMP_RATE());
                System.out.println("가져온 근로자 부담금 : " + insureEmpRate2);
                // 2.3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
            returnKeungang.setINSURE_EMP_CAL2(((int)(returnKeungang.getINSURE_TOTAL1() * insureEmpRate2))-(((int)(returnKeungang.getINSURE_TOTAL1() * insureEmpRate2))%10));
            System.out.println("계산된 근로자 부담금 : " + returnKeungang.getINSURE_EMP_CAL2());
            // 2.3.2 사업주 부담금 계산
                // 2.3.2.1 문자열을 정수로 변환
                double insureComRate2 = Double.parseDouble(Keungang2.getINSURE_COM_RATE());
                System.out.println("가져온 사업주 부담금 : " + insureComRate2);
                // 2.3.2.2 일의 자리를 내림 ( val() - (val() % 10) )
            returnKeungang.setINSURE_COM_CAL2(((int)(returnKeungang.getINSURE_TOTAL1() * insureComRate2))-(((int)(returnKeungang.getINSURE_TOTAL1() * insureComRate2))%10));
            System.out.println("계산된 사업주 부담금 : " + returnKeungang.getINSURE_COM_CAL2());
            // 2.3.3 건강보험료 - 장기요양보험료 계산후 Setting
                // 2.3.3.1 전체 계산된 내용을 변수에 저장
                int insureTotal2 = ((returnKeungang.getINSURE_COM_CAL2() + returnKeungang.getINSURE_EMP_CAL2()));
                System.out.println("건강보험 - 장기요양보험(전체) : " + insureTotal2);
            returnKeungang.setINSURE_TOTAL2(insureTotal2);
            
        // 3 최종 Setting된 건강보험료 - 일반, 장기요양보험료 정보
        System.out.println(returnKeungang);
        // 4. 리턴값 전달하기 
        return returnKeungang;
    }
}
