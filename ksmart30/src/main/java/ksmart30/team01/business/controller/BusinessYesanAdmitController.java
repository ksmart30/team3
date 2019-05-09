package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team01.business.service.BusinessYesanAdmitService;
import ksmart30.team01.business.service.BusinessYesanInputService;


@Controller
public class BusinessYesanAdmitController {
	@Autowired
	BusinessYesanAdmitService businessYesanAdmitService;
	@Autowired
	BusinessYesanInputService businessYesanInputService;
	
	@GetMapping("/business/businessYesanAdmitView")
	public String businessYesanAdmitView(Model model) {	
		model.addAttribute("list", businessYesanAdmitService.getDeptList());
		return "/business/businessYesanAdmitView";
	}
	@PostMapping("/businessYesanAdmitGetProjectList")
	public @ResponseBody List<Map<String, String>> businessYesanGetProjectList(@RequestBody Map<String,Object> searchMap){
		
		return businessYesanAdmitService.getProjectList(searchMap);
	}
	
	@PostMapping("/businessYesanAdmitGetResultProjectList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultProjectList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		return businessYesanAdmitService.getResultProjectList(searchMap);
	}
	
	@PostMapping("/businessYesanAdmitGetResultEmpList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultEmpList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		
		return businessYesanAdmitService.getResultDeptList(searchMap);
	}
	
	@PostMapping("/businessYesanAdmitGetResultProject")
	public @ResponseBody Map<String,Object> businessYesanGetResultProject(@RequestBody String PJT_CD){
		System.out.println(PJT_CD);
		return businessYesanAdmitService.getResultProject(PJT_CD);
	}
	@PostMapping("/businessYesanAdmitGetResultDetail")
	public @ResponseBody Map<String,Object> businessYesanGetResultDetail(@RequestBody String PJT_CD){
		System.out.println(PJT_CD);
		return businessYesanInputService.getProjectDetail(PJT_CD);
	}
	@PostMapping("/businessYesanAdmitGetManufacture2")
	public Map<String,Object> businessYesanAdmitManufacture2(@RequestBody String PJT_CD){
		System.out.println(PJT_CD);
		return businessYesanAdmitService.getManufacture2(PJT_CD);
	}	
	
	  @PostMapping("/businessYesanAdmitProcess")
	  public @ResponseBody int businessYesanModify(@RequestBody String PJT_CD) { 
		  System.out.println(PJT_CD);
	  return businessYesanAdmitService.admitProcess(PJT_CD);
	  }
	 
}
