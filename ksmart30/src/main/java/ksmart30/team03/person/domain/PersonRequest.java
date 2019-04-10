package ksmart30.team03.person.domain;

public class PersonRequest {
	private String EMP_NO;
	private String KOR_NM;
	private String AUDIT_TM;
	private String JIKGUP_NM;
	private String JIKCHK_NM;
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
				+ JIKGUP_NM + ", JIKCHK_NM=" + JIKCHK_NM + "]";
	}


}
