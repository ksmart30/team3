package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ResultListRequest {
	private String CRT_DATE;
	private String END_DATE;
	private String CONTRACT_PRI1;
	private String CONTRACT_PRI2;
	public String getCONTRACT_PRI1() {
		return CONTRACT_PRI1;
	}
	public void setCONTRACT_PRI1(String cONTRACT_PRI1) {
		CONTRACT_PRI1 = cONTRACT_PRI1;
	}
	public String getCONTRACT_PRI2() {
		return CONTRACT_PRI2;
	}
	public void setCONTRACT_PRI2(String cONTRACT_PRI2) {
		CONTRACT_PRI2 = cONTRACT_PRI2;
	}
	public String getCRT_DATE() {
		return CRT_DATE;
	}
	public void setCRT_DATE(String cRT_DATE) {
		CRT_DATE = cRT_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	@Override
	public String toString() {
		return "ResultListRequest [CRT_DATE=" + CRT_DATE + ", END_DATE=" + END_DATE + ", CONTRACT_PRI1=" + CONTRACT_PRI1
				+ ", CONTRACT_PRI2=" + CONTRACT_PRI2 + "]";
	}

}
