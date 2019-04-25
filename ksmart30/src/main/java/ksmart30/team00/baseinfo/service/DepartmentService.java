package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Department;
import ksmart30.team00.baseinfo.mapper.DepartmentMapper;

@Service
public class DepartmentService {
    @Autowired DepartmentMapper departmentMapper;
    @Autowired Department department;

    // 10.3.2.1 부서코드 조회처리
    public List<Department> getDepartmentList() {
        System.out.println("(S) 10.3.2.1 부서코드 조회 getDepartmentList()");
        // 1. 전체 리스트 조회를 위해 전체검색("")으로 처리
        department.setDEPT_NM("");
        department.setNOT_USE("");
        // 2. Mapper호출 (결과값 : 전체 부서코드 정보) 
        List<Department> departmentList = departmentMapper.getDepartmentSearchList(department);
        System.out.println("(M) 10.3.2.1 부서코드 조회 getDepartmentList() 처리성공");
        // 3. 리턴
        return departmentList;
    }

    // 10.3.2.2 부서코드 검색처리
    public List<Department> getDepartmentSearch(Department department) {
        System.out.println("(S) 10.3.2.2 부서코드 조회 getDepartmentList()");
        // 1. Mapeer호출 (결과값 : 검색된 부서코드 정보)
        List<Department> departmentList = departmentMapper.getDepartmentSearchList(department);
        System.out.println("(M) 10.3.2.2 부서코드 조회 getDepartmentList() 처리성공");
        // 2. 리턴
        return departmentList;
    }

    // 10.3.2.3 부서코드 입력처리
    public String addDepartment() {
        return null;
    }

    // 10.3.2.4 부서코드 수정 폼
    public String getDepartment() {
        return null;
    }

    // 10.3.2.5 부서코드 수정처리
    public String modifyDepartment() {
        return null;
    }

    // 10.3.2.6 부서코드 삭제처리
    public String deleteDepartment() {
        return null;
    }

}
