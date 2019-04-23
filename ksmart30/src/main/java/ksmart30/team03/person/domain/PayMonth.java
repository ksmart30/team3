package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class PayMonth {

	private String EMP_NO;		// 사원번호
	private String DEPT_NM;		// 부서이름
	private String JIKGUP_NM;	// 직급이름
	private String KOR_NM;		// 성명
	private String PAY_GB;		// 급여구분
	private String PAYTOT;		// 급여총액
	private String BIKWAT;		// 비과세급여
	private String KWASET;		// 과세급여
	private String SODUK_TAX;	// 소득세
	private String JUMIN_TAX;	// 주민세
	private String H_INSURE;	// 건강보험
	private String PENSION; 	// 국민연금
	private String E_INSURE;	// 고용보험
	private String CHAGAM;		// 차감지급액
	private String PAY_DT;		// 지급일자
	private String PAY_YYMM;	// 급여일자
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getJIKGUP_NM() {
		return JIKGUP_NM;
	}
	public void setJIKGUP_NM(String jIKGUP_NM) {
		JIKGUP_NM = jIKGUP_NM;
	}
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getPAY_GB() {
		return PAY_GB;
	}
	public void setPAY_GB(String pAY_GB) {
		PAY_GB = pAY_GB;
	}
	public String getPAYTOT() {
		return PAYTOT;
	}
	public void setPAYTOT(String pAYTOT) {
		PAYTOT = pAYTOT;
	}
	public String getBIKWAT() {
		return BIKWAT;
	}
	public void setBIKWAT(String bIKWAT) {
		BIKWAT = bIKWAT;
	}
	public String getKWASET() {
		return KWASET;
	}
	public void setKWASET(String kWASET) {
		KWASET = kWASET;
	}
	public String getSODUK_TAX() {
		return SODUK_TAX;
	}
	public void setSODUK_TAX(String sODUK_TAX) {
		SODUK_TAX = sODUK_TAX;
	}
	public String getJUMIN_TAX() {
		return JUMIN_TAX;
	}
	public void setJUMIN_TAX(String jUMIN_TAX) {
		JUMIN_TAX = jUMIN_TAX;
	}
	public String getH_INSURE() {
		return H_INSURE;
	}
	public void setH_INSURE(String h_INSURE) {
		H_INSURE = h_INSURE;
	}
	public String getPENSION() {
		return PENSION;
	}
	public String getPAY_YYMM() {
		return PAY_YYMM;
	}
	public void setPAY_YYMM(String pAY_YYMM) {
		PAY_YYMM = pAY_YYMM;
	}
	public void setPENSION(String pENSION) {
		PENSION = pENSION;
	}
	public String getE_INSURE() {
		return E_INSURE;
	}
	public void setE_INSURE(String e_INSURE) {
		E_INSURE = e_INSURE;
	}
	public String getCHAGAM() {
		return CHAGAM;
	}
	public void setCHAGAM(String cHAGAM) {
		CHAGAM = cHAGAM;
	}
	public String getPAY_DT() {
		return PAY_DT;
	}
	public void setPAY_DT(String pAY_DT) {
		PAY_DT = pAY_DT;
	}
	@Override
	public String toString() {
		return "PayMonth [EMP_NO=" + EMP_NO + ", DEPT_NM=" + DEPT_NM + ", JIKGUP_NM=" + JIKGUP_NM + ", KOR_NM=" + KOR_NM
				+ ", PAY_GB=" + PAY_GB + ", PAYTOT=" + PAYTOT + ", BIKWAT=" + BIKWAT + ", KWASET=" + KWASET
				+ ", SODUK_TAX=" + SODUK_TAX + ", JUMIN_TAX=" + JUMIN_TAX + ", H_INSURE=" + H_INSURE + ", PENSION="
				+ PENSION + ", E_INSURE=" + E_INSURE + ", CHAGAM=" + CHAGAM + ", PAY_DT=" + PAY_DT + ", PAY_YYMM="
				+ PAY_YYMM + "]";
	}	
}