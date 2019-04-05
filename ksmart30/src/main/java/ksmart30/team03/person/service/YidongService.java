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
}
