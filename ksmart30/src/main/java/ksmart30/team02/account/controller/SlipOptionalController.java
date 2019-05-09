package ksmart30.team02.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.SlipOptionalDomain;
import ksmart30.team02.account.service.SlipOptionalService;

@Controller
public class SlipOptionalController {
	@Autowired
	private SlipOptionalService slipOptionalService;
	
	/* @param  Model model
	 * @brief  8.4 조건별 전표검색
	 * @return String conditionalSlipSearchView
	 */
	@GetMapping("/acc/conditionalSlipSearchView")
	public String conditionalSlipSearchView(Model model){
		List<SlipOptionalDomain> list = slipOptionalService.conditionalSlipSearchView();
		model.addAttribute("list",list);
		System.out.println(list.toString());
		return "account/slipoptionalSearchView";
	}
}