package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Department; 

@Mapper
public interface DepartmentMapper {

    // 10.3.2.1 부서코드 조회 및 검색처리
    List<Department> getDepartmentSearchList(Department department);

    // 10.3.2.2 부서코드 입력처리
    int addDepartment();

    // 10.3.2.3 부서코드 수정 폼
    String getDepartment();

    // 10.3.2.4 부서코드 수정처리
    String modifyDepartment();

    // 10.3.2.5 부서코드 삭제처리
    String deleteDepartment();

}
