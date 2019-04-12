package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class Insure {
    
    private String INSURE_NO;           // 4대보험 코드
    private String INSURE_GUBUN1;       // 4대보험 종류
    private String INSURE_GUBUN2;       // 4대보험 대분류
    private String INSURE_EMP_RATE;     // 4대보험 요율(근로자)
    private String INSURE_COM_RATE;     // 4대보험 요율(사업주)
    private String INSURE_APP_DATE;     // 4대보험 적용일자
    private String INSURE_REGI_DATE;    // 4대보험 등록일자
    private String INSURE_REGI_NAME;    // 4대보험 등록자
    private String INSURE_NOTE;         // 기타
    
    private int INSURE_PAY;             // 월 급여
    private int INSURE_TOTAL;           // 전체 계산
    private int INSURE_EMP_CAL;         // 근로자 계산
    private int INSURE_COM_CAL;         // 사업주 계산
     
	public int getINSURE_PAY() {
		return INSURE_PAY;
	}
	public void setINSURE_PAY(int iNSURE_PAY) {
		INSURE_PAY = iNSURE_PAY;
	}
	public int getINSURE_TOTAL() {
		return INSURE_TOTAL;
	}
	public void setINSURE_TOTAL(int iNSURE_TOTAL) {
		INSURE_TOTAL = iNSURE_TOTAL;
	}
	public int getINSURE_EMP_CAL() {
		return INSURE_EMP_CAL;
	}
	public void setINSURE_EMP_CAL(int iNSURE_EMP_CAL) {
		INSURE_EMP_CAL = iNSURE_EMP_CAL;
	}
	public int getINSURE_COM_CAL() {
		return INSURE_COM_CAL;
	}
	public void setINSURE_COM_CAL(int iNSURE_COM_CAL) {
		INSURE_COM_CAL = iNSURE_COM_CAL;
	}
	public String getINSURE_NO() {
		return INSURE_NO;
	}
	public void setINSURE_NO(String iNSURE_NO) {
		INSURE_NO = iNSURE_NO;
	}
	public String getINSURE_GUBUN1() {
		return INSURE_GUBUN1;
	}
	public void setINSURE_GUBUN1(String iNSURE_GUBUN1) {
		INSURE_GUBUN1 = iNSURE_GUBUN1;
	}
	public String getINSURE_GUBUN2() {
		return INSURE_GUBUN2;
	}
	public void setINSURE_GUBUN2(String iNSURE_GUBUN2) {
		INSURE_GUBUN2 = iNSURE_GUBUN2;
	}
	public String getINSURE_EMP_RATE() {
		return INSURE_EMP_RATE;
	}
	public void setINSURE_EMP_RATE(String iNSURE_EMP_RATE) {
		INSURE_EMP_RATE = iNSURE_EMP_RATE;
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
		return "Insure [INSURE_NO=" + INSURE_NO + ", INSURE_GUBUN1=" + INSURE_GUBUN1 + ", INSURE_GUBUN2="
				+ INSURE_GUBUN2 + ", INSURE_EMP_RATE=" + INSURE_EMP_RATE + ", INSURE_COM_RATE=" + INSURE_COM_RATE
				+ ", INSURE_APP_DATE=" + INSURE_APP_DATE + ", INSURE_REGI_DATE=" + INSURE_REGI_DATE
				+ ", INSURE_REGI_NAME=" + INSURE_REGI_NAME + ", INSURE_NOTE=" + INSURE_NOTE + ", INSURE_PAY=" + INSURE_PAY
				+ ", INSURE_TOTAL=" + INSURE_TOTAL + ", INSURE_EMP_CAL=" + INSURE_EMP_CAL + ", INSURE_COM_CAL="
				+ INSURE_COM_CAL + "]";
	}
}
