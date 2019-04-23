package ksmart30.team03.person.domain;

public class License {
	
	private String LICENSE_NM;
	private String LICENSE_CD;
	private String ORGAN2_NM;
	private String ACQUIRE_DT;
	private String LICENSE_NO;
	private String VALID_DT;
	private String AUDIT_ID;
	private String AUDIT_TM;
	private String EMP_NO;
	public String getLICENSE_CD() {
		return LICENSE_CD;
	}
	public void setLICENSE_CD(String lICENSE_CD) {
		LICENSE_CD = lICENSE_CD;
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
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getLICENSE_NM() {
		return LICENSE_NM;
	}
	public void setLICENSE_NM(String lICENSE_NM) {
		LICENSE_NM = lICENSE_NM;
	}
	public String getORGAN2_NM() {
		return ORGAN2_NM;
	}
	public void setORGAN2_NM(String oRGAN2_NM) {
		ORGAN2_NM = oRGAN2_NM;
	}
	public String getACQUIRE_DT() {
		return ACQUIRE_DT;
	}
	public void setACQUIRE_DT(String aCQUIRE_DT) {
		ACQUIRE_DT = aCQUIRE_DT;
	}
	public String getLICENSE_NO() {
		return LICENSE_NO;
	}
	public void setLICENSE_NO(String lICENSE_NO) {
		LICENSE_NO = lICENSE_NO;
	}
	public String getVALID_DT() {
		return VALID_DT;
	}
	public void setVALID_DT(String vALID_DT) {
		VALID_DT = vALID_DT;
	}
	@Override
	public String toString() {
		return "License [LICENSE_NM=" + LICENSE_NM + ", LICENSE_CD=" + LICENSE_CD + ", ORGAN2_NM=" + ORGAN2_NM
				+ ", ACQUIRE_DT=" + ACQUIRE_DT + ", LICENSE_NO=" + LICENSE_NO + ", VALID_DT=" + VALID_DT + ", AUDIT_ID="
				+ AUDIT_ID + ", AUDIT_TM=" + AUDIT_TM + ", EMP_NO=" + EMP_NO + "]";
	}
	
}
