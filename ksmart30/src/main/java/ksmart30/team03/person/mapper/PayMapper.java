package ksmart30.team03.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team03.person.domain.PayGiveTake;
import ksmart30.team03.person.domain.PayMonth;
import ksmart30.team03.person.domain.PayPeriod;
import ksmart30.team03.person.domain.PayYear;

@Mapper
public interface PayMapper {

    // 6.4.1.2 급여 계산 (지급, 공제항목)
    List<PayGiveTake> getPersonPayCalList(PayGiveTake payGiveTake);

    // 6.4.1.3 급여 계산 (기간적용항목 / 지급 및 공제)
    List<PayPeriod> getPersonPayCalPeriodList(PayPeriod payPeriod);

    // 6.4.1.5 급여 대장 검색 (월간)
    List<PayMonth> getPersionPayMonthList(PayMonth payMonth);

    // 6.4.1.6 급여 대장 검색 (연간)
    List<PayYear> getPersionPayYearList(PayYear payYear);

}
