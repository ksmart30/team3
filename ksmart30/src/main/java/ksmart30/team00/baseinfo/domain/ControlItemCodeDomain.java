/* 10.2.6.관리항목코드
 * @file    ControlItemCodeDomain.java
 * @brief   관리항목코드 Domain
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.domain;

public class ControlItemCodeDomain {
	private String CONT_CD;
	private String CONT_NM;
	private String CODE_FORMAT;
	private String CODE_KIND;
	private String ABLE_YN;
	private String PRT_NM;
	
	public String getCONT_CD() {
		return CONT_CD;
	}
	public void setCONT_CD(String cONT_CD) {
		CONT_CD = cONT_CD;
	}
	public String getCONT_NM() {
		return CONT_NM;
	}
	public void setCONT_NM(String cONT_NM) {
		CONT_NM = cONT_NM;
	}
	public String getCODE_FORMAT() {
		return CODE_FORMAT;
	}
	public void setCODE_FORMAT(String cODE_FORMAT) {
		CODE_FORMAT = cODE_FORMAT;
	}
	public String getCODE_KIND() {
		return CODE_KIND;
	}
	public void setCODE_KiND(String cODE_KIND) {
		CODE_KIND = cODE_KIND;
	}
	public String getABLE_YN() {
		return ABLE_YN;
	}
	public void setABLE_YN(String aBLE_YN) {
		ABLE_YN = aBLE_YN;
	}
	public String getPRT_NM() {
		return PRT_NM;
	}
	public void setPRT_NM(String pRT_NM) {
		PRT_NM = pRT_NM;
	}
	@Override
	public String toString() {
		return "CotrolItemCode [CONT_CD=" + CONT_CD + ", CONT_NM=" + CONT_NM + ", CODE_FORMAT=" + CODE_FORMAT
				+ ", CODE_KIND=" + CODE_KIND + ", ABLE_YN=" + ABLE_YN + ", PRT_NM=" + PRT_NM + "]";
	}
	
	
}
