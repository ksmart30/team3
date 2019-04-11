package ksmart30.team03.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;

@Mapper
public interface PersonMapper {

	//6.1.2 직원 list 검색 후 출력{매개변수(검색조건들)를 vo값으로 받음}
	List<Map<String, Object>> personInsaEmployeeSearchView(PersonRequest vo);
	//6.1.2 직원 디테일 출력
	List<Person> personInsaEmployeeDetailView(String EMP_NO);
	
}
