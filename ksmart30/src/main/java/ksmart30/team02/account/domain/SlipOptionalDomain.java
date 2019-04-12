package ksmart30.team02.account.domain;

public class SlipOptionalDomain {
	private String SLIP_DATE;
	private String JS_CODE;
	private String SLIP_SEQ;
	private String ACC_CD;
	private String ACC_DTL_CD;
	private String ACC_LONG_NM;
	private String BELONG_DEPT_CD;
	private String PJT_CD;
	private String CUST_NM;
	private String DESCR;
	private String DR_AMT;
	private String CR_AMT;
	public String getSLIP_DATE() {
		return SLIP_DATE;
	}
	public void setSLIP_DATE(String sLIP_DATE) {
		SLIP_DATE = sLIP_DATE;
	}
	public String getJS_CODE() {
		return JS_CODE;
	}
	public void setJS_CODE(String jS_CODE) {
		JS_CODE = jS_CODE;
	}
	public String getSLIP_SEQ() {
		return SLIP_SEQ;
	}
	public void setSLIP_SEQ(String sLIP_SEQ) {
		SLIP_SEQ = sLIP_SEQ;
	}
	public String getACC_CD() {
		return ACC_CD;
	}
	public void setACC_CD(String aCC_CD) {
		ACC_CD = aCC_CD;
	}
	public String getACC_DTL_CD() {
		return ACC_DTL_CD;
	}
	public void setACC_DTL_CD(String aCC_DTL_CD) {
		ACC_DTL_CD = aCC_DTL_CD;
	}
	public String getACC_LONG_NM() {
		return ACC_LONG_NM;
	}
	public void setACC_LONG_NM(String aCC_LONG_NM) {
		ACC_LONG_NM = aCC_LONG_NM;
	}
	public String getBELONG_DEPT_CD() {
		return BELONG_DEPT_CD;
	}
	public void setBELONG_DEPT_CD(String bELONG_DEPT_CD) {
		BELONG_DEPT_CD = bELONG_DEPT_CD;
	}
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getCUST_NM() {
		return CUST_NM;
	}
	public void setCUST_NM(String cUST_NM) {
		CUST_NM = cUST_NM;
	}
	public String getDESCR() {
		return DESCR;
	}
	public void setDESCR(String dESCR) {
		System.out.println(dESCR +"<==SET DESCR");
		DESCR = dESCR;
	}
	public String getDR_AMT() {
		return DR_AMT;
	}
	public void setDR_AMT(String dR_AMT) {
		DR_AMT = dR_AMT;
	}
	public String getCR_AMT() {
		return CR_AMT;
	}
	public void setCR_AMT(String cR_AMT) {
		CR_AMT = cR_AMT;
	}
	@Override
	public String toString() {
		return "SlipOptionalDomain [SLIP_DATE=" + SLIP_DATE + ", JS_CODE=" + JS_CODE + ", SLIP_SEQ=" + SLIP_SEQ
				+ ", ACC_CD=" + ACC_CD + ", ACC_DTL_CD=" + ACC_DTL_CD + ", ACC_LONG_NM=" + ACC_LONG_NM
				+ ", BELONG_DEPT_CD=" + BELONG_DEPT_CD + ", PJT_CD=" + PJT_CD + ", CUST_NM=" + CUST_NM + ", DESCR="
				+ DESCR + ", DR_AMT=" + DR_AMT + ", CR_AMT=" + CR_AMT + "]";
	}
}
