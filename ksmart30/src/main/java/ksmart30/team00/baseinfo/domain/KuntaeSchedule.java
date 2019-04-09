package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class KuntaeSchedule {

    private String M_NUM;
    private String M_PART;
    private String M_NAME;
    private String WK;
    private String TODAY;
    private String TODAY2;
    private String SUN;
    private String MON;
    private String TUE;
    private String WEN;
    private String THU;
    private String FRI;
    private String SAT;

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
    public String getSUN() {
        return SUN;
    }
    public void setSUN(String sUN) {
        SUN = sUN;
    }
    public String getMON() {
        return MON;
    }
    public void setMON(String mON) {
        MON = mON;
    }
    public String getTUE() {
        return TUE;
    }
    public void setTUE(String tUE) {
        TUE = tUE;
    }
    public String getWEN() {
        return WEN;
    }
    public void setWEN(String wEN) {
        WEN = wEN;
    }
    public String getTHU() {
        return THU;
    }
    public void setTHU(String tHU) {
        THU = tHU;
    }
    public String getFRI() {
        return FRI;
    }
    public void setFRI(String fRI) {
        FRI = fRI;
    }
    public String getSAT() {
        return SAT;
    }
    public void setSAT(String sAT) {
        SAT = sAT;
    }
    public String getTODAY2() {
        return TODAY2;
    }
    public void setTODAY2(String tODAY2) {
        TODAY2 = tODAY2;
    }
}
