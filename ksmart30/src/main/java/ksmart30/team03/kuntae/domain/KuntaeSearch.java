package ksmart30.team03.kuntae.domain;

import org.springframework.stereotype.Component;

@Component
public class KuntaeSearch {
	private String FRDATE;
	private String TODATE;
	private String DEPT_CD;
	private String CONFIRM_YN; //승인여부
	private String APP_NM; //근태구분명
	private String EMP_NM; //사원명
	private String APP_GB;

	public String getAPP_GB() {
		return APP_GB;
	}
	public void setAPP_GB(String aPP_GB) {
		APP_GB = aPP_GB;
	}
	public String getCONFIRM_YN() {
		return CONFIRM_YN;
	}
	public void setCONFIRM_YN(String cONFIRM_YN) {
		CONFIRM_YN = cONFIRM_YN;
	}
	public String getAPP_NM() {
		return APP_NM;
	}
	public void setAPP_NM(String aPP_NM) {
		APP_NM = aPP_NM;
	}
	public String getEMP_NM() {
		return EMP_NM;
	}
	public void setEMP_NM(String eMP_NM) {
		EMP_NM = eMP_NM;
	}
	public String getFRDATE() {
		return FRDATE;
	}
	public void setFRDATE(String fRDATE) {
		FRDATE = fRDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	@Override
	public String toString() {
		return "KuntaeSearch [FRDATE=" + FRDATE + ", TODATE=" + TODATE + ", DEPT_CD=" + DEPT_CD + ", CONFIRM_YN="
				+ CONFIRM_YN + ", APP_NM=" + APP_NM + ", EMP_NM=" + EMP_NM + ", APP_GB=" + APP_GB + "]";
	}
}
