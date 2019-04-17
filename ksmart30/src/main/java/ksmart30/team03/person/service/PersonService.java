package ksmart30.team03.person.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;
import ksmart30.team03.person.mapper.PersonMapper;

@Service
public class PersonService {
	
	@Autowired PersonMapper personMapper;	
	//6.1.1 인사기록카드에서 직원 list 출력
	public List<Map<String, Object>> personListView(PersonRequest vo){
		System.out.println("SERVICE : 인사기록카드 직원검색 리스트 출력");	
		List<Map<String, Object>> result = personMapper.personListView(vo);
		System.out.println("SERVICE(인사기록카드 직원 검색) 결과 : "+result);
		return result;		
	}	
	//6.1.2 직원 list출력(조건별)
	public List<Map<String, Object>> personInsaEmployeeSearchView(PersonRequest vo){
		System.out.println("SERVICE : 직원검색 리스트 출력");	
		List<Map<String, Object>> result = personMapper.personInsaEmployeeSearchView(vo);
		System.out.println("SERVICE(직원 검색) 결과 : "+result);
		return result;		
	}
	//6.1.2 직원 디테일 출력
	public List<Person> personInsaEmployeeDetailView(String EMP_NO){
		System.out.println("SERVICE : 직원검색 리스트 출력");
		return personMapper.personInsaEmployeeDetailView(EMP_NO);		
	}
	//6.1.1 직원 인사기록카드 등록
	public int addPersonInsa(Person vo) {
		int emp_no = personMapper.empnoSelect();
		int max_emp_no = 0;
		String max_emp_no2 = null;
		if(emp_no != 0) {
			max_emp_no = emp_no+1;
			max_emp_no2 = String.valueOf(max_emp_no);
			System.out.println("자동 생성된 사원번호  : "+ max_emp_no);
		}		
		vo.setEMP_NO(max_emp_no2);
		int result = personMapper.addPersonInsa(vo);
		return result;
	}
	//6.1.1해당 직원 수정 정보
	public Person personInsaEmployeeModifyView(String EMP_NO){
		System.out.println("SERVICE : 직원수정 출력");
		return  personMapper.personInsaEmployeeModifyView(EMP_NO);		
	}
	//6.1.1 직원등록 내의 부서코드 select option
	public List<Map<String, Object>> deptCdListView(){
		System.out.println("부서코드 select option");
		return personMapper.deptCdListView();
		
	}
	//6.1.1 직원등록 내의 구분 등.. select option
	public List<Map<String, Object>> gbCdListView(){
		System.out.println("코드별 구분 select option");
		return personMapper.gbCdListView();	
	}
	//6.1.1 직원등록 내의 구분 등.. select option
	public List<Person> gbCdRelationListView(){
		System.out.println("가족사항 구분 select option");
		return personMapper.gbCdRelationListView();	
	}
	//6.1.1 인사기록카드 추가기록(가족사항 입력)
	public int modifyPersonInsaFamily(Person vo){
		System.out.println("SERVICE : 가족사항 입력");
		return  personMapper.modifyPersonInsaFamily(vo);		
	}
	
}

