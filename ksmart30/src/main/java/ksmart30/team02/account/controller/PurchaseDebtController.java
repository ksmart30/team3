package ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team02.account.service.PurchaseDebtService;
import ksmart30.team00.baseinfo.domain.PurchaseDebt;
@Controller
public class PurchaseDebtController {
	@Autowired
		private PurchaseDebtService purchaseDebtService;
	/* @param  Model model
	 * @brief  PurchaseDebt 리스트 출력
	 * @return String purchaseDebtView
	 */
	@GetMapping("/acc/purchaseDebtView")
	public String purchaseDebtView(Model model) {
		List<PurchaseDebt> list = purchaseDebtService.purchaseDebtView();
		model.addAttribute("List", list);
		System.out.println(list.toString());
		return "account/purchaseDebtView";
	}
}
