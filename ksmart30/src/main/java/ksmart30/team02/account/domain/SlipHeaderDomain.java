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
	private String INIT_EMP_NO;
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
	@Override
	public String toString() {
		return "SlipHeaderDomain [SLIP_CASH_GB=" + SLIP_CASH_GB + ", SLIP_DATE=" + SLIP_DATE + ", SLIP_NO=" + SLIP_NO
				+ ", INIT_DATE=" + INIT_DATE + ", INIT_DEPT_CD=" + INIT_DEPT_CD + ", INIT_EMP_NO=" + INIT_EMP_NO + "]";
	}

	
}
