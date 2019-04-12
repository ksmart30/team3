package ksmart30.team02.account.domain;

public class Slip {
	private String SLIP_SEQ;
	private String ACC_CD;
	private String ACC_DTL_CD;
	private String BELONG_DEPT_CD;
	private String DRCR_GB;
	private String ACC_AMT;
	
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
	public String getBELONG_DEPT_CD() {
		return BELONG_DEPT_CD;
	}
	public void setBELONG_DEPT_CD(String bELONG_DEPT_CD) {
		BELONG_DEPT_CD = bELONG_DEPT_CD;
	}
	public String getDRCR_GB() {
		return DRCR_GB;
	}
	public void setDRCR_GB(String dRCR_GB) {
		DRCR_GB = dRCR_GB;
	}
	public String getACC_AMT() {
		return ACC_AMT;
	}
	public void setACC_AMT(String aCC_AMT) {
		ACC_AMT = aCC_AMT;
	}
	
	@Override
	public String toString() {
		return "Slip [SLIP_SEQ=" + SLIP_SEQ + ", ACC_CD=" + ACC_CD + ", ACC_DTL_CD=" + ACC_DTL_CD + ", BELONG_DEPT_CD="
				+ BELONG_DEPT_CD + ", DRCR_GB=" + DRCR_GB + ", ACC_AMT=" + ACC_AMT + "]";
	}
	
	
}
