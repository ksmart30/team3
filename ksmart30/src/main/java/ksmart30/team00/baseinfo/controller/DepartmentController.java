package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.domain.Department;
import ksmart30.team00.baseinfo.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired DepartmentService departmentService;
	@Autowired Department department;

	// 10.3.2.1 부서코드 조회
	@GetMapping("/baseInfo/departmentListView")
	public String departmentListView(Model model) {
		System.out.println("(C) 10.3.2.1 부서코드 조회 departmentListView()");
		// 1. Service 실행 (결과값 : 부서코드 정보(List))
		List<Department> departmentList = departmentService.getDepartmentList();
		// 2. 결과값을 Model객체에 Setting
		model.addAttribute("departmentList", departmentList);
		// 3. 부서코드 화면으로 이동
		return "baseInfo/departmentView";
	}

	// 10.3.2.2 부서코드 입력폼
	@GetMapping("/baseInfo/departmentWriteView")
	public String departmentWriteView() {
		return "baseInfo/departmentWriteView";
	}

	// 10.3.2.3 부서코드 입력 처리
	@GetMapping("/baseInfo/departmentWriteProcess")
	public String departmentWriteProcess() {
		return "baseInfo/departmentWriteProcess";
	}

	// 10.3.2.4 부서코드 수정폼
	@GetMapping("/baseInfo/departmentModifyView")
	public String departmentModifyView() {
		return "baseInfo/departmentModifyView";
	}

	// 10.3.2.5 부서코드 수정처리
	@GetMapping("/baseInfo/departmentModifyProcess")
	public String departmentModifyProcess() {
		return "baseInfo/departmentModifyProcess";
	}

	// 10.3.2.6 부서코드 삭제처리
	@GetMapping("/baseInfo/departmentDeleteProcess")
	public String departmentDeleteProcess() {
		return "baseInfo/departmentDeleteProcess";
	}


}
