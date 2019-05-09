/* 8.1.전표입력
 * @file     SlipMapper.java
 * @brief    전표입력 Mapper Interface
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.domain.SlipHeaderDomain;


@Mapper
public interface SlipMapper {
	
	//8.1.전표입력-전표리스트 조회
	/* @param  SlipDetailDomain slipDetailDomain 
	 * @brief   getSlipInfo추상메서드 선언	   		 	  
	 * @return List<SlipDetailDomain>
	 */
	List<SlipDetailDomain> getSlipInfo(SlipDetailDomain slipDetailDomain);
	
	//8.1.전표입력.전표기본내역 조회
		/* @param  SlipDetailDomain slipDetailDomain 
		 * @brief   getSlipHeaderInfo추상메서드 선언	   		 	  
		 * @return  SlipHeaderDomain
		 */
	SlipHeaderDomain getSlipHeaderInfo(SlipDetailDomain slipDetailDomain);
	
	//8.1.전표입력-관리항목 조회
		/* @param  SlipDetailDomain slipDetailDomain 
		 * @brief   getControlItemInfo추상메서드 선언	   		 	  
		 * @return  SlipDetailDomain
		 */
	SlipDetailDomain getControlItemInfo(SlipDetailDomain slipDetailDomain);
	
	//8.1.전표입력-전표번호 조회
		/* @param  SlipHeaderDomain slipHeaderDomain 
		 * @brief   getSlipNoInfo추상메서드 선언	   		 	  
		 * @return  List<SlipHeaderDomain>
		 */
	List<SlipHeaderDomain> getSlipNoInfo(SlipHeaderDomain slipHeaderDomain);
}
