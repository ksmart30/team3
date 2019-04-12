/* 8.8.외주비지급전표이관
 * @file    ExcostTransferController.java
 * @brief   외주비지급전표이관 controller
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcostTransferController {
	// 8.8.외주비지급전표이관
	/* @brief    excosttransfer_in.html 화면 출력
	 * 	   "http://localhost/acc/excostTransferView" 주소분기(get방식)
	 *             template폴더에 있는excosttransfer_in forward
	 * 	   같은표현: @RequestMapping(value="/acc/excostTransferView", method = RequestMethod.GET)
	 * @return  String(/account/excosttransfer/excosttransfer_in)
	 */
	//외주비 지급전표 이관
	@GetMapping("/acc/excostTransferView")
	public String excostTransferView() {
		System.out.println("외주비 지급전표 이관 excostTransfer ExcostTransferController.java");
		return "/account/excostTransferView";
	}
}
