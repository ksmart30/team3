package com.cafe24.ksmart30.team03.system.vo;

import org.springframework.stereotype.Component;

@Component
public class Ip {

    private String IP;
    private String USER_ID;

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

}