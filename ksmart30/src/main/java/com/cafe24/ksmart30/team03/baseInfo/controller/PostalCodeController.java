package com.cafe24.ksmart30.team03.baseInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostalCodeController {

	@GetMapping("/baseInfo/postalCode")
	public String postalCodeSearch() {
		return "baseInfo/postal_code";
	}
}
