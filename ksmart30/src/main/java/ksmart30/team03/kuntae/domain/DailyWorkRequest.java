package ksmart30.team03.kuntae.domain;

import org.springframework.stereotype.Component;

@Component
public class DailyWorkRequest {
	
	private String DATE;
	private String DEPT_NM;
	private String DEPT_CD;
	
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getDATE() {
		return DATE;
	}
	public void setDATE(String dATE) {
		DATE = dATE;
	}
@Override
public String toString() {
	return "DailyWorkRequest [DATE=" + DATE + ", DEPT_NM=" + DEPT_NM + ", DEPT_CD=" + DEPT_CD + "]";
}
}