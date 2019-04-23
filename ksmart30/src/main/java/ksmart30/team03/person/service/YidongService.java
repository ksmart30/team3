package ksmart30.team03.person.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.mapper.YidongMapper;

@Service
public class YidongService {
@Autowired YidongMapper yidongMapper;
	public List<Yidong> getYidongList(){
		System.out.println("getYidongList 메서드 호출 서비스");
		return yidongMapper.getYidongList();
	};
	//직원 클릭시 발령전정보 출력
	public List<Yidong> getYidongList2(String emp_no) {
		System.out.println("getYidongList2 메서드 입력폼에 발령전 정보 출력 서비스");
		return yidongMapper.getYidongList2(emp_no);
	}
	//직원 클릭시 관련 발령대장 list 출력
	public List<Yidong> getYidongList3(String emp_no) {
		System.out.println("직원클릭시 관련 발령정보 출력");
		return yidongMapper.getYidongList3(emp_no);
	}
	//직원 검색 list 출력
	public List<Yidong> searchYidongList(String KOR_NM) {
		System.out.println("searchYidongList 검색 기능 서비스");
		List<Yidong> data = yidongMapper.getYidongList();
		if(KOR_NM =="") {
			System.out.println("사원명 입력값 null일 경우 출력");
			data = yidongMapper.getYidongList();
		}else {
			data = yidongMapper.searchYidongList(KOR_NM);
		}
		return data;
	}
	//명령구분 옵션값 가져오기
	public List<Map<String,Object>> appGb(){
		List<Map<String,Object>> result = yidongMapper.appGb();
		return result;
	}
	//발령 등록 메서드
	public int addYidongList(Yidong yidong) {
		int result = yidongMapper.addYidongList(yidong);
		return result;
	}
}
