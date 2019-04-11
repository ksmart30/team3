package ksmart30.team03.mh.domain;

public class ResultCost {

	private int PLAN_A;
	private int PLAN_B;
	private int PLAN_C;
	private int PLAN_D;
	private int PLAN_E;
	private int PLAN_F;
	private int PLAN_G;
	private String PJT_CD;
	private String JIKGUB;
	private int DANGA;
	private String WORK_STEP;
	private int TOTAL;
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
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
	public String getWORK_STEP() {
		return WORK_STEP;
	}
	public void setWORK_STEP(String wORK_STEP) {
		WORK_STEP = wORK_STEP;
	}
	public int getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(int tOTAL) {
		TOTAL = tOTAL;
	}
	@Override
	public String toString() {
		return "ResultCost [PLAN_A=" + PLAN_A + ", PLAN_B=" + PLAN_B + ", PLAN_C=" + PLAN_C + ", PLAN_D=" + PLAN_D
				+ ", PLAN_E=" + PLAN_E + ", PLAN_F=" + PLAN_F + ", PLAN_G=" + PLAN_G + ", PJT_CD=" + PJT_CD
				+ ", JIKGUB=" + JIKGUB + ", DANGA=" + DANGA + ", WORK_STEP=" + WORK_STEP + ", TOTAL=" + TOTAL + "]";
	}
	
}
