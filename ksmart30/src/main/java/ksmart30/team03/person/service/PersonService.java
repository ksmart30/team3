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
	

	
}

