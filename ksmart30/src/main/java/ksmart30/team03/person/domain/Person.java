package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String MAIL_ADDRESS;
	private String AUDIT_TM;
	private String BIRTH_DT;
	private String CUR_ADDRESS;
	private String SORT_VALUE;
	private String DEPT_NM;
	private String EMP_NO;
	private String KOR_NM;
	private String JIKGUP_NM;
	private String JIKCHK_NM;
	private String IN_PHONE_NO;
	private String KOR_NM2;
	private String SEX_GB;
	public String getSEX_GB() {
		return SEX_GB;
	}
	public void setSEX_GB(String sEX_GB) {
		SEX_GB = sEX_GB;
	}
	public String getKOR_NM2() {
		return KOR_NM2;
	}
	public void setKOR_NM2(String kOR_NM2) {
		KOR_NM2 = kOR_NM2;
	}
	public String getMAIL_ADDRESS() {
		return MAIL_ADDRESS;
	}
	public void setMAIL_ADDRESS(String mAIL_ADDRESS) {
		MAIL_ADDRESS = mAIL_ADDRESS;
	}
	public String getAUDIT_TM() {
		return AUDIT_TM;
	}
	public void setAUDIT_TM(String aUDIT_TM) {
		AUDIT_TM = aUDIT_TM;
	}
	public String getBIRTH_DT() {
		return BIRTH_DT;
	}
	public void setBIRTH_DT(String bIRTH_DT) {
		BIRTH_DT = bIRTH_DT;
	}
	public String getCUR_ADDRESS() {
		return CUR_ADDRESS;
	}
	public void setCUR_ADDRESS(String cUR_ADDRESS) {
		CUR_ADDRESS = cUR_ADDRESS;
	}

	public String getIN_PHONE_NO() {
		return IN_PHONE_NO;
	}
	public void setIN_PHONE_NO(String iN_PHONE_NO) {
		IN_PHONE_NO = iN_PHONE_NO;
	}
	public String getSORT_VALUE() {
		return SORT_VALUE;
	}
	public void setSORT_VALUE(String sORT_VALUE) {
		SORT_VALUE = sORT_VALUE;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getJIKGUP_NM() {
		return JIKGUP_NM;
	}
	public void setJIKGUP_NM(String jIKGUP_NM) {
		JIKGUP_NM = jIKGUP_NM;
	}
	public String getJIKCHK_NM() {
		return JIKCHK_NM;
	}
	public void setJIKCHK_NM(String jIKCHK_NM) {
		JIKCHK_NM = jIKCHK_NM;
	}
	
	@Override
	public String toString() {
		return "Person [MAIL_ADDRESS=" + MAIL_ADDRESS + ", AUDIT_TM=" + AUDIT_TM + ", BIRTH_DT=" + BIRTH_DT
				+ ", CUR_ADDRESS=" + CUR_ADDRESS + ", SORT_VALUE=" + SORT_VALUE + ", DEPT_NM=" + DEPT_NM + ", EMP_NO="
				+ EMP_NO + ", KOR_NM=" + KOR_NM + ", JIKGUP_NM=" + JIKGUP_NM + ", JIKCHK_NM=" + JIKCHK_NM
				+ ", IN_PHONE_NO=" + IN_PHONE_NO + ", KOR_NM2=" + KOR_NM2 + ", SEX_GB=" + SEX_GB + "]";
	}
   
}
