package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class School {
    private String SCHOOL_GB;	// 학력구분
    private String SCHOOL_CD;	// 학교코드
	private String SCHOOL_NM;	// 학교명
	private String AUDIT_ID;	// 등록자
    private String AUDIT_TM;	// 등록일시
    
	public String getSCHOOL_GB() {
		return SCHOOL_GB;
	}
	public void setSCHOOL_GB(String sCHOOL_GB) {
		SCHOOL_GB = sCHOOL_GB;
	}
	public String getSCHOOL_CD() {
		return SCHOOL_CD;
	}
	public void setSCHOOL_CD(String sCHOOL_CD) {
		SCHOOL_CD = sCHOOL_CD;
	}
	public String getSCHOOL_NM() {
		return SCHOOL_NM;
	}
	public void setSCHOOL_NM(String sCHOOL_NM) {
		SCHOOL_NM = sCHOOL_NM;
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
	
	@Override
	public String toString() {
		return "School [SCHOOL_GB=" + SCHOOL_GB + ", SCHOOL_CD=" + SCHOOL_CD + ", SCHOOL_NM=" + SCHOOL_NM + ", AUDIT_ID=" + AUDIT_ID + ", AUDIT_TM=" + AUDIT_TM + "]";
	}
}
