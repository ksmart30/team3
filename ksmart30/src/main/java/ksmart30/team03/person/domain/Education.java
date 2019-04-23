package ksmart30.team03.person.domain;

public class Education {
	private String SCHOOL_GB;
	private String EMP_NO;
	private String ENTRY_DT;
	private String FINISH_DT;
	private String MAJOR_NM;
	private String SCHOOL_NM;
	private String DEGREE_NM;
	private String COMPLETE_NM;
	private String F_SCHOOL_YN;
	private String AUDIT_ID;
	private String AUDIT_TM;
	public String getSCHOOL_GB() {
		return SCHOOL_GB;
	}
	public void setSCHOOL_GB(String sCHOOL_GB) {
		SCHOOL_GB = sCHOOL_GB;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getENTRY_DT() {
		return ENTRY_DT;
	}
	public void setENTRY_DT(String eNTRY_DT) {
		ENTRY_DT = eNTRY_DT;
	}
	public String getFINISH_DT() {
		return FINISH_DT;
	}
	public void setFINISH_DT(String fINISH_DT) {
		FINISH_DT = fINISH_DT;
	}
	public String getMAJOR_NM() {
		return MAJOR_NM;
	}
	public void setMAJOR_NM(String mAJOR_NM) {
		MAJOR_NM = mAJOR_NM;
	}
	public String getSCHOOL_NM() {
		return SCHOOL_NM;
	}
	public void setSCHOOL_NM(String sCHOOL_NM) {
		SCHOOL_NM = sCHOOL_NM;
	}
	public String getDEGREE_NM() {
		return DEGREE_NM;
	}
	public void setDEGREE_NM(String dEGREE_NM) {
		DEGREE_NM = dEGREE_NM;
	}
	public String getCOMPLETE_NM() {
		return COMPLETE_NM;
	}
	public void setCOMPLETE_NM(String cOMPLETE_NM) {
		COMPLETE_NM = cOMPLETE_NM;
	}
	public String getF_SCHOOL_YN() {
		return F_SCHOOL_YN;
	}
	public void setF_SCHOOL_YN(String f_SCHOOL_YN) {
		F_SCHOOL_YN = f_SCHOOL_YN;
	}
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
	@Override
	public String toString() {
		return "Education [SCHOOL_GB=" + SCHOOL_GB + ", EMP_NO=" + EMP_NO + ", ENTRY_DT=" + ENTRY_DT + ", FINISH_DT="
				+ FINISH_DT + ", MAJOR_NM=" + MAJOR_NM + ", SCHOOL_NM=" + SCHOOL_NM + ", DEGREE_NM=" + DEGREE_NM
				+ ", COMPLETE_NM=" + COMPLETE_NM + ", F_SCHOOL_YN=" + F_SCHOOL_YN + ", AUDIT_ID=" + AUDIT_ID
				+ ", AUDIT_TM=" + AUDIT_TM + "]";
	}
	
}
