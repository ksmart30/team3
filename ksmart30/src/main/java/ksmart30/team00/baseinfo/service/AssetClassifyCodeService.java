/* 10.2.7.자산분류코드
 * @file    AssetClassifyCodeService.java
 * @brief    자산분류코드 서비스 계층
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.AssetClassifyCodeMapper;
import ksmart30.team00.baseinfo.domain.AssetClassifyCodeDomain;

@Service
public class AssetClassifyCodeService {
@Autowired
AssetClassifyCodeMapper assetClassifyCodeMapper;
	//10.2.7.자산분류코드
	/*@brief     AssetClassifyCodeMapper내 assetClassifyCodeList메서드 호출
	* @return  List<AssetClassifyCode> assetClassifyCode
	*/
	public List<AssetClassifyCodeDomain> assetClassifyCodeList(){
		System.out.println("02 단위테스트");
		List<AssetClassifyCodeDomain> assetClassifyCode = assetClassifyCodeMapper.assetClassifyCodeList();
		System.out.println("assetClassifyCode : " + assetClassifyCode);
		return assetClassifyCode;
	}
}
