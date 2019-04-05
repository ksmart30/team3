package ksmart30.team00.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.system.domain.Ip;
import ksmart30.team00.system.domain.Login;

@Mapper
public interface LoginMapper {

    // 0.2.1 사용자 등록정보 조회 (사원번호(ID), PW, NAME)
    Login getLogin(Login login);
    
    // 0.2.3 접속 기록 등록
    int addConnect(Ip ip);
}
