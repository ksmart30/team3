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

    // 0.2 로그인 처리
    public int getLogin(HttpSession session, HttpServletRequest request, Login login) throws UnknownHostException {
        System.out.println("(S) login() : 로그인 처리");
        // 1. 리턴값 초기화
        int result = 0;
        // 3. Mapper를 이용한 사용자 등록정보 (SELECT)
        loginResult = loginMapper.getLogin(login);
        System.out.println("Login객체 주소값 : " + loginResult);
        System.out.println("(M) 등록정보 조회 쿼리 실행완료");
        // 4.1 로그인 성공여부에 따른 처리
        if (loginResult != null) {
            System.out.println("로그인 성공 !");
            // 4.1.2 접속 IP정보 가져오기
            InetAddress catchIp = InetAddress.getLocalHost();
            String connentIp = catchIp.getHostAddress();
            System.out.println("가져온 IP정보 : " + connentIp);
            // 4.1.3 id, ip정보를 loginIP객체에 Set (접속 기록을 남기기 위해서)
            ip.setUSER_ID(loginResult.getEMP_NO());
            ip.setIP(connentIp);
            // 4.1.4 접속 기록 남기기
            int connect = loginMapper.addConnect(ip);
            System.out.println("접속기록 등록처리 (1:성공, 0:실패) : " + connect);
            // 4.1.5 로그인 정보 세션 처리
            session.setAttribute("EMP_NO", loginResult.getEMP_NO());
            System.out.println("ID :" + session.getAttribute("EMP_NO"));
            session.setAttribute("PASS_WD", loginResult.getPASS_WD());
            System.out.println("PW :" + session.getAttribute("PASS_WD"));
            session.setAttribute("KOR_NM", loginResult.getKOR_NM());
            System.out.println("이름 :" + session.getAttribute("KOR_NM"));
            result = 1;
        }else {
            // 4.2 로그인 실패
            System.out.println("로그인 실패 !");
        }
        return result;
    }

    // 0.3 로그아웃 처리
    public void logout(HttpSession session) {
        System.out.println("(S) logout() : 로그아웃 처리");
        session.invalidate();
        System.out.println("로그아웃 처리 완료");
    }

}

