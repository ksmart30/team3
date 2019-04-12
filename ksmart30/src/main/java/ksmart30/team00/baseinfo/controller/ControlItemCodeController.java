/* 10.2.6.관리항목코드
 * @file     ControlItemCodeController.java
 * @brief    관리항목코드 컨트롤러
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.service.ControlItemCodeService;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Controller
public class ControlItemCodeController {
@Autowired
ControlItemCodeService controlItemCodeService;
	//10.2.6.관리항목코드
	/* @param   Model model
	* @brief    ControlItemCodeService내 ControlItemCodeList메서드 호출
	* 	   		"http://localhost/baseInfo/controlItemView" 주소분기(get방식)
	*             template폴더에 있는controlitemcode.html forward
	* 	   같은표현: @RequestMapping(value="/baseInfo/controlItemView", method = RequestMethod.GET)
	* @return  String(baseinfo/controlitemcode/controlitemcode)
	*/
	@GetMapping("/baseInfo/controlItemView")
	public String controlItemView(Model model) {
		System.out.println("01 관리항목코드등록 ControlItemCode ControlItemCodeController.java");
		List<ControlItemCodeDomain> controlItemCode = controlItemCodeService.ControlItemCodeList();
		System.out.println("controlItemCode : " + controlItemCode);
		model.addAttribute("controlItemCode", controlItemCode);
		return "baseinfo/controlItemCodeView";
	}
}
