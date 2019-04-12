package ksmart30.team03.person.domain;

public class PersonRequest {
	private String EMP_NO;
	private String KOR_NM;
	private String AUDIT_TM;
	private String JIKGUP_NM;
	private String JIKCHK_NM;
	private String IN_PHONE_NO;
	private String DEPT_NM;
	private String OUT_DT3;
	
	public String getOUT_DT3() {
		return OUT_DT3;
	}
	public void setOUT_DT3(String oUT_DT3) {
		OUT_DT3 = oUT_DT3;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getSEX_GB() {
		return SEX_GB;
	}
	public void setSEX_GB(String sEX_GB) {
		SEX_GB = sEX_GB;
	}
	private String SEX_GB;
	public String getIN_PHONE_NO() {
		return IN_PHONE_NO;
	}
	public void setIN_PHONE_NO(String iN_PHONE_NO) {
		IN_PHONE_NO = iN_PHONE_NO;
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
	public String getAUDIT_TM() {
		return AUDIT_TM;
	}
	public void setAUDIT_TM(String aUDIT_TM) {
		AUDIT_TM = aUDIT_TM;
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
		return "PersonRequest [EMP_NO=" + EMP_NO + ", KOR_NM=" + KOR_NM + ", AUDIT_TM=" + AUDIT_TM + ", JIKGUP_NM="
				+ JIKGUP_NM + ", JIKCHK_NM=" + JIKCHK_NM + ", IN_PHONE_NO=" + IN_PHONE_NO + ", DEPT_NM=" + DEPT_NM
				+ ", OUT_DT3=" + OUT_DT3 + ", SEX_GB=" + SEX_GB + "]";
	}


}
