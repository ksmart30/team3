package ksmart30.team03.kuntae.domain;

import org.springframework.stereotype.Component;

@Component
public class KuntaeSearch {
	private String FRDATE;
	private String TODATE;
	private String DEPT_CD;
	public String getFRDATE() {
		return FRDATE;
	}
	public void setFRDATE(String fRDATE) {
		FRDATE = fRDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	@Override
	public String toString() {
		return "KuntaeSearch [FRDATE=" + FRDATE + ", TODATE=" + TODATE + ", DEPT_CD=" + DEPT_CD + "]";
	}
}
