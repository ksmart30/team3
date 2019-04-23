package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class PayYear{

	private String EMP_NO;		// 사원번호
	private String DEPT_CD;		// 부서코드
	private String DEPT_NM;		// 부서이름
	private String JIKGUP_NM;	// 직급이름
	private String KOR_NM;		// 성명
	private String GUBUN;		// 급여구분
	private String PAY_01;			// 1월 급여
	private String PAY_02;			// 2월 급여
	private String PAY_03;			// 3월 급여
	private String PAY_04;			// 4월 급여
	private String PAY_05;			// 5월 급여
	private String PAY_06;			// 6월 급여
	private String PAY_07;			// 7월 급여
	private String PAY_08;			// 8월 급여
	private String PAY_09;			// 9월 급여
	private String PAY_10;			// 10월 급여
	private String PAY_11;			// 11월 급여
	private String PAY_12;			// 12월 급여
	private String PAY_TOT;		// 총 급여
	private String PAY_YYMM;	// 급여일자
	
	public String getPAY_YYMM() {
		return PAY_YYMM;
	}
	public void setPAY_YYMM(String pAY_YYMM) {
		PAY_YYMM = pAY_YYMM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
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
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
	}
	public String getPAY_01() {
		return PAY_01;
	}
	public void setPAY_01(String pAY_01) {
		PAY_01 = pAY_01;
	}
	public String getPAY_02() {
		return PAY_02;
	}
	public void setPAY_02(String pAY_02) {
		PAY_02 = pAY_02;
	}
	public String getPAY_03() {
		return PAY_03;
	}
	public void setPAY_03(String pAY_03) {
		PAY_03 = pAY_03;
	}
	public String getPAY_04() {
		return PAY_04;
	}
	public void setPAY_04(String pAY_04) {
		PAY_04 = pAY_04;
	}
	public String getPAY_05() {
		return PAY_05;
	}
	public void setPAY_05(String pAY_05) {
		PAY_05 = pAY_05;
	}
	public String getPAY_06() {
		return PAY_06;
	}
	public void setPAY_06(String pAY_06) {
		PAY_06 = pAY_06;
	}
	public String getPAY_07() {
		return PAY_07;
	}
	public void setPAY_07(String pAY_07) {
		PAY_07 = pAY_07;
	}
	public String getPAY_08() {
		return PAY_08;
	}
	public void setPAY_08(String pAY_08) {
		PAY_08 = pAY_08;
	}
	public String getPAY_09() {
		return PAY_09;
	}
	public void setPAY_09(String pAY_09) {
		PAY_09 = pAY_09;
	}
	public String getPAY_10() {
		return PAY_10;
	}
	public void setPAY_10(String pAY_10) {
		PAY_10 = pAY_10;
	}
	public String getPAY_11() {
		return PAY_11;
	}
	public void setPAY_11(String pAY_11) {
		PAY_11 = pAY_11;
	}
	public String getPAY_12() {
		return PAY_12;
	}
	public void setPAY_12(String pAY_12) {
		PAY_12 = pAY_12;
	}
	public String getPAY_TOT() {
		return PAY_TOT;
	}
	public void setPAY_TOT(String pAY_TOT) {
		PAY_TOT = pAY_TOT;
	}
	@Override
	public String toString() {
		return "PayYear [EMP_NO=" + EMP_NO + ", DEPT_NM=" + DEPT_NM + ", DEPT_CD=" + DEPT_CD + ", JIKGUP_NM=" + JIKGUP_NM + ", KOR_NM=" + KOR_NM
				+ ", GUBUN=" + GUBUN + ", PAY_01=" + PAY_01 + ", PAY_02=" + PAY_02 + ", PAY_03=" + PAY_03 + ", PAY_04="
				+ PAY_04 + ", PAY_05=" + PAY_05 + ", PAY_06=" + PAY_06 + ", PAY_07=" + PAY_07 + ", PAY_08=" + PAY_08
				+ ", PAY_09=" + PAY_09 + ", PAY_10=" + PAY_10 + ", PAY_11=" + PAY_11 + ", PAY_12=" + PAY_12
				+ ", PAY_TOT=" + PAY_TOT + ", PAY_YYMM=" + PAY_YYMM + "]";
	}
}