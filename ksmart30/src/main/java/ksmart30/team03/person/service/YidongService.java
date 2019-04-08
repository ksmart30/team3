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
}
