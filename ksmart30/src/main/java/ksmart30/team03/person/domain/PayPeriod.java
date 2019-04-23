package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class PayPeriod {
	
	private String EMP_NO;			// 사원번호
	private String ITEM_GB;			// 항목분류
	private String ITEM_CD;			// 항목코드
    private String STA_DATE;		// 시작일자
    private String END_DATE;		// 종료일자
    private String GIVETAKE_AMT;	// 차액
    private String AUDIT_ID;		// 등록자
    private String ITEM_NM;			// 항목명

	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getITEM_GB() {
		return ITEM_GB;
	}
	public void setITEM_GB(String iTEM_GB) {
		ITEM_GB = iTEM_GB;
	}
	public String getITEM_CD() {
		return ITEM_CD;
	}
	public void setITEM_CD(String iTEM_CD) {
		ITEM_CD = iTEM_CD;
	}
	public String getSTA_DATE() {
		return STA_DATE;
	}
	public void setSTA_DATE(String sTA_DATE) {
		STA_DATE = sTA_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getGIVETAKE_AMT() {
		return GIVETAKE_AMT;
	}
	public void setGIVETAKE_AMT(String gIVETAKE_AMT) {
		GIVETAKE_AMT = gIVETAKE_AMT;
	}
	public String getAUDIT_ID() {
		return AUDIT_ID;
	}
	public void setAUDIT_ID(String aUDIT_ID) {
		AUDIT_ID = aUDIT_ID;
	}
	public String getITEM_NM() {
		return ITEM_NM;
	}
	public void setITEM_NM(String iTEM_NM) {
		ITEM_NM = iTEM_NM;
	}
	@Override
	public String toString() {
		return "PayPeriod [AUDIT_ID=" + AUDIT_ID + ", EMP_NO=" + EMP_NO + ", END_DATE=" + END_DATE + ", GIVETAKE_AMT="
				+ GIVETAKE_AMT + ", ITEM_CD=" + ITEM_CD + ", ITEM_GB=" + ITEM_GB + ", ITEM_NM=" + ITEM_NM
				+ ", STA_DATE=" + STA_DATE + "]";
	}
}
