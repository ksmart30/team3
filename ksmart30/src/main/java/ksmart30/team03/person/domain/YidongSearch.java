package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class YidongSearch {
	
	private String APPOINT_DT; //명령일자 시작
	private String APPOINT_DT2; //명령일자 끝
	private String APPROVE_YN; //승인여부

	public String getAPPOINT_DT() {
		return APPOINT_DT;
	}
	public void setAPPOINT_DT(String aPPOINT_DT) {
		APPOINT_DT = aPPOINT_DT;
	}
	public String getAPPROVE_YN() {
		return APPROVE_YN;
	}
	public void setAPPROVE_YN(String aPPROVE_YN) {
		APPROVE_YN = aPPROVE_YN;
	}

	public String getAPPOINT_DT2() {
		return APPOINT_DT2;
	}
	public void setAPPOINT_DT2(String aPPOINT_DT2) {
		APPOINT_DT2 = aPPOINT_DT2;
	}
	@Override
	public String toString() {
		return "YidongSearch [APPOINT_DT=" + APPOINT_DT + ", APPOINT_DT2=" + APPOINT_DT2 + ", APPROVE_YN=" + APPROVE_YN
				+ "]";
	}
	
}
