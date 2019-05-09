package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.domain.BusinessSearch1;
@Mapper
public interface BusinessYesanSearchMapper {
	
	//사업성검토 검색1
	List<BusinessSearch1> 	businessOutputSearch1(BusinessSearch1 businessSearch1);
	//사업성검토 검색1 부서별 셀렉트박스
	List<Map<String, String>> businessOutputSearch1Dept();
	//사업성검토 검색1 수주구분 셀렉트박스
	List<Map<String, String>> businessSujuSearch();
	//사업성검토 검색1 건축물용도 셀렉트박스
	List<Map<String, String>> businessGunSearch();
	//사업성검토 검색1 발주처구분 셀렉트박스
	List<Map<String, String>> businessGubunSearch();
	//사업성검토 검색1 (프로젝트코드 팝업전체리스트)
	List<BusinessSearch1> businessPjtCd(BusinessSearch1 businessSearch1);
	//사업성검토 검색1 (발주처코드 팝업전체리스트)
	List<BusinessSearch1> businessCustList(BusinessSearch1 businessSearch1);
	//사업성검토 검색2
	List<Business> businessOutputSearch2(Business business);
}
