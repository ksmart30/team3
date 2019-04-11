package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ResultRequest {
	private String EMP_NO;    //1.사원번호
	private String WORK_DT;   //2.작업일자
	private String PJT_CD;    //3.프로젝트코드
	private String WORK_STEP; //4.작업단계
	private String WORK_SPEC; //5.작업내용
	private String DEPT_CD;   //6.부서코드
	private String WORK_TIME; //7.작업시간
	private String ETC_SPEC;  //8.상세내용
	private String JIKGUP_CD; //9.직급코드
	private String A_DEPT_CD;  //10.부서코드
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
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getWORK_STEP() {
		return WORK_STEP;
	}
	public void setWORK_STEP(String wORK_STEP) {
		WORK_STEP = wORK_STEP;
	}
	public String getWORK_SPEC() {
		return WORK_SPEC;
	}
	public void setWORK_SPEC(String wORK_SPEC) {
		WORK_SPEC = wORK_SPEC;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getWORK_TIME() {
		return WORK_TIME;
	}
	public void setWORK_TIME(String wORK_TIME) {
		WORK_TIME = wORK_TIME;
	}
	public String getETC_SPEC() {
		return ETC_SPEC;
	}
	public void setETC_SPEC(String eTC_SPEC) {
		ETC_SPEC = eTC_SPEC;
	}
	public String getJIKGUP_CD() {
		return JIKGUP_CD;
	}
	public void setJIKGUP_CD(String jIKGUP_CD) {
		JIKGUP_CD = jIKGUP_CD;
	}
	public String getA_DEPT_CD() {
		return A_DEPT_CD;
	}
	public void setA_DEPT_CD(String a_DEPT_CD) {
		A_DEPT_CD = a_DEPT_CD;
	}
	@Override
	public String toString() {
		return "Result [EMP_NO=" + EMP_NO + ", WORK_DT=" + WORK_DT + ", PJT_CD=" + PJT_CD + ", WORK_STEP=" + WORK_STEP
				+ ", WORK_SPEC=" + WORK_SPEC + ", DEPT_CD=" + DEPT_CD + ", WORK_TIME=" + WORK_TIME + ", ETC_SPEC="
				+ ETC_SPEC + ", JIKGUP_CD=" + JIKGUP_CD + ", A_DEPT_CD=" + A_DEPT_CD + "]";
	}
	
}
