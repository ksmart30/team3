package ksmart30.team03.person.service;

import java.util.List;

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
	
	public List<Yidong> getYidongList2(String emp_no) {
		System.out.println("getYidongList2 메서드 입력폼에 발령전 정보 출력 서비스");
		return yidongMapper.getYidongList2(emp_no);
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
	
}
