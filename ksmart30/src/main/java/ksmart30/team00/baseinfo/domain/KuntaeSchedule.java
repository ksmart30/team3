package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class KuntaeSchedule {

    private String DAY_YM;      // 년월
	private String DAY_DD;      // 일
	private String DAY_WEEK;    // 주
	private String HOLID_GB;    // 휴일(토,일 또는 휴무일)
	private String HOLID_NM;    // 휴일명
	private String AUDIT_ID;    // 등록 및 수정한 아이디
	private String AUDIT_TM;    // 등록 및 수정일자

    public String getDAY_YM() {
        return DAY_YM;
    }
    public void setDAY_YM(String dAY_YM) {
        DAY_YM = dAY_YM;
    }
    public String getDAY_DD() {
        return DAY_DD;
    }
    public void setDAY_DD(String dAY_DD) {
        DAY_DD = dAY_DD;
    }
    public String getDAY_WEEK() {
        return DAY_WEEK;
    }
    public void setDAY_WEEK(String dAY_WEEK) {
        DAY_WEEK = dAY_WEEK;
    }
    public String getHOLID_GB() {
        return HOLID_GB;
    }
    public void setHOLID_GB(String hOLID_GB) {
        HOLID_GB = hOLID_GB;
    }
    public String getHOLID_NM() {
        return HOLID_NM;
    }
    public void setHOLID_NM(String hOLID_NM) {
        HOLID_NM = hOLID_NM;
    }
    public String getAUDIT_ID() {
        return AUDIT_ID;
    }
    public void setAUDIT_ID(String aUDIT_ID) {
        AUDIT_ID = aUDIT_ID;
    }
    public String getAUDIT_TM() {
        return AUDIT_TM;
    }
    public void setAUDIT_TM(String aUDIT_TM) {
        AUDIT_TM = aUDIT_TM;
    }
}
