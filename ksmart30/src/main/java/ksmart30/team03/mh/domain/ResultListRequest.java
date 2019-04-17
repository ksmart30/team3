package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ResultListRequest {
	private String CRT_DATE;
	private String END_DATE;
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
		return "ResultListRequest [CRT_DATE=" + CRT_DATE + ", END_DATE=" + END_DATE + "]";
	}

}
