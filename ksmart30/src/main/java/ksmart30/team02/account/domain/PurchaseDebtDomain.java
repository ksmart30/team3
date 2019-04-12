package ksmart30.team02.account.domain;

public class PurchaseDebtDomain {
	private String ACC_CD;
	private String REMAIN_AMT;
	private String SCHD_DT;
	private String PROG_STAT;
	private String CUST_CD;
	private String PJT_NM;
	private String SLIP_DATE;
	private String SLIP_NO;
	private String SLIP_SEQ;
	private String PAY_DT;
	public String getACC_CD() {
		return ACC_CD;
	}
	public void setACC_CD(String aCC_CD) {
		ACC_CD = aCC_CD;
	}
	public String getREMAIN_AMT() {
		return REMAIN_AMT;
	}
	public void setREMAIN_AMT(String rEMAIN_AMT) {
		REMAIN_AMT = rEMAIN_AMT;
	}
	public String getSCHD_DT() {
		return SCHD_DT;
	}
	public void setSCHD_DT(String sCHD_DT) {
		SCHD_DT = sCHD_DT;
	}
	public String getPROG_STAT() {
		return PROG_STAT;
	}
	public void setPROG_STAT(String pROG_STAT) {
		PROG_STAT = pROG_STAT;
	}
	public String getCUST_CD() {
		return CUST_CD;
	}
	public void setCUST_CD(String cUST_CD) {
		CUST_CD = cUST_CD;
	}
	public String getPJT_NM() {
		return PJT_NM;
	}
	public void setPJT_NM(String pJT_NM) {
		PJT_NM = pJT_NM;
	}
	public String getSLIP_DATE() {
		return SLIP_DATE;
	}
	public void setSLIP_DATE(String sLIP_DATE) {
		SLIP_DATE = sLIP_DATE;
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
	public String getPAY_DT() {
		return PAY_DT;
	}
	public void setPAY_DT(String pAY_DT) {
		PAY_DT = pAY_DT;
	}
	@Override
	public String toString() {
		return "PurchaseDebt [ACC_CD=" + ACC_CD + ", REMAIN_AMT=" + REMAIN_AMT + ", SCHD_DT=" + SCHD_DT + ", PROG_STAT="
				+ PROG_STAT + ", CUST_CD=" + CUST_CD + ", PJT_NM=" + PJT_NM + ", SLIP_DATE=" + SLIP_DATE + ", SLIP_NO="
				+ SLIP_NO + ", SLIP_SEQ=" + SLIP_SEQ + ", PAY_DT=" + PAY_DT + "]";
	}

}
