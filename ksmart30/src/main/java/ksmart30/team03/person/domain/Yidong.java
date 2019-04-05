package ksmart30.team03.person.domain;

public class Yidong {
	private int EMP_NO;
	private String KOR_NM;
	private int DEPT_CD;
	private int JIKGUP_CD;
	private int JIKCHK_CD;
	private String DEPT_NM;
	private String JIKGUP_NM;
	private String JIKCHK_NM;
	public int getEMP_NO() {
		return EMP_NO;
	}
	public int getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(int dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public int getJIKGUP_CD() {
		return JIKGUP_CD;
	}
	public void setJIKGUP_CD(int jIKGUP_CD) {
		JIKGUP_CD = jIKGUP_CD;
	}
	public int getJIKCHK_CD() {
		return JIKCHK_CD;
	}
	public void setJIKCHK_CD(int jIKCHK_CD) {
		JIKCHK_CD = jIKCHK_CD;
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
	public String getJIKCHK_NM() {
		return JIKCHK_NM;
	}
	public void setJIKCHK_NM(String jIKCHK_NM) {
		JIKCHK_NM = jIKCHK_NM;
	}
	public void setEMP_NO(int eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	@Override
	public String toString() {
		return "Yidong [EMP_NO=" + EMP_NO + ", KOR_NM=" + KOR_NM + ", DEPT_CD=" + DEPT_CD + ", JIKGUP_CD=" + JIKGUP_CD
				+ ", JIKCHK_CD=" + JIKCHK_CD + ", DEPT_NM=" + DEPT_NM + ", JIKGUP_NM=" + JIKGUP_NM + ", JIKCHK_NM="
				+ JIKCHK_NM + "]";
	}
}
