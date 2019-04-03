package com.cafe24.ksmart30.team00.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team00.system.vo.Ip;
import com.cafe24.ksmart30.team00.system.vo.Login;

@Mapper
public interface LoginMapper {

    // 로그인 처리
    Login login(Login login);

    // 접속 기록 등록
    int connect(Ip ip);
}
