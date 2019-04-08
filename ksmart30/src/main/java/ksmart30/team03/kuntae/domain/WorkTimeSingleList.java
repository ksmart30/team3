package ksmart30.team03.kuntae.domain;

public class WorkTimeSingleList {
	private String KOR_NM;
	private String EMP_NO;
	private String WORK_DT;
	private String END_DT;
	private String START_TIME;
	private String END_TIME;
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getWORK_DT() {
		return WORK_DT;
	}
	public void setWORK_DT(String wORK_DT) {
		WORK_DT = wORK_DT;
	}
	public String getEND_DT() {
		return END_DT;
	}
	public void setEND_DT(String eND_DT) {
		END_DT = eND_DT;
	}
	public String getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(String sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public String getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(String eND_TIME) {
		END_TIME = eND_TIME;
	}
	@Override
	public String toString() {
		return "WorkTimeSingleList [KOR_NM=" + KOR_NM + ", EMP_NO=" + EMP_NO + ", WORK_DT=" + WORK_DT + ", END_DT="
				+ END_DT + ", START_TIME=" + START_TIME + ", END_TIME=" + END_TIME + "]";
	}
	
	
	
}