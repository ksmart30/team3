/* 10.2.6.관리항목코드
 * @file     ControlItemCodeService.java
 * @brief    관리항목코드 서비스 계층
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.ControlItemCodeMapper;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Service
public class ControlItemCodeService {
@Autowired
ControlItemCodeMapper controlItemCodeMapper;
	//10.2.6.관리항목코드
	/*@brief    ControlItemCodeMapper내ControlItemCodeList메서드 호출	   		
	* @return  List<ControlItemCodeDomain> controlItemCode
	*/
	public List<ControlItemCodeDomain> ControlItemCodeList() {
		System.out.println("02 단위테스트");
		List<ControlItemCodeDomain> controlItemCode = controlItemCodeMapper.ControlItemCodeList();
		System.out.println("controlItemCode : " + controlItemCode);
		return controlItemCode;
	}
}
