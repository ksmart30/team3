/* 8.1.전표입력
 * @file      SlipDetailDomain.java
 * @brief    전표상세 Domain
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.domain;

public class SlipHeaderDomain {
	private String SLIP_CASH_GB;
	private String SLIP_DATE;
	private String SLIP_NO;
	private String INIT_DATE;
	private String INIT_DEPT_CD;
	private String INIT_DEPT_NM;
	private String INIT_EMP_NO;
	private String INIT_EMP_NM;
	private String CONFIRM_YN;
	private String DR_AMT;
	
	public String getSLIP_CASH_GB() {
		return SLIP_CASH_GB;
	}
	public void setSLIP_CASH_GB(String sLIP_CASH_GB) {
		SLIP_CASH_GB = sLIP_CASH_GB;
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
	public String getINIT_DATE() {
		return INIT_DATE;
	}
	public void setINIT_DATE(String iNIT_DATE) {
		INIT_DATE = iNIT_DATE;
	}
	public String getINIT_DEPT_CD() {
		return INIT_DEPT_CD;
	}
	public void setINIT_DEPT_CD(String iNIT_DEPT_CD) {
		INIT_DEPT_CD = iNIT_DEPT_CD;
	}
	public String getINIT_EMP_NO() {
		return INIT_EMP_NO;
	}
	public void setINIT_EMP_NO(String iNIT_EMP_NO) {
		INIT_EMP_NO = iNIT_EMP_NO;
	}	
	public String getCONFIRM_YN() {
		return CONFIRM_YN;
	}
	public void setCONFIRM_YN(String cONFIRM_YN) {
		CONFIRM_YN = cONFIRM_YN;
	}
	public String getDR_AMT() {
		return DR_AMT;
	}
	public void setDR_AMT(String dR_AMT) {
		DR_AMT = dR_AMT;
	}
	
	public String getINIT_DEPT_NM() {
		return INIT_DEPT_NM;
	}
	public void setINIT_DEPT_NM(String iNIT_DEPT_NM) {
		INIT_DEPT_NM = iNIT_DEPT_NM;
	}
	public String getINIT_EMP_NM() {
		return INIT_EMP_NM;
	}
	public void setINIT_EMP_NM(String iNIT_EMP_NM) {
		INIT_EMP_NM = iNIT_EMP_NM;
	}
	@Override
	public String toString() {
		return "SlipHeaderDomain [SLIP_CASH_GB=" + SLIP_CASH_GB + ", SLIP_DATE=" + SLIP_DATE + ", SLIP_NO=" + SLIP_NO
				+ ", INIT_DATE=" + INIT_DATE + ", INIT_DEPT_CD=" + INIT_DEPT_CD + ", INIT_DEPT_NM=" + INIT_DEPT_NM
				+ ", INIT_EMP_NO=" + INIT_EMP_NO + ", INIT_EMP_NM=" + INIT_EMP_NM + ", CONFIRM_YN=" + CONFIRM_YN
				+ ", DR_AMT=" + DR_AMT + "]";
	}
	

	
}
