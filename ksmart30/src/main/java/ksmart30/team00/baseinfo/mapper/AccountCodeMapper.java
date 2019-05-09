/* 10.2.5.계정과목코드
 * @file     AccountCodeMapper.java
 * @brief    계정과목코드 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;
import ksmart30.team00.baseinfo.domain.TotalCode;

@Mapper
public interface AccountCodeMapper {
	
	// 10.2.5.계정과목코드-계정과목리스트조회
	/* @brief  getAccountCodeList추상메서드 선언
	 * @return  List<AccountCodeDomain>
	 */
	List<AccountCodeDomain> getAccountCodeList();
	
	// 10.2.5.계정과목코드-관리항목조회
	/* @brief  getControlItemCodeList추상메서드 선언
	 * @return  List<ControlItemCodeDomain>
	 */
	List<ControlItemCodeDomain> getControlItemCodeList();
	
	// 10.2.5.계정과목코드-계정코드조회
	/* @brief  getAccountCodeInfo추상메서드 선언
	 * @return  List<AccountCodeDomain>
	 */
	List<AccountCodeDomain> getAccountCodeInfo(AccountCodeDomain accountCodeDomain);
	
	// 10.2.5.계정과목코드-자산코드조회
	/* @brief  getAssetCodeInfo추상메서드 선언
	 * @return  List<TotalCode>
	 */	
	List<TotalCode> getAssetCodeInfo();
	
	// 10.2.5.계정과목코드-비용유형조회
	/* @brief  getCostTypeInfo추상메서드 선언
	 * @return  List<TotalCode>
	 */	
	List<TotalCode> getCostTypeInfo();
}
