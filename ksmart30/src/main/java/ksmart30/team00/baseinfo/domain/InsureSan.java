package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class InsureSan {

    private String INSURE_SAN_NO;       // 산재코드 No
    private String INSURE_SAN_GUBUN1;   // 산재보험 대분류 구분
    private String INSURE_SAN_GUBUN2;   // 산재보험 중분류 구분
    private String INSURE_COM_RATE;     // 사용자 부담률(%)
    private String INSURE_APP_DATE;     // 적용년도
    private String INSURE_APP_STATE;    // 적용유무
    private String INSURE_REGI_DATE;    // 등록일자
    private String INSURE_REGI_NAME;    // 등록자
    private String INSURE_NOTE;         // 비고
    
	public String getINSURE_SAN_NO() {
		return INSURE_SAN_NO;
	}
	public void setINSURE_SAN_NO(String iNSURE_SAN_NO) {
		INSURE_SAN_NO = iNSURE_SAN_NO;
	}
	public String getINSURE_SAN_GUBUN1() {
		return INSURE_SAN_GUBUN1;
	}
	public void setINSURE_SAN_GUBUN1(String iNSURE_SAN_GUBUN1) {
		INSURE_SAN_GUBUN1 = iNSURE_SAN_GUBUN1;
	}
	public String getINSURE_SAN_GUBUN2() {
		return INSURE_SAN_GUBUN2;
	}
	public void setINSURE_SAN_GUBUN2(String iNSURE_SAN_GUBUN2) {
		INSURE_SAN_GUBUN2 = iNSURE_SAN_GUBUN2;
	}
	public String getINSURE_COM_RATE() {
		return INSURE_COM_RATE;
	}
	public void setINSURE_COM_RATE(String iNSURE_COM_RATE) {
		INSURE_COM_RATE = iNSURE_COM_RATE;
	}
	public String getINSURE_APP_DATE() {
		return INSURE_APP_DATE;
	}
	public void setINSURE_APP_DATE(String iNSURE_APP_DATE) {
		INSURE_APP_DATE = iNSURE_APP_DATE;
	}
	public String getINSURE_APP_STATE() {
		return INSURE_APP_STATE;
	}
	public void setINSURE_APP_STATE(String iNSURE_APP_STATE) {
		INSURE_APP_STATE = iNSURE_APP_STATE;
	}
	public String getINSURE_REGI_DATE() {
		return INSURE_REGI_DATE;
	}
	public void setINSURE_REGI_DATE(String iNSURE_REGI_DATE) {
		INSURE_REGI_DATE = iNSURE_REGI_DATE;
	}
	public String getINSURE_REGI_NAME() {
		return INSURE_REGI_NAME;
	}
	public void setINSURE_REGI_NAME(String iNSURE_REGI_NAME) {
		INSURE_REGI_NAME = iNSURE_REGI_NAME;
	}
	public String getINSURE_NOTE() {
		return INSURE_NOTE;
	}
	public void setINSURE_NOTE(String iNSURE_NOTE) {
		INSURE_NOTE = iNSURE_NOTE;
	}
	@Override
	public String toString() {
		return "InsureSan [INSURE_SAN_NO=" + INSURE_SAN_NO + ", INSURE_SAN_GUBUN1=" + INSURE_SAN_GUBUN1
				+ ", INSURE_SAN_GUBUN2=" + INSURE_SAN_GUBUN2 + ", INSURE_COM_RATE=" + INSURE_COM_RATE
				+ ", INSURE_APP_DATE=" + INSURE_APP_DATE + ", INSURE_APP_STATE=" + INSURE_APP_STATE
				+ ", INSURE_REGI_DATE=" + INSURE_REGI_DATE + ", INSURE_REGI_NAME=" + INSURE_REGI_NAME + ", INSURE_NOTE="
				+ INSURE_NOTE + "]";
	} 
}
