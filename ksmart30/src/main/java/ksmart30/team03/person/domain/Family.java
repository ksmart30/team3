package ksmart30.team03.person.domain;

public class Family {
	
	//화면에서 입력하는 값은 RELATION,NAME,JOB,ADDRESS,SEQ
	private String EMP_NO;
	private String SEQ;
	private String RELATION;
	private String NAME;
	private String JOB;
	private String ADDRESS;
	private String AUDIT_TM;
	private String AUDIT_ID;
	
	public String getAUDIT_ID() {
		return AUDIT_ID;
	}
	public void setAUDIT_ID(String aUDIT_ID) {
		AUDIT_ID = aUDIT_ID;
	}
	public String getAUDIT_TM() {
		return AUDIT_TM;
	}
	public void setAUDIT_TM(String aUDIT_TM) {
		AUDIT_TM = aUDIT_TM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getRELATION() {
		return RELATION;
	}
	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	@Override
	public String toString() {
		return "Family [EMP_NO=" + EMP_NO + ", SEQ=" + SEQ + ", RELATION=" + RELATION + ", NAME=" + NAME + ", JOB="
				+ JOB + ", ADDRESS=" + ADDRESS + ", AUDIT_TM=" + AUDIT_TM + ", AUDIT_ID=" + AUDIT_ID + "]";
	}
	
	
}
