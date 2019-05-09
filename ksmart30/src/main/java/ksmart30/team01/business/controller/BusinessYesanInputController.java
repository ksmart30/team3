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

import ksmart30.team01.business.service.BusinessYesanInputService;
/*
 * @file   BusinessYesanInputController.java
 * @brief   1.2.1 사업성 검토예산입력
 * @author  ksmart30 HSY
 */
@Controller
public class BusinessYesanInputController {
	@Autowired BusinessYesanInputService businessYesanInputService;
	
	// 1.2.1 사업성 검토예산입력
	/* @brief    화면 출력
	 * 	   		"http://localhost/business/businessYesanView" 주소분기(get방식)
	 *           template폴더에 있는 businessYesanView.html forward
	 * @return  String(view이름)
	 */
	@GetMapping("/business/businessYesanView")
	public String businessYesanView(Model model) {
		model.addAttribute("list", businessYesanInputService.getDeptList());
		return "/business/businessYesanView";
	}
	
	// 1.2.1 사업성 검토예산입력(테스트)
	/* @brief    화면 출력
	 * 	   		"http://localhost/btest" 주소분기(get방식)
	 *           template폴더에 있는 businessYesanView4.html forward
	 * @return  String(view이름)
	 */
	@GetMapping("/btest")
	public String btest(Model model) {
		model.addAttribute("list", businessYesanInputService.getDeptList());
		return "/business/businessYesanView4";
	}
	
	// 1.2.1 사업성 검토예산입력
	/* @brief    프로젝트리스트 (모달)
	 * 	   		"http://localhost/businessYesanGetProjectList" 주소분기(Post방식)
	 *           
	 * @return  List<Map<String, String>>
	 */
	@PostMapping("/businessYesanGetProjectList")
	public @ResponseBody List<Map<String, String>> businessYesanGetProjectList(@RequestBody Map<String,Object> searchMap){
		System.out.println("/businessYesanGetProjectList,  businessYesanGetProjectList()실행");
		return businessYesanInputService.getProjectList(searchMap);
	}
	
	// 1.2.1 사업성 검토예산입력
	/* @brief    프로젝트리스트 (검색결과) 왼쪽 하단
	 * 	   		"http://localhost/businessYesanGetResultProjectList" 주소분기(Post방식)
	 *           
	 * @return  List<Map<String,String>>
	 */
	@PostMapping("/businessYesanGetResultProjectList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultProjectList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		return businessYesanInputService.getResultProjectList(searchMap);
	}
	
	// 1.2.1 사업성 검토예산입력
	/* @brief    PM, PD 사원검색(모달
	 * 	   		"http://localhost/businessYesanGetResultEmpList" 주소분기(Post방식)
	 *           
	 * @return  String(view이름)
	 */
	@PostMapping("/businessYesanGetResultEmpList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultEmpList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		
		return businessYesanInputService.getResultDeptList(searchMap);
	}
	
	// 1.2.1 사업성 검토예산입력
	/* @brief    선택된 프로젝트 오른쪽 상단 상세정보
	 * 	   		"http://localhost/businessYesanGetResultProject" 주소분기(get방식)
	 *           
	 * @return  Map<String,Object>
	 */
	@PostMapping("/businessYesanGetResultProject")
	public @ResponseBody Map<String,Object> businessYesanGetResultProject(@RequestBody String PJT_CD){
		System.out.println(PJT_CD);
		return businessYesanInputService.getResultProject(PJT_CD);
	}
	
	// 1.2.1 사업성 검토예산입력
	/* @brief   선택된 프로젝트 오른쪽 하단 상세정보
	 * 	   		"http://localhost/businessYesanGetResultDetail" 주소분기(get방식)
	 *           template폴더에 있는 businessYesanView.html forward
	 * @return  Map<String,Object>
	 */
	@PostMapping("/businessYesanGetResultDetail")
	public @ResponseBody Map<String,Object> businessYesanGetResultDetail(@RequestBody String PJT_CD){
		System.out.println(PJT_CD+"<=받아오는거");
		
		return businessYesanInputService.getProjectDetail(PJT_CD);
	}

}
