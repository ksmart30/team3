package ksmart30.team03.kuntae.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.kuntae.domain.WorkTime;
import ksmart30.team03.kuntae.domain.WorkTimeSingleList;
import ksmart30.team03.kuntae.mapper.WorkTimeMapper;
import ksmart30.team03.person.domain.Person;
import ksmart30.team03.person.mapper.PersonMapper;

@Service
public class WorkTimeService {
	@Autowired private WorkTimeMapper workTimeMapper;
	@Autowired PersonMapper personMapper;	
	
	// 출,퇴근 기록부(개인별) 사원번호 검색
	public List<WorkTimeSingleList> getRecordSingle(String EMP_NO){
		System.out.println("S : Single 사원번호 선택 EMP_NO =>"+EMP_NO);
		return workTimeMapper.getRecordSingleNoSearch(EMP_NO);
	}
	
	// 출,퇴근 기록부(개인별) 이름 검색
	public List<WorkTimeSingleList> getRecordSignleName(String KOR_NM){
		System.out.println("S : Single 이름 검색 KOR_NM =>"+ KOR_NM);
		return workTimeMapper.getRecordSingleNameSearch(KOR_NM);
	}
	
	// 출,퇴근 기록부(개인별) 날짜 검색
	public List<WorkTimeSingleList> getRecordSingleDateSearch(String WORK_DT, String END_DT){
		System.out.println("S : 날짜 WORK_DT =>"+ WORK_DT+"날짜 END_DT =>"+WORK_DT);
		return workTimeMapper.getRecordSingleDateSearch(WORK_DT, END_DT);
	}
	
	// 출 퇴근 기록부(Total) 당일 출 퇴근 명단 출력
	public List<WorkTimeSingleList> getRecordTotalList(){
		System.out.println("S : Total 당일 출퇴근 명단 화면");
		return workTimeMapper.getRecordTotalList();
	}
	
	
	// 출,퇴근 기록부(Total) 날짜 검색
	public List<WorkTimeSingleList> getRecordTotalNoSearch(String EMP_NO){
		System.out.println("S : Total 사원번호 선택 EMP_NO =>"+EMP_NO);
		return workTimeMapper.getRecordTotalNoSearch(EMP_NO);
	}
	
	// 출,퇴근 기록부(Total) 전체 검색
	public List<WorkTimeSingleList> getRecordTotalSearch(String WORK_DT, String END_DT, String EMP_NO){
		System.out.println("S : Total 전체 검색 시작날짜 =>"+WORK_DT+"끝난날짜=>"+END_DT+"사원번호=>"+EMP_NO);
		return workTimeMapper.getRecordTotalSearch(WORK_DT, END_DT, EMP_NO);
	}
	
	// 부서코드 Select Option
	public List<Map<String, Object>> gbCdListView(){
		System.out.println("S :코드별 구분 select option");
		return personMapper.gbCdListView();
	}
	
	// 전체 검색(검색 조건들을 vo로 받음)
	public List<Map<String, Object>> getSingleListDomain(WorkTimeSingleList vo){
		System.out.println("S : 출퇴근 정정 신청 List");
		List<Map<String, Object>> data = workTimeMapper.getSingleListDomain(vo);
		System.out.println("S : 출퇴근 정정 신청 Vo" + data);
		return data;
	}
	
	// 출퇴근 정정 신청 List
	
	public List<WorkTime> getWorkTimeView(){
		System.out.println("S : 출퇴근 정정 신청 List");
		return workTimeMapper.getWorkTimeView();
	}
	
	// 출퇴근 정정 신청 List 기간,이름 검색
	public List<WorkTimeSingleList> getWorkTimeSearchView(String KOR_NM, String WORK_DT, String WORK_DT1){
		System.out.println("S : 출퇴근 정정 신청 List 이름 검색");
		return workTimeMapper.getWorkTimeSearchView(KOR_NM, WORK_DT, WORK_DT1);
	}
	
	// 지각 횟수, 지각 누계
	public List<WorkTime> getWorkTimeJigakSearch(String EMP_NO){
		System.out.println("S : 지각 횟수 ");
		return workTimeMapper.getWorkTimeJigakSearch(EMP_NO);
	}
	
	// 출근 처리
	public int getCheckOn(HttpSession httpSession, WorkTimeSingleList vo) throws UnknownHostException {
		// 0. 리턴변수 초기화
		int result = 0;
		// 1. 세션 정보 가져오기
		String sessionEmpNo = (String)httpSession.getAttribute("EMP_NO");
		System.out.println("S : sessionEmpNo 값 : "+sessionEmpNo);
		// 1.1 세션 정보 Null에 대한 처리
			if(sessionEmpNo == null) {
				
			}else{
				vo.setEMP_NO(sessionEmpNo);
				System.out.println("S : CheckOn sessionEmpNo : "+ sessionEmpNo);
				// 2. 출퇴근 리스트 조회
				List<WorkTimeSingleList> checkList = workTimeMapper.getCheckOn(vo);
				System.out.println("S : 출근 SELECT 대한 정보 값 : " + checkList.size());
					// 2.1 출근값이 있다면
					if(checkList.size() != 0) {
						result = 1; 
						// 2.2 출근값이 없다면 출근 처리 하기
					}else{
						// 2.2.1 부서정보 넣기
						Person deptValue = personMapper.personInsaEmployeeModifyView(sessionEmpNo);
						vo.setDEPT_CD(deptValue.getDEPT_CD());
	
						// 2.2.2 ip정보 넣기
						InetAddress catchIp = InetAddress.getLocalHost();
						String connentIp = catchIp.getHostAddress();
						vo.setCONN_IP(connentIp);
						// 2.2.2 출근처리 
						int checkOn = workTimeMapper.addCheckOn(vo);
						System.out.println("S : 출근 처리 완료 여부 : "+ checkOn);
						result = 2;							
					}
			}	
		return result;
	}
	
	// 퇴근 처리
	public int getCheckOff(HttpSession httpSession, WorkTimeSingleList vo) throws UnknownHostException{
		// 0. 리턴변수 초기화 3
		int result = 0;
		// 1. 세션 정보 가져오기
		String sessionEmpNo = (String)httpSession.getAttribute("EMP_NO");
		System.out.println("S : sessionEmpNo 값 : "+sessionEmpNo);
		// 1.1 세션 정보 Null에 대한 처리
		if(sessionEmpNo == null) {
		
		}else{
			vo.setEMP_NO(sessionEmpNo);
			System.out.println("S : Checkoff sessionEmpNo : "+ sessionEmpNo);
			// 2. 출퇴근 리스트 조회
			List<WorkTimeSingleList> checkList = workTimeMapper.getCheckOff(vo);	
			System.out.println("S : 퇴근 여부 SELECT 결과 : " + checkList.size());
			// 2.1 출근 값이 없다면
			if(checkList.size() != 0) {
				// 2.1 출근 처리 
				int checkOff = workTimeMapper.updateCheckOff(vo);
				System.out.println("S : 퇴근 처리 완료 여부 :" + checkOff);
				result = 1;
			// 2.1 출근 값이 있다면 
			}else{
				result = 2;	
			}		
		}
		return result;
	}
	
}
