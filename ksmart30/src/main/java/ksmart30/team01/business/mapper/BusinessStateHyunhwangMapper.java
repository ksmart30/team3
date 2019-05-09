/* 01.03.05.사업성분석검토현황-진행/종료 현황
 * @file     BusinessStateHyunhwangMapper.java
 * @brief    진행/종료 Mapper Interface
 * @author  ksmart30 박찬업
 */
package ksmart30.team01.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team01.business.domain.BusinessStateJinhaengHyunhwangDomain;

@Mapper
public interface BusinessStateHyunhwangMapper {

	//01.03.05.사업성분석검토현황-진행현황-설계1본부 리스트 조회	    
	/* @brief  getBusinessState1BonbuHyunhwangInfo추상메서드 선언
	 * @return  List<TotalCode>
	 */	
	List<TotalCode> getBusinessState1BonbuHyunhwangInfo();
	
	//01.03.05.사업성분석검토현황-진행 현황-설계2본부 리스트 조회	    
	/* @brief  getBusinessState2BonbuHyunhwangInfo 추상 메서드 선언
	 * @return  List<TotalCode>
	 */
	List<TotalCode> getBusinessState2BonbuHyunhwangInfo();
	
	//01.03.05.사업성분석검토현황-진행현황-설계3본부 리스트 조회	    
	/* @brief  getBusinessState3BonbuHyunhwangInfo 추상 메서드 선언
	 * @return  List<TotalCode>
	 */
	List<TotalCode> getBusinessState3BonbuHyunhwangInfo();
	
	//01.03.05.사업성분석검토현황-진행현황-설계4본부 리스트 조회	    
	/* @brief  getBusinessState4BonbuHyunhwangInfo 추상 메서드 선언
	 * @return  List<TotalCode>
	 */
	List<TotalCode> getBusinessState4BonbuHyunhwangInfo();
	
	//01.03.05.사업성분석검토현황-진행현황-설계5본부 리스트 조회	    
	/* @brief  getBusinessState5BonbuHyunhwangInfo 추상 메서드 선언
	 * @return  List<TotalCode>
	 */
	List<TotalCode> getBusinessState5BonbuHyunhwangInfo();
	
	//01.03.05.사업성분석검토현황-진행현황-수주구분별 리스트 조회	    
	/* @brief  getBusinessStateJinhaengHyunhwangInfo 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getBusinessStateJinhaengHyunhwangInfo();

	//01.03.05.사업성분석검토현황-진행현황-수주구분별 리스트 조회	    
	/* @param   TotalCode totalCode
	 * @brief  getSujuGubunInfo 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getSujuGubunInfo(TotalCode totalCode);

	//01.03.05.사업성분석검토현황-진행현황-수주구분별 리스트 조회	    
	/* @param   BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain
	 * @brief  getJinhaengSangtaeInfo 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getJinhaengSangtaeList(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
	
	//01.03.05.사업성분석검토현황-진행현황-현재 진행 사업성검토 조회	    
	/* @brief  getHyunjaeJinhaeng 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getHyunjaeJinhaengInfo();
	

	//01.03.05.사업성분석검토현황-진행현황-본부별 진행상태별 사업성 검토 조회	    
	/* @brief  getJinhaengSangtaeInfo 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getJinhaengSangtaeInfo(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
	
	//01.03.05.사업성분석검토현황-종료현황-본부별 사업성검토 리스트 조회    
	/* @brief  getbonbuBusinessEndList 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getbonbuBusinessEndList(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
	
	//01.03.05.사업성분석검토현황-종료현황-진행상태별 수주구분별 리스트 조회
	/* @brief  getJinhaengSangtaeEndList 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getJinhaengSangtaeEndList(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
	
	//01.03.05.사업성분석검토현황-종료현황-년도별 개요 리스트 조회
	/* @brief  getJinhaengSangtaeEndList 추상 메서드 선언
	 * @return  List<BusinessStateJinhaengHyunhwangDomain>
	 */
	List<BusinessStateJinhaengHyunhwangDomain> getYearlyBusinessList(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
}
