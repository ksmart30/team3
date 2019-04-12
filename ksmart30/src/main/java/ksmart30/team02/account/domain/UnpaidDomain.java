package ksmart30.team02.account.domain;

public class UnpaidDomain {
	private String SLIP_DATE;
	private String JS_CODE; 
	private String SLIP_NO;
	private String SLIP_SEQ;
	private String CUST_NM;
	private String OCCR_AMT;
	private String REMAIN_AMT;
	private String NOT_CONF_AMT;
	private String ACC_AMT;
	private String DESCR;
	private String OCCRSUM;
	private String NOTCONFIRM;
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
	public String getSLIP_NO() {
		return SLIP_NO;
	}
	public void setSLIP_NO(String sLIP_NO) {
		SLIP_NO = sLIP_NO;
	}
	public String getSLIP_SEQ() {
		return SLIP_SEQ;
	}
	public void setSLIP_SEQ(String sLIP_SEQ) {
		SLIP_SEQ = sLIP_SEQ;
	}
	public String getCUST_NM() {
		return CUST_NM;
	}
	public void setCUST_NM(String cUST_NM) {
		CUST_NM = cUST_NM;
	}
	public String getOCCR_AMT() {
		return OCCR_AMT;
	}
	public void setOCCR_AMT(String oCCR_AMT) {
		OCCR_AMT = oCCR_AMT;
	}
	public String getREMAIN_AMT() {
		return REMAIN_AMT;
	}
	public void setREMAIN_AMT(String rEMAIN_AMT) {
		REMAIN_AMT = rEMAIN_AMT;
	}
	public String getNOT_CONF_AMT() {
		return NOT_CONF_AMT;
	}
	public void setNOT_CONF_AMT(String nOT_CONF_AMT) {
		NOT_CONF_AMT = nOT_CONF_AMT;
	}
	public String getACC_AMT() {
		return ACC_AMT;
	}
	public void setACC_AMT(String aCC_AMT) {
		ACC_AMT = aCC_AMT;
	}
	public String getDESCR() {
		return DESCR;
	}
	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}
	public String getOCCRSUM() {
		return OCCRSUM;
	}
	public void setOCCRSUM(String oCCRSUM) {
		OCCRSUM = oCCRSUM;
	}
	public String getNOTCONFIRM() {
		return NOTCONFIRM;
	}
	public void setNOTCONFIRM(String nOTCONFIRM) {
		NOTCONFIRM = nOTCONFIRM;
	}
	@Override
	public String toString() {
		return "UnpaidDomain [SLIP_DATE=" + SLIP_DATE + ", JS_CODE=" + JS_CODE + ", SLIP_NO=" + SLIP_NO + ", SLIP_SEQ="
				+ SLIP_SEQ + ", CUST_NM=" + CUST_NM + ", OCCR_AMT=" + OCCR_AMT + ", REMAIN_AMT=" + REMAIN_AMT
				+ ", NOT_CONF_AMT=" + NOT_CONF_AMT + ", ACC_AMT=" + ACC_AMT + ", DESCR=" + DESCR + ", OCCRSUM="
				+ OCCRSUM + ", NOTCONFIRM=" + NOTCONFIRM + "]";
	}
	
}
