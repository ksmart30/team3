package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class School {
    private String SCHOOL_GB;
    private String SCHOOL_CD;
    private String SCHOOL_NM;
    
	public String getSCHOOL_GB() {
		return SCHOOL_GB;
	}
	public void setSCHOOL_GB(String sCHOOL_GB) {
		SCHOOL_GB = sCHOOL_GB;
	}
	public String getSCHOOL_CD() {
		return SCHOOL_CD;
	}
	public void setSCHOOL_CD(String sCHOOL_CD) {
		SCHOOL_CD = sCHOOL_CD;
	}
	public String getSCHOOL_NM() {
		return SCHOOL_NM;
	}
	public void setSCHOOL_NM(String sCHOOL_NM) {
		SCHOOL_NM = sCHOOL_NM;
	}
	
	@Override
	public String toString() {
		return "School [SCHOOL_GB=" + SCHOOL_GB + ", SCHOOL_CD=" + SCHOOL_CD + ", SCHOOL_NM=" + SCHOOL_NM + "]";
	}
}
