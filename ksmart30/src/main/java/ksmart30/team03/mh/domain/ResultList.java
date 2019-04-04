package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ResultList {
	// M/H 실적/계획 그래프1에 나오는 컬럼
	private String PJT_CD;
	private String JIKGUB;
	private int DANGA;
	private int PLAN_A;
	private int PLAN_B;
	private int PLAN_C;
	private int PLAN_D;
	private int PLAN_E;
	private int PLAN_F;
	private int PLAN_G;
	private int TOT_MD;
	private String DEPT_NAME;
	private String KOR_NM;
	private String END_DATE;
	private String SVC;
	private String DEPT_NM;
	private String PJT_NM;
	
	public String getPJT_NM() {
		return PJT_NM;
	}

	public void setPJT_NM(String pJT_NM) {
		PJT_NM = pJT_NM;
	}

	public int getTOT_MD() {
		return TOT_MD;
	}

	public void setTOT_MD(int tOT_MD) {
		TOT_MD = tOT_MD;
	}

	public String getDEPT_NAME() {
		return DEPT_NAME;
	}

	public void setDEPT_NAME(String dEPT_NAME) {
		DEPT_NAME = dEPT_NAME;
	}


	private int WORK_TIME;
	public int getWORK_TIME() {
		return WORK_TIME;
	}

	public void setWORK_TIME(int wORK_TIME) {
		WORK_TIME = wORK_TIME;
	}


	public String getDEPT_NM() {
		return DEPT_NM;
	}

	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}

	public String getSVC() {
		return SVC;
	}

	public void setSVC(String sVC) {
		SVC = sVC;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	public String getCRT_DATE() {
		return CRT_DATE;
	}

	public void setCRT_DATE(String cRT_DATE) {
		CRT_DATE = cRT_DATE;
	}

	private String CRT_DATE;

	public String getKOR_NM() {
		return KOR_NM;
	}

	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}

	public String getPJT_CD() {
		return PJT_CD;
	}

	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}

	public String getJIKGUB() {
		return JIKGUB;
	}

	public void setJIKGUB(String jIKGUB) {
		JIKGUB = jIKGUB;
	}

	public int getDANGA() {
		return DANGA;
	}

	public void setDANGA(int dANGA) {
		DANGA = dANGA;
	}

	public int getPLAN_A() {
		return PLAN_A;
	}

	public void setPLAN_A(int pLAN_A) {
		PLAN_A = pLAN_A;
	}

	public int getPLAN_B() {
		return PLAN_B;
	}

	public void setPLAN_B(int pLAN_B) {
		PLAN_B = pLAN_B;
	}

	public int getPLAN_C() {
		return PLAN_C;
	}

	public void setPLAN_C(int pLAN_C) {
		PLAN_C = pLAN_C;
	}

	public int getPLAN_D() {
		return PLAN_D;
	}

	public void setPLAN_D(int pLAN_D) {
		PLAN_D = pLAN_D;
	}

	public int getPLAN_E() {
		return PLAN_E;
	}

	public void setPLAN_E(int pLAN_E) {
		PLAN_E = pLAN_E;
	}

	public int getPLAN_F() {
		return PLAN_F;
	}

	public void setPLAN_F(int pLAN_F) {
		PLAN_F = pLAN_F;
	}

	public int getPLAN_G() {
		return PLAN_G;
	}

	public void setPLAN_G(int pLAN_G) {
		PLAN_G = pLAN_G;
	}

	@Override
	public String toString() {
		return "ResultList [PJT_CD=" + PJT_CD + ", JIKGUB=" + JIKGUB + ", DANGA=" + DANGA + ", PLAN_A=" + PLAN_A
				+ ", PLAN_B=" + PLAN_B + ", PLAN_C=" + PLAN_C + ", PLAN_D=" + PLAN_D + ", PLAN_E=" + PLAN_E
				+ ", PLAN_F=" + PLAN_F + ", PLAN_G=" + PLAN_G + ", TOT_MD=" + TOT_MD + ", DEPT_NAME=" + DEPT_NAME
				+ ", KOR_NM=" + KOR_NM + ", END_DATE=" + END_DATE + ", SVC=" + SVC + ", DEPT_NM=" + DEPT_NM
				+ ", PJT_NM=" + PJT_NM + ", WORK_TIME=" + WORK_TIME + ", CRT_DATE=" + CRT_DATE + "]";
	}

}
