package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class Major {
    private String MAJOR_CD;
    private String MAJOR_NM;
    
	public String getMAJOR_CD() {
		return MAJOR_CD;
	}
	public void setMAJOR_CD(String mAJOR_CD) {
		MAJOR_CD = mAJOR_CD;
	}
	public String getMAJOR_NM() {
		return MAJOR_NM;
	}
	public void setMAJOR_NM(String mAJOR_NM) {
		MAJOR_NM = mAJOR_NM;
	}
	
	@Override
	public String toString() {
		return "Major [MAJOR_CD=" + MAJOR_CD + ", MAJOR_NM=" + MAJOR_NM + "]";
	}
}
