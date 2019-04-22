package ksmart30.team03.kuntae.domain;

public class WorkTimeSingleList {
	private String KOR_NM;	// 한글 이름 
	private String EMP_NO;	// 사원번호
	private String WORK_DT;	// 기간 시작 날짜
	private String WROK_DT1;// 기간 끝 날짜 
	private String END_DT;	// 끝난 날짜
	private String START_TIME;	// 시작 시각
	private String END_TIME; // 끝난 시각
	private String DEPT_NM;	// 부서 이름
	private String DEPT_CD;	// 부서 코드
	private String JIKGUP_NM; // 직급 이름
	private String JIKCHK_NM; // 직책 이름
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getWORK_DT() {
		return WORK_DT;
	}
	public void setWORK_DT(String wORK_DT) {
		WORK_DT = wORK_DT;
	}
	public String getWROK_DT1() {
		return WROK_DT1;
	}
	public void setWROK_DT1(String wROK_DT1) {
		WROK_DT1 = wROK_DT1;
	}
	public String getEND_DT() {
		return END_DT;
	}
	public void setEND_DT(String eND_DT) {
		END_DT = eND_DT;
	}
	public String getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(String sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public String getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(String eND_TIME) {
		END_TIME = eND_TIME;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
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
		return "WorkTimeSingleList [KOR_NM=" + KOR_NM + ", EMP_NO=" + EMP_NO + ", WORK_DT=" + WORK_DT + ", WROK_DT1="
				+ WROK_DT1 + ", END_DT=" + END_DT + ", START_TIME=" + START_TIME + ", END_TIME=" + END_TIME
				+ ", DEPT_NM=" + DEPT_NM + ", DEPT_CD=" + DEPT_CD + ", JIKGUP_NM=" + JIKGUP_NM + ", JIKCHK_NM="
				+ JIKCHK_NM + "]";
	}

	
}