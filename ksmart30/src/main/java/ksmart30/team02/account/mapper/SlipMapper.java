/* 8.1.전표입력
 * @file     SlipMapper.java
 * @brief    전표입력 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.domain.SlipHeaderDomain;


@Mapper
public interface SlipMapper {
	//8.1.전표입력.getSlipInfo메서드
	/* @param  String slip_DATE, String slip_NO 
	 * @brief   getSlipInfo추상메서드 선언	   		 	  
	 * @return  List<Slip>
	 */
	List<SlipDetailDomain> getSlipInfo(SlipDetailDomain slipDetailDomain);
	SlipHeaderDomain getSlipHeaderInfo(SlipDetailDomain slipDetailDomain);
	SlipDetailDomain getControlItemInfo(SlipDetailDomain slipDetailDomain);
}
