package ksmart30.team00.baseinfo.domain;

public class BusinessCard {
	private String EMP_NO;
	private String CARD_NO;
	private String VALID_DATE;
	private String BANK_CD;
	private String BANK_ACCNO;
	private String POPUP_YN;
	private String JOIN_EMP_NO;
	private String CARD_MEMO;
	private String CARD_DESCR;
	private String AUDIT_ID;
	private String AUDIT_TM;
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getCARD_NO() {
		return CARD_NO;
	}
	public void setCARD_NO(String cARD_NO) {
		CARD_NO = cARD_NO;
	}
	public String getVALID_DATE() {
		return VALID_DATE;
	}
	public void setVALID_DATE(String vALID_DATE) {
		VALID_DATE = vALID_DATE;
	}
	public String getBANK_CD() {
		return BANK_CD;
	}
	public void setBANK_CD(String bANK_CD) {
		BANK_CD = bANK_CD;
	}
	public String getBANK_ACCNO() {
		return BANK_ACCNO;
	}
	public void setBANK_ACCNO(String bANK_ACCNO) {
		BANK_ACCNO = bANK_ACCNO;
	}
	public String getPOPUP_YN() {
		return POPUP_YN;
	}
	public void setPOPUP_YN(String pOPUP_YN) {
		POPUP_YN = pOPUP_YN;
	}
	public String getJOIN_EMP_NO() {
		return JOIN_EMP_NO;
	}
	public void setJOIN_EMP_NO(String jOIN_EMP_NO) {
		JOIN_EMP_NO = jOIN_EMP_NO;
	}
	public String getCARD_MEMO() {
		return CARD_MEMO;
	}
	public void setCARD_MEMO(String cARD_MEMO) {
		CARD_MEMO = cARD_MEMO;
	}
	public String getCARD_DESCR() {
		return CARD_DESCR;
	}
	public void setCARD_DESCR(String cARD_DESCR) {
		CARD_DESCR = cARD_DESCR;
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
		return "BusinessCard [EMP_NO=" + EMP_NO + ", CARD_NO=" + CARD_NO + ", VALID_DATE=" + VALID_DATE + ", BANK_CD="
				+ BANK_CD + ", BANK_ACCNO=" + BANK_ACCNO + ", POPUP_YN=" + POPUP_YN + ", JOIN_EMP_NO=" + JOIN_EMP_NO
				+ ", CARD_MEMO=" + CARD_MEMO + ", CARD_DESCR=" + CARD_DESCR + ", AUDIT_ID=" + AUDIT_ID + ", AUDIT_TM="
				+ AUDIT_TM + "]";
	}
	
}
