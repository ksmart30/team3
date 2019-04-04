package ksmart30.team00.baseinfo.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Company;

@Mapper
public interface CompanyMapper {

    // 10.3.1.1 본사정보 조회
    Company getCompanyList(); 
    
    // 10.3.1.2 본사정보 수정 처리
    int modifyCompany(Company company);
}
