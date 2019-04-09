package ksmart30.team03.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.mapper.YidongRegisterMapper;

@Service
public class YidongRegisterService {
@Autowired YidongRegisterMapper yidongRegisterMapper;
	public List<Yidong> getYidongRegister(){
		System.out.println("getYidongRegister 메서드 호출 서비스");
		return yidongRegisterMapper.getYidongRegister();
	}
}
