package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class KuntaeSchedule {

    private String M_NUM;
    private String M_PART;
    private String M_NAME;
    private String WK;
    private String TODAY;

    public String getM_NUM() {
        return M_NUM;
    }
    public void setM_NUM(String m_NUM) {
        M_NUM = m_NUM;
    }
    public String getM_PART() {
        return M_PART;
    }
    public void setM_PART(String m_PART) {
        M_PART = m_PART;
    }
    public String getM_NAME() {
        return M_NAME;
    }
    public void setM_NAME(String m_NAME) {
        M_NAME = m_NAME;
    }
    public String getWK() {
        return WK;
    }
    public void setWK(String wK) {
        WK = wK;
    }
    public String getTODAY() {
        return TODAY;
    }
    public void setTODAY(String tODAY) {
        TODAY = tODAY;
    } 
}
