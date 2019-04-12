/* 10.2.7.자산분류코드
 * @file      AssetClassfyCodeController.java
 * @brief    자산분류코드 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.service.AssetClassifyCodeService;
import ksmart30.team00.baseinfo.domain.AssetClassifyCodeDomain;

@Controller
public class AssetClassifyCodeController {
@Autowired
AssetClassifyCodeService assetClassifyCodeService;
	
	//10.2.7.자산분류코드
	/* @param   Model model
	* @brief     ControlItemCodeList내 assetClassifyCodeList메서드 호출
	* 	   		"http://localhost/baseInfo/assetClassifyView" 주소분기(get방식)
	*             template폴더에 있는assetclassfycode.html forward
	* 	   같은표현: @RequestMapping(value="/baseInfo/assetClassifyView", method = RequestMethod.GET)
	* @return  String(baseinfo/assetclassfycode/assetclassfycode)
	*/
	@GetMapping("/baseInfo/assetClassifyView")
	public String assetClassifyView(Model model) {
		System.out.println("01 자산분류코드 AssetClassfyCode AssetClassfyCodeController.java");
		List<AssetClassifyCodeDomain> assetClassifyCode = assetClassifyCodeService.assetClassifyCodeList();
		System.out.println("assetClassifyCode : " + assetClassifyCode);
		model.addAttribute("assetClassifyCode", assetClassifyCode);
		return "baseinfo/assetClassifyCodeView";
	}
}
