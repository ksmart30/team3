package ksmart30.team00.system.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.system.domain.Ip;
import ksmart30.team00.system.domain.Login;
import ksmart30.team00.system.mapper.LoginMapper;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private Login loginResult;
    @Autowired
    private Ip ip;

    // 로그인 처리
    public int login(HttpSession session, HttpServletRequest request, Login login) throws UnknownHostException {
        System.out.println("(S) login() : 로그인 처리");
        // 리턴값 초기화
        int result = 0;
        // 출력확인
        System.out.println("(S)입력 받은 ID :" + login.getEMP_NO());
		System.out.println("(S)입력 받은 PW :" + login.getPASS_WD());
        // Mapper를 이용한 로그인 처리
        loginResult = loginMapper.addLogin(login);
        System.out.println("값 : " + loginResult);
        System.out.println("(M) 로그인처리 쿼리 실행완료");
        // 로그인 성공여부에 따른 처리 (1:성공 0:실패)
        if (loginResult != null) {
            System.out.println("로그인 성공 !");
            // 접속 IP정보 가져오기
            InetAddress catchIp = InetAddress.getLocalHost();
            String connentIp = catchIp.getHostAddress();
            System.out.println("가져온 IP정보 : " + connentIp);
            // id, ip정보를 loginIP객체에 Set (접속 기록을 남기기 위해서)
            ip.setUSER_ID(loginResult.getEMP_NO());
            ip.setIP(connentIp);
            // 접속 기록 남기기
            int connect = loginMapper.addConnect(ip);
            System.out.println("접속 기록 성공여부 (1:성공, 0:실패) : " + connect);
            // 로그인 정보 세션 처리
            session.setAttribute("id", login.getEMP_NO());
            session.setAttribute("pw", login.getPASS_WD());
            result = 1;
        }else {
            // 로그인 실패
            System.out.println("로그인 실패 !");
        }
        return result;
    }

    // 로그아웃 처리
    public void logout(HttpSession session) {
        System.out.println("(S) logout() : 로그아웃 처리");
        session.invalidate();
        System.out.println("로그아웃 처리 완료");
    }

}

