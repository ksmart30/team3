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
	
	private String DEPT_NM2; //발령 후 부서명
	private String JIKGUP_NM2; // 발령 후 직급명
	private String JIKCHK_NM2; // 발령 후 직책명
	
	private String O_DEPT_NM; //발령 전 부서명
	private String O_JIKGUP_NM; //발령 전 직급명
	private String O_JIKCHK_NM; //발령 전 직책명
	private String APPOINT_NM; //발령 종류 한글명
	
	
	public String getAPPOINT_NM() {
		return APPOINT_NM;
	}
	public void setAPPOINT_NM(String aPPOINT_NM) {
		APPOINT_NM = aPPOINT_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public int getDEPT_CD() {
		return DEPT_CD;
	}
	public String getO_DEPT_NM() {
		return O_DEPT_NM;
	}
	public void setO_DEPT_NM(String o_DEPT_NM) {
		O_DEPT_NM = o_DEPT_NM;
	}
	public String getO_JIKGUP_NM() {
		return O_JIKGUP_NM;
	}
	public void setO_JIKGUP_NM(String o_JIKGUP_NM) {
		O_JIKGUP_NM = o_JIKGUP_NM;
	}
	public String getO_JIKCHK_NM() {
		return O_JIKCHK_NM;
	}
	public void setO_JIKCHK_NM(String o_JIKCHK_NM) {
		O_JIKCHK_NM = o_JIKCHK_NM;
	}
	public String getDEPT_NM2() {
		return DEPT_NM2;
	}
	public void setDEPT_NM2(String dEPT_NM2) {
		DEPT_NM2 = dEPT_NM2;
	}
	public String getJIKGUP_NM2() {
		return JIKGUP_NM2;
	}
	public void setJIKGUP_NM2(String jIKGUP_NM2) {
		JIKGUP_NM2 = jIKGUP_NM2;
	}
	public String getJIKCHK_NM2() {
		return JIKCHK_NM2;
	}
	public void setJIKCHK_NM2(String jIKCHK_NM2) {
		JIKCHK_NM2 = jIKCHK_NM2;
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
				+ ", APPOINT_SUMMARY=" + APPOINT_SUMMARY + ", REMARK=" + REMARK + ", APPROVE_YN=" + APPROVE_YN
				+ ", DEPT_NM2=" + DEPT_NM2 + ", JIKGUP_NM2=" + JIKGUP_NM2 + ", JIKCHK_NM2=" + JIKCHK_NM2
				+ ", O_DEPT_NM=" + O_DEPT_NM + ", O_JIKGUP_NM=" + O_JIKGUP_NM + ", O_JIKCHK_NM=" + O_JIKCHK_NM
				+ ", APPOINT_NM=" + APPOINT_NM + "]";
	}
}
