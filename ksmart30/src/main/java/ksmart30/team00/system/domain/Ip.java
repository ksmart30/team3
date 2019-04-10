package ksmart30.team00.system.domain;

import org.springframework.stereotype.Component;

@Component
public class Ip {

    private String IP;      // IP정보
    private String USER_ID; // 로그인ID

    public String getIP() {
        return IP;
    }
    public void setIP(String iP) {
        IP = iP;
    }
    public String getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }
    @Override
	public String toString() {
		return "Ip [IP=" + IP + ", USER_ID=" + USER_ID +"]";
	}

}