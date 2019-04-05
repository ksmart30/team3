package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private String DEPT_CD;
	private String SYS_COD;
	private String DEPT_NM;
	private String SHORT_NM;
	private String SHORT_NM1;
	private String LEVEL_GB;
	private String PRT_SEQ;
	private String DIV_TYPE;
	private String DIV_ID;
	private String ACC_UNIT;
	private String ACC_DEPT;
	private String NOT_USE;
	private String NOTUSE_DATE;
	private String ETC_CD1;
	private String ETC_CD2;
	private String ETC_CD3;
	private String AUDIT_ID;
	private String AUDIT_TM;
	private String GROUP_CD;
	private String FOREIGN_WORK;
	private String SYS_COD2;
	
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getSYS_COD() {
		return SYS_COD;
	}
	public void setSYS_COD(String sYS_COD) {
		SYS_COD = sYS_COD;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getSHORT_NM() {
		return SHORT_NM;
	}
	public void setSHORT_NM(String sHORT_NM) {
		SHORT_NM = sHORT_NM;
	}
	public String getSHORT_NM1() {
		return SHORT_NM1;
	}
	public void setSHORT_NM1(String sHORT_NM1) {
		SHORT_NM1 = sHORT_NM1;
	}
	public String getLEVEL_GB() {
		return LEVEL_GB;
	}
	public void setLEVEL_GB(String lEVEL_GB) {
		LEVEL_GB = lEVEL_GB;
	}
	public String getPRT_SEQ() {
		return PRT_SEQ;
	}
	public void setPRT_SEQ(String pRT_SEQ) {
		PRT_SEQ = pRT_SEQ;
	}
	public String getDIV_TYPE() {
		return DIV_TYPE;
	}
	public void setDIV_TYPE(String dIV_TYPE) {
		DIV_TYPE = dIV_TYPE;
	}
	public String getDIV_ID() {
		return DIV_ID;
	}
	public void setDIV_ID(String dIV_ID) {
		DIV_ID = dIV_ID;
	}
	public String getACC_UNIT() {
		return ACC_UNIT;
	}
	public void setACC_UNIT(String aCC_UNIT) {
		ACC_UNIT = aCC_UNIT;
	}
	public String getACC_DEPT() {
		return ACC_DEPT;
	}
	public void setACC_DEPT(String aCC_DEPT) {
		ACC_DEPT = aCC_DEPT;
	}
	public String getNOT_USE() {
		return NOT_USE;
	}
	public void setNOT_USE(String nOT_USE) {
		NOT_USE = nOT_USE;
	}
	public String getNOTUSE_DATE() {
		return NOTUSE_DATE;
	}
	public void setNOTUSE_DATE(String nOTUSE_DATE) {
		NOTUSE_DATE = nOTUSE_DATE;
	}
	public String getETC_CD1() {
		return ETC_CD1;
	}
	public void setETC_CD1(String eTC_CD1) {
		ETC_CD1 = eTC_CD1;
	}
	public String getETC_CD2() {
		return ETC_CD2;
	}
	public void setETC_CD2(String eTC_CD2) {
		ETC_CD2 = eTC_CD2;
	}
	public String getETC_CD3() {
		return ETC_CD3;
	}
	public void setETC_CD3(String eTC_CD3) {
		ETC_CD3 = eTC_CD3;
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
	public String getGROUP_CD() {
		return GROUP_CD;
	}
	public void setGROUP_CD(String gROUP_CD) {
		GROUP_CD = gROUP_CD;
	}
	public String getFOREIGN_WORK() {
		return FOREIGN_WORK;
	}
	public void setFOREIGN_WORK(String fOREIGN_WORK) {
		FOREIGN_WORK = fOREIGN_WORK;
	}
	public String getSYS_COD2() {
		return SYS_COD2;
	}
	public void setSYS_COD2(String sYS_COD2) {
		SYS_COD2 = sYS_COD2;
	}
	
	@Override
	public String toString() {
		return "Department [DEPT_CD=" + DEPT_CD + ", SYS_COD=" + SYS_COD + ", DEPT_NM=" + DEPT_NM + ", SHORT_NM="
				+ SHORT_NM + ", SHORT_NM1=" + SHORT_NM1 + ", LEVEL_GB=" + LEVEL_GB + ", PRT_SEQ=" + PRT_SEQ
				+ ", DIV_TYPE=" + DIV_TYPE + ", DIV_ID=" + DIV_ID + ", ACC_UNIT=" + ACC_UNIT + ", ACC_DEPT=" + ACC_DEPT
				+ ", NOT_USE=" + NOT_USE + ", NOTUSE_DATE=" + NOTUSE_DATE + ", ETC_CD1=" + ETC_CD1 + ", ETC_CD2="
				+ ETC_CD2 + ", ETC_CD3=" + ETC_CD3 + ", AUDIT_ID=" + AUDIT_ID + ", AUDIT_TM=" + AUDIT_TM + ", GROUP_CD="
				+ GROUP_CD + ", FOREIGN_WORK=" + FOREIGN_WORK + ", SYS_COD2=" + SYS_COD2 + "]";
	}
}
