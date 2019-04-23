package ksmart30.team03.person.domain;

public class FamilyCare {
	private String PARTNER_YN;
	private String BUYANG_YN; 
	private String OLDMAN_YN2;
	private String JANGAE_YN; 
	private String CHILD6_YN;
	private String NAME;
	private String JUMIN_NO;
	private String RELATION;
	private String EMP_NO;
	private String AUDIT_ID;
	private String AUDIT_TM;
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
	public String getPARTNER_YN() {
		return PARTNER_YN;
	}
	public void setPARTNER_YN(String pARTNER_YN) {
		PARTNER_YN = pARTNER_YN;
	}
	public String getBUYANG_YN() {
		return BUYANG_YN;
	}
	public void setBUYANG_YN(String bUYANG_YN) {
		BUYANG_YN = bUYANG_YN;
	}
	public String getOLDMAN_YN() {
		return OLDMAN_YN2;
	}
	public void setOLDMAN_YN(String oLDMAN_YN) {
		OLDMAN_YN2 = oLDMAN_YN;
	}
	public String getJANGAE_YN() {
		return JANGAE_YN;
	}
	public void setJANGAE_YN(String jANGAE_YN) {
		JANGAE_YN = jANGAE_YN;
	}
	public String getCHILD6_YN() {
		return CHILD6_YN;
	}
	public void setCHILD6_YN(String cHILD6_YN) {
		CHILD6_YN = cHILD6_YN;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getJUMIN_NO() {
		return JUMIN_NO;
	}
	public void setJUMIN_NO(String jUMIN_NO) {
		JUMIN_NO = jUMIN_NO;
	}
	public String getRELATION() {
		return RELATION;
	}
	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}
	@Override
	public String toString() {
		return "FamilyCare [PARTNER_YN=" + PARTNER_YN + ", BUYANG_YN=" + BUYANG_YN + ", OLDMAN_YN=" + OLDMAN_YN2
				+ ", JANGAE_YN=" + JANGAE_YN + ", CHILD6_YN=" + CHILD6_YN + ", NAME=" + NAME + ", JUMIN_NO=" + JUMIN_NO
				+ ", RELATION=" + RELATION + ", EMP_NO=" + EMP_NO + ", AUDIT_ID=" + AUDIT_ID + ", AUDIT_TM=" + AUDIT_TM
				+ "]";
	}


}
