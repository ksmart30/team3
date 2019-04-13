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
                System.out.println("가져온 근로자 부담금 요율 : " + insureEmpRate);
                // 3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
            Kukmin.setINSURE_EMP_CAL1(((int)(insure.getINSURE_PAY() * insureEmpRate))-(((int)(insure.getINSURE_PAY() * insureEmpRate))%10));
            System.out.println("계산된 근로자 부담금 : " + Kukmin.getINSURE_EMP_CAL1());
            // 3.2 사업주 부담금 계산
                // 3.2.1 문자열을 정수로 변환
                double insureComRate = Double.parseDouble(Kukmin.getINSURE_COM_RATE());
                System.out.println("가져온 사업주 부담금 요율 : " + insureComRate);
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
        // 2. 건강보험료 -기본
            // 2.1 건강보험료 No번호 입력 (30번, Setting)
            insure.setINSURE_NO("30");
            // 2.2 Service호출 -> 결과값 활용)
            Insure Keungang1 = insureMapper.getFourInsure(insure);
            System.out.println("(M) 10.2.9.3 4대보험 요율 계산처리 (건강보험 - 기본) getFourInsure() 쿼리 성공");
            System.out.println("쿼리 결과 값 (건강보험 - 기본) : " + Keungang1);
            // 2.3 건강보험료 -기본 계산하기
                // 2.3.1 근로자 부담금 계산 (입력값 * 요율(%))
                    // 2.3.1.1 문자열을 정수로 변환
                    double insureEmpRate1 = Double.parseDouble(Keungang1.getINSURE_EMP_RATE());
                    System.out.println("가져온 근로자 부담금 요율 : " + insureEmpRate1);
                    // 2.3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
                returnKeungang.setINSURE_EMP_CAL1(((int)(insure.getINSURE_PAY() * insureEmpRate1))-(((int)(insure.getINSURE_PAY() * insureEmpRate1))%10));
                System.out.println("계산된 근로자 부담금 : " + returnKeungang.getINSURE_EMP_CAL1());
                // 2.3.2 사업주 부담금 계산
                    // 2.3.2.1 문자열을 정수로 변환
                    double insureComRate1 = Double.parseDouble(Keungang1.getINSURE_COM_RATE());
                    System.out.println("가져온 사업주 부담금 요율 : " + insureComRate1);
                    // 2.3.2.2 일의 자리를 내림 ( val() - (val() % 10) )
                returnKeungang.setINSURE_COM_CAL1(((int)(insure.getINSURE_PAY() * insureComRate1))-(((int)(insure.getINSURE_PAY() * insureComRate1))%10));
                System.out.println("계산된 사업주 부담금 : " + returnKeungang.getINSURE_COM_CAL1());
                // 2.3.3 건강보험료 -기본 전체 계산후 Setting
                    // 2.3.3.1 전체 계산된 내용을 변수에 저장
                    int insureTotal1 = ((returnKeungang.getINSURE_COM_CAL1() + returnKeungang.getINSURE_EMP_CAL1()));
                    System.out.println("건강보험 - 기본(전체) : " + insureTotal1);
                returnKeungang.setINSURE_TOTAL1(insureTotal1);
        
        // 3. 건강보험료 - 장기요양보험료
            // 3.1 장기요양보험료 No번호 입력 (31번, Setting)
            insure.setINSURE_NO("31");
            // 3.2 Service호출 -> 결과값 활용)
            Insure Keungang2 = insureMapper.getFourInsure(insure);
            System.out.println("(M) 10.2.9.4 4대보험 요율 계산처리 (건강보험 - 장기요양보험) getFourInsure() 쿼리 성공");
            System.out.println("쿼리 결과 값 (건강보험 - 장기요양보험) : " + Keungang2);
            // 3.3 장기요양보험료 계산하기
                // 3.3.1 근로자 부담금 계산 (입력값 * 요율(%))
                    // 3.3.1.1 문자열을 정수로 변환
                    double insureEmpRate2 = Double.parseDouble(Keungang2.getINSURE_EMP_RATE());
                    System.out.println("가져온 근로자 부담금 요율 : " + insureEmpRate2);
                    // 3.3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
                returnKeungang.setINSURE_EMP_CAL2(((int)(returnKeungang.getINSURE_TOTAL1() * insureEmpRate2))-(((int)(returnKeungang.getINSURE_TOTAL1() * insureEmpRate2))%10));
                System.out.println("계산된 근로자 부담금 : " + returnKeungang.getINSURE_EMP_CAL2());
                // 3.3.2 사업주 부담금 계산
                    // 3.3.2.1 문자열을 정수로 변환
                    double insureComRate2 = Double.parseDouble(Keungang2.getINSURE_COM_RATE());
                    System.out.println("가져온 사업주 부담금 요율 : " + insureComRate2);
                    // 3.3.2.2 일의 자리를 내림 ( val() - (val() % 10) )
                returnKeungang.setINSURE_COM_CAL2(((int)(returnKeungang.getINSURE_TOTAL1() * insureComRate2))-(((int)(returnKeungang.getINSURE_TOTAL1() * insureComRate2))%10));
                System.out.println("계산된 사업주 부담금 : " + returnKeungang.getINSURE_COM_CAL2());
                // 3.3.3 건강보험료 - 장기요양보험료 계산후 Setting
                    // 3.3.3.1 전체 계산된 내용을 변수에 저장
                    int insureTotal2 = ((returnKeungang.getINSURE_COM_CAL2() + returnKeungang.getINSURE_EMP_CAL2()));
                    System.out.println("건강보험 - 장기요양보험(전체) : " + insureTotal2);
                returnKeungang.setINSURE_TOTAL2(insureTotal2);
            
        // 4. 최종 Setting된 건강보험료 - 일반, 장기요양보험료 정보
        System.out.println(returnKeungang);
        // 5. 리턴값 전달하기 
        return returnKeungang;
    }

    // 10.2.9.4 4대보험 요율 계산처리 (고용보험)
    public Insure getFourInsureGoyong(Insure insure) {
        System.out.println("(S) 10.2.9.4 4대보험 요율 계산처리 (고용보험) getFourInsureGoyong()");
        // 1. Service호출 -> 결과값 활용)
        Insure Goyong = insureMapper.getFourInsure(insure);
        System.out.println("(M) 10.2.9.4 4대보험 요율 계산처리 (고용보험) getFourInsure() 쿼리 성공");
        System.out.println("쿼리 결과 값 : " + Goyong);
        // 2. 고용보험 계산하기
            // 2.1 근로자 부담금 계산 (입력값 * 요율(%))
            // 3.1.1 문자열을 정수로 변환
            double insureEmpRate = Double.parseDouble(Goyong.getINSURE_EMP_RATE());
            System.out.println("가져온 근로자 부담금 요율 : " + insureEmpRate);
            // 3.1.2 일의 자리를 내림 ( val() - (val() % 10) )
        Goyong.setINSURE_EMP_CAL1(((int)(insure.getINSURE_PAY() * insureEmpRate))-(((int)(insure.getINSURE_PAY() * insureEmpRate))%10));
        System.out.println("계산된 근로자 부담금 : " + Goyong.getINSURE_EMP_CAL1());
            // 3.2 사업주 부담금 계산 (실업급여 * 사업주 요율(%))
                // 3.2.1 고용안정직능개발 부담금 계산 
                    // 3.2.1.1 문자열을 정수로 변환
                    double insureComRate = Double.parseDouble(Goyong.getINSURE_COM_RATE());
                    System.out.println("가져온 고용안정직능개발 부담금 요율 : " + insureComRate);
                    // 3.2.1.2 일의 자리를 내림 ( val() - (val() % 10) )
                    Goyong.setINSURE_COM_CAL1(((int)(insure.getINSURE_PAY() * insureComRate))-(((int)(insure.getINSURE_PAY() * insureComRate))%10));
                    System.out.println("계산된 고용안정직능개발 부담금 부담금 : " + Goyong.getINSURE_COM_CAL1()); 
                // 3.2.2 사업주 부담금 계산 (실업급여 + 고용안정직능개발 부담금)
                Goyong.setINSURE_COM_CAL1(Goyong.getINSURE_EMP_CAL1() + Goyong.getINSURE_COM_CAL1());
                System.out.println("계산된 사업주 부담금 : " + Goyong.getINSURE_COM_CAL1());
            // 3.3 총액 계산 (근로자 부담금 + 사업주 부담금)
            int insureTotal = ((Goyong.getINSURE_COM_CAL1() + Goyong.getINSURE_EMP_CAL1()));
            System.out.println("국민보험료(전체) : " + insureTotal);
            // 3.4 총액을 Goyong객체에 Setting
            Goyong.setINSURE_TOTAL1(insureTotal);
        // 3. 리턴
        return Goyong;
    }
}
