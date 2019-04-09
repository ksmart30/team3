package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class Yidong {
	private String EMP_NO; //사원번호
	private String KOR_NM; //성명
	private int DEPT_CD; //부서 코드
	private int JIKGUP_CD; //직급 코드
	private int JIKCHK_CD; //직책 코드
	private String DEPT_NM; //부서명
	private String JIKGUP_NM; //직급명
	private String JIKCHK_NM; //직책명
	private String APPOINT_NO; //명령번호(인사발령대장)
	private String APPOINT_GB; //명령종류
	private String APPOINT_DT; //명령일자
	private String APPOINT_SUMMARY; //명령내역
	private String REMARK; //비고
	private String APPROVE_YN; //승인여부
	public String getEMP_NO() {
		return EMP_NO;
	}
	public int getDEPT_CD() {
		return DEPT_CD;
	}
	public String getAPPOINT_NO() {
		return APPOINT_NO;
	}
	public void setAPPOINT_NO(String aPPOINT_NO) {
		APPOINT_NO = aPPOINT_NO;
	}
	public String getAPPOINT_GB() {
		return APPOINT_GB;
	}
	public void setAPPOINT_GB(String aPPOINT_GB) {
		APPOINT_GB = aPPOINT_GB;
	}
	public String getAPPOINT_DT() {
		return APPOINT_DT;
	}
	public void setAPPOINT_DT(String aPPOINT_DT) {
		APPOINT_DT = aPPOINT_DT;
	}
	public String getAPPOINT_SUMMARY() {
		return APPOINT_SUMMARY;
	}
	public void setAPPOINT_SUMMARY(String aPPOINT_SUMMARY) {
		APPOINT_SUMMARY = aPPOINT_SUMMARY;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getAPPROVE_YN() {
		return APPROVE_YN;
	}
	public void setAPPROVE_YN(String aPPROVE_YN) {
		APPROVE_YN = aPPROVE_YN;
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
	public void setEMP_NO(String eMP_NO) {
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
				+ JIKCHK_NM + ", APPOINT_NO=" + APPOINT_NO + ", APPOINT_GB=" + APPOINT_GB + ", APPOINT_DT=" + APPOINT_DT
				+ ", APPOINT_SUMMARY=" + APPOINT_SUMMARY + ", REMARK=" + REMARK + ", APPROVE_YN=" + APPROVE_YN + "]";
	}
}
