package ksmart30.team03.kuntae.domain;

public class WorkTime {
	private String LATE_CNT;	// 지각 횟수
	private String LATE_TIME;	// 지각 누계
	private String EMP_NO;		// 사원번호
	private String WORK_DT;		// 동일 컬럼 근무 날짜 기간 설정 1
	private String WORK_DT1;	// 동일 컬럼 근무 날짜 기간 설정 2
	private String KOR_NM;
	public String getLATE_CNT() {
		return LATE_CNT;
	}
	public void setLATE_CNT(String lATE_CNT) {
		LATE_CNT = lATE_CNT;
	}
	public String getLATE_TIME() {
		return LATE_TIME;
	}
	public void setLATE_TIME(String lATE_TIME) {
		LATE_TIME = lATE_TIME;
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
	public String getWORK_DT1() {
		return WORK_DT1;
	}
	public void setWORK_DT1(String wORK_DT1) {
		WORK_DT1 = wORK_DT1;
	}
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	@Override
	public String toString() {
		return "WorkTime [LATE_CNT=" + LATE_CNT + ", LATE_TIME=" + LATE_TIME + ", EMP_NO=" + EMP_NO + ", WORK_DT="
				+ WORK_DT + ", WORK_DT1=" + WORK_DT1 + ", KOR_NM=" + KOR_NM + "]";
	}
	
	
	
	
	
	
}
