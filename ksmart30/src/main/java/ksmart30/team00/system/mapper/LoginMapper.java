package ksmart30.team00.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.system.domain.Ip;
import ksmart30.team00.system.domain.Login;

@Mapper
public interface LoginMapper {

    // 로그인 처리
    Login addLogin(Login login);

    // 접속 기록 등록
    int addConnect(Ip ip);
}
