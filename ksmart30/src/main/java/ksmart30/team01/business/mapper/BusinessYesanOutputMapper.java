package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.Business;

@Mapper
public interface BusinessYesanOutputMapper {
	
	//부서리스트
	List<Map<String,String>> businessOutputList();
	//프로젝트코드 (코드,코드명)
	List<Business> businessSearchList(Business business);
	//사업성검토 리스트출력
	List<Business> businessList(Business business);
	//사업성검토 리스트출력(radio버튼)
	List<Business> businessList2(Business business);
	
}
