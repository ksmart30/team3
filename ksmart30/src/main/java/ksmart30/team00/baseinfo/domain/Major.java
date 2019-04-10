package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class Major {
    private String MAJOR_CD;	// 전공코드
	private String MAJOR_NM;	// 전공이름
	private String AUDIT_ID;	// 등록자
    private String AUDIT_TM;	// 등록일시
    
	public String getMAJOR_CD() {
		return MAJOR_CD;
	}
	public void setMAJOR_CD(String mAJOR_CD) {
		MAJOR_CD = mAJOR_CD;
	}
	public String getMAJOR_NM() {
		return MAJOR_NM;
	}
	public void setMAJOR_NM(String mAJOR_NM) {
		MAJOR_NM = mAJOR_NM;
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
		return "Major [MAJOR_CD=" + MAJOR_CD + ", MAJOR_NM=" + MAJOR_NM + ", AUDIT_ID=" + AUDIT_ID + ", AUDIT_TM=" + AUDIT_TM + "]";
	}
}
