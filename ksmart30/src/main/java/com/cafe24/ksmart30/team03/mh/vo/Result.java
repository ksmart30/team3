package com.cafe24.ksmart30.team03.mh.vo;

public class Result {
	private String empNo;
	private String workDt;
	private String pjtCd;
	private String workStep;
	private String workSpec;
	private String deptCd;
	private String workTime;
	private String etcSpec;
	private String jikgupCd;
	private String aDeptCd;
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getWorkDt() {
		return workDt;
	}
	public void setWorkDt(String workDt) {
		this.workDt = workDt;
	}
	public String getPjtCd() {
		return pjtCd;
	}
	public void setPjtCd(String pjtCd) {
		this.pjtCd = pjtCd;
	}
	public String getWorkStep() {
		return workStep;
	}
	public void setWorkStep(String workStep) {
		this.workStep = workStep;
	}
	public String getWorkSpec() {
		return workSpec;
	}
	public void setWorkSpec(String workSpec) {
		this.workSpec = workSpec;
	}
	public String getDeptCd() {
		return deptCd;
	}
	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public String getEtcSpec() {
		return etcSpec;
	}
	public void setEtcSpec(String etcSpec) {
		this.etcSpec = etcSpec;
	}
	public String getJikgupCd() {
		return jikgupCd;
	}
	public void setJikgupCd(String jikgupCd) {
		this.jikgupCd = jikgupCd;
	}
	public String getaDeptCd() {
		return aDeptCd;
	}
	public void setaDeptCd(String aDeptCd) {
		this.aDeptCd = aDeptCd;
	}
	@Override
	public String toString() {
		return "Result [empNo=" + empNo + ", workDt=" + workDt + ", pjtCd=" + pjtCd + ", workStep=" + workStep
				+ ", workSpec=" + workSpec + ", deptCd=" + deptCd + ", workTime=" + workTime + ", etcSpec=" + etcSpec
				+ ", jikgupCd=" + jikgupCd + ", aDeptCd=" + aDeptCd + "]";
	}
	
	
}
