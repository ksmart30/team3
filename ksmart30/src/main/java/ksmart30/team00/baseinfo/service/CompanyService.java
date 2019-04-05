package ksmart30.team00.baseinfo.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Company;
import ksmart30.team00.baseinfo.mapper.CompanyMapper;

@Service
public class CompanyService {
    @Autowired CompanyMapper companyMapper;
    @Autowired Company company;

    // 10.3.1.1 본사정보 조회
    public Company getCompanyList() {
        System.out.println("(S) 10.3.1.1 본사정보 조회 getCompanyList()");
        // 1. Mapper 호출을 통해 쿼리 처리
        company = companyMapper.getCompanyList();
        System.out.println("(M) 10.3.1.1 본사정보 조회 getCompanyList() 완료");
        // 2. 결과 확인
        System.out.println("본사정보 조회 결과값(배열 형태) : "+ company);
        // 3. 본사정보를 가지고 리턴
        return company;
    } 

    // 10.3.1.2 본사정보 수정처리
    public void modifyCompany(Company company, HttpSession session) {
        System.out.println("(S) 10.3.1.2 본사정보 수정처리 modifyCompany()");
        // 1. 로그인된 아이디 정보 VO에 등록
        
        company.setAUDIT_ID((String)session.getAttribute("EMP_NO"));
        System.out.println(company.getAUDIT_ID());

        // 1. Mapper 호출을 통해 쿼리 처리
        System.out.println("Fax No : "+company.getFAX_NO());
        int result = companyMapper.modifyCompany(company);
        // 2. 결과 확인
        System.out.println("본사정보 수정 결과 (1:성공 0:실패)" + result);
    }
}
