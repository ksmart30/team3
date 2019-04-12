/* 10.2.6.관리항목코드
 * @file     ControlItemCodeMapper.java
 * @brief    관리항목코드 mapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Mapper
public interface ControlItemCodeMapper {
	//10.2.6.관리항목코드
	/*@brief    ControlItemCodeList추상메서드 선언	   		
	* @return  List<ControlItemCodeDomain>
	*/
	List<ControlItemCodeDomain> ControlItemCodeList();
	
}
