/* 10.2.7.자산분류코드
 * @file    AssetClassifyCodeMapper.java
 * @brief    자산분류코드 mapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AssetClassifyCodeDomain;

@Mapper
public interface AssetClassifyCodeMapper {
	//10.2.7.자산분류코드
	/*@brief   assetClassifyCodeList추상메서드 선언
	* @return  List<AssetClassifyCodeDomain>
	*/
	//assetClassifyCodeList추상메서드 선언
	List<AssetClassifyCodeDomain> assetClassifyCodeList();
}
