package ksmart30.team03.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.domain.PersonRequest;

@Mapper
public interface PersonMapper {
	
	//6.1.1 인사기록카드에서 직원 list 검색 후 출력{매개변수(검색조건들)를 vo값으로 받음}
	List<Map<String, Object>> personListView(PersonRequest vo);
	//6.1.2 직원 list 검색 후 출력{매개변수(검색조건들)를 vo값으로 받음}
	List<Map<String, Object>> personInsaEmployeeSearchView(PersonRequest vo);
	//6.1.2 직원 디테일 출력
	List<Person> personInsaEmployeeDetailView(String EMP_NO);
	//6.1.1한 직원에 대한 수정 정보 출력
	Person personInsaEmployeeModifyView(String EMP_NO);
	//6.1.1 사원번호 자동생성 selet문
	int empnoSelect();
	//6.1.1 인사기록카드 등록 insert
	int addPersonInsa(Person vo);
	//6.1.1인사기록카드 등록 (부서코드  select option)
	List<Map<String, Object>> deptCdListView();
	//6.1.1인사기록카드 등록 (직급,직책,출신지역,혈액형,역종,군별,계급,병과,전문분야,등급 구분 select option)
	List<Map<String, Object>> gbCdListView();
	//6.1.1인사기록카드 등록 (가족사항 select option)
	List<Person> gbCdRelationListView();
	//6.1.1 인사기록카드 추가등록 가족사항 insert
	int modifyPersonInsaFamily(Person vo);
}
