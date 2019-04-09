package ksmart30.team03.person.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ksmart30.team03.person.domain.Person;

@Mapper
public interface PersonMapper {
	//6.1.2 직원 list출력(전체)
	List<Person> personInsaEmployeeSearchView();
	//6.1.2 직원 디테일 출력
	List<Person> personInsaEmployeeDetailView(String EMP_NO);
	
}
