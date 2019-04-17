package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String MAIL_ADDRESS;
	private String AUDIT_TM;
	private String BIRTH_DT;
	private String CUR_ADDRESS;
	private String SORT_VALUE;
	private String DEPT_NM;
	private String EMP_NO;
	private String KOR_NM;
	private String JIKGUP_NM;
	private String JIKCHK_NM;
	private String IN_PHONE_NO;
	private String KOR_NM2;
	private String SEX_GB;
	private String OUT_DT2;
	private String JUMIN_NO;
	private String JIKGUP_CD;
	private String JIKCHK_CD;
	private String DEPT_CD;
	private String PHONE_NO;
	private String H_PHONE_NO;	
	private String BON_ADDRESS;
	private String BORN_AREA_GB;
	private String HEIGHT;
	private String WEIGHT;
	private String BLOOD_TYPE;
	private String ARMY_TYPE;
	private String BRANCHE_GB;
	private String GRADE_CD;
	private String ARMS_GB;
	private String PRO_GB;
	private String LEVEL_GB;
	private String OUT_STD_DT;
	private String OUT_DT;
	private String ENG_NM;
	private String HANJA_NM;
	private String IN_DT;
	private String CUR_ZIP_NO;
	private String LEVEL1_CD;
	private String LEVEL2_CD;
	private String LEVEL2_NM;
	
	public String getLEVEL1_CD() {
		return LEVEL1_CD;
	}
	public void setLEVEL1_CD(String lEVEL1_CD) {
		LEVEL1_CD = lEVEL1_CD;
	}
	public String getLEVEL2_CD() {
		return LEVEL2_CD;
	}
	public void setLEVEL2_CD(String lEVEL2_CD) {
		LEVEL2_CD = lEVEL2_CD;
	}
	public String getLEVEL2_NM() {
		return LEVEL2_NM;
	}
	public void setLEVEL2_NM(String lEVEL2_NM) {
		LEVEL2_NM = lEVEL2_NM;
	}
	public String getCUR_ZIP_NO() {
		return CUR_ZIP_NO;
	}
	public void setCUR_ZIP_NO(String cUR_ZIP_NO) {
		CUR_ZIP_NO = cUR_ZIP_NO;
	}
	public String getIN_DT() {
		return IN_DT;
	}
	public void setIN_DT(String iN_DT) {
		IN_DT = iN_DT;
	}
	public String getENG_NM() {
		return ENG_NM;
	}
	public void setENG_NM(String eNG_NM) {
		ENG_NM = eNG_NM;
	}
	public String getHANJA_NM() {
		return HANJA_NM;
	}
	public void setHANJA_NM(String hANJA_NM) {
		HANJA_NM = hANJA_NM;
	}
	public String getJUMIN_NO() {
		return JUMIN_NO;
	}
	public void setJUMIN_NO(String jUMIN_NO) {
		JUMIN_NO = jUMIN_NO;
	}
	public String getJIKGUP_CD() {
		return JIKGUP_CD;
	}
	public void setJIKGUP_CD(String jIKGUP_CD) {
		JIKGUP_CD = jIKGUP_CD;
	}
	public String getJIKCHK_CD() {
		return JIKCHK_CD;
	}
	public void setJIKCHK_CD(String jIKCHK_CD) {
		JIKCHK_CD = jIKCHK_CD;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(String pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}
	public String getH_PHONE_NO() {
		return H_PHONE_NO;
	}
	public void setH_PHONE_NO(String h_PHONE_NO) {
		H_PHONE_NO = h_PHONE_NO;
	}
	public String getBON_ADDRESS() {
		return BON_ADDRESS;
	}
	public void setBON_ADDRESS(String bON_ADDRESS) {
		BON_ADDRESS = bON_ADDRESS;
	}
	public String getBORN_AREA_GB() {
		return BORN_AREA_GB;
	}
	public void setBORN_AREA_GB(String bORN_AREA_GB) {
		BORN_AREA_GB = bORN_AREA_GB;
	}
	public String getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(String hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public String getWEIGHT() {
		return WEIGHT;
	}
	public void setWEIGHT(String wEIGHT) {
		WEIGHT = wEIGHT;
	}
	public String getBLOOD_TYPE() {
		return BLOOD_TYPE;
	}
	public void setBLOOD_TYPE(String bLOOD_TYPE) {
		BLOOD_TYPE = bLOOD_TYPE;
	}
	public String getARMY_TYPE() {
		return ARMY_TYPE;
	}
	public void setARMY_TYPE(String aRMY_TYPE) {
		ARMY_TYPE = aRMY_TYPE;
	}
	public String getBRANCHE_GB() {
		return BRANCHE_GB;
	}
	public void setBRANCHE_GB(String bRANCHE_GB) {
		BRANCHE_GB = bRANCHE_GB;
	}
	public String getGRADE_CD() {
		return GRADE_CD;
	}
	public void setGRADE_CD(String gRADE_CD) {
		GRADE_CD = gRADE_CD;
	}
	public String getARMS_GB() {
		return ARMS_GB;
	}
	public void setARMS_GB(String aRMS_GB) {
		ARMS_GB = aRMS_GB;
	}
	public String getPRO_GB() {
		return PRO_GB;
	}
	public void setPRO_GB(String pRO_GB) {
		PRO_GB = pRO_GB;
	}
	public String getLEVEL_GB() {
		return LEVEL_GB;
	}
	public void setLEVEL_GB(String lEVEL_GB) {
		LEVEL_GB = lEVEL_GB;
	}
	public String getOUT_STD_DT() {
		return OUT_STD_DT;
	}
	public void setOUT_STD_DT(String oUT_STD_DT) {
		OUT_STD_DT = oUT_STD_DT;
	}
	public String getOUT_DT() {
		return OUT_DT;
	}
	public void setOUT_DT(String oUT_DT) {
		OUT_DT = oUT_DT;
	}
	public String getOUT_DT2() {
		return OUT_DT2;
	}
	public void setOUT_DT2(String oUT_DT2) {
		OUT_DT2 = oUT_DT2;
	}
	public String getSEX_GB() {
		return SEX_GB;
	}
	public void setSEX_GB(String sEX_GB) {
		SEX_GB = sEX_GB;
	}
	public String getKOR_NM2() {
		return KOR_NM2;
	}
	public void setKOR_NM2(String kOR_NM2) {
		KOR_NM2 = kOR_NM2;
	}
	public String getMAIL_ADDRESS() {
		return MAIL_ADDRESS;
	}
	public void setMAIL_ADDRESS(String mAIL_ADDRESS) {
		MAIL_ADDRESS = mAIL_ADDRESS;
	}
	public String getAUDIT_TM() {
		return AUDIT_TM;
	}
	public void setAUDIT_TM(String aUDIT_TM) {
		AUDIT_TM = aUDIT_TM;
	}
	public String getBIRTH_DT() {
		return BIRTH_DT;
	}
	public void setBIRTH_DT(String bIRTH_DT) {
		BIRTH_DT = bIRTH_DT;
	}
	public String getCUR_ADDRESS() {
		return CUR_ADDRESS;
	}
	public void setCUR_ADDRESS(String cUR_ADDRESS) {
		CUR_ADDRESS = cUR_ADDRESS;
	}

	public String getIN_PHONE_NO() {
		return IN_PHONE_NO;
	}
	public void setIN_PHONE_NO(String iN_PHONE_NO) {
		IN_PHONE_NO = iN_PHONE_NO;
	}
	public String getSORT_VALUE() {
		return SORT_VALUE;
	}
	public void setSORT_VALUE(String sORT_VALUE) {
		SORT_VALUE = sORT_VALUE;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getJIKGUP_NM() {
		return JIKGUP_NM;
	}
	public void setJIKGUP_NM(String jIKGUP_NM) {
		JIKGUP_NM = jIKGUP_NM;
	}
	public String getJIKCHK_NM() {
		return JIKCHK_NM;
	}
	public void setJIKCHK_NM(String jIKCHK_NM) {
		JIKCHK_NM = jIKCHK_NM;
	}
	
	@Override
	public String toString() {
		return "Person [MAIL_ADDRESS=" + MAIL_ADDRESS + ", AUDIT_TM=" + AUDIT_TM + ", BIRTH_DT=" + BIRTH_DT
				+ ", CUR_ADDRESS=" + CUR_ADDRESS + ", SORT_VALUE=" + SORT_VALUE + ", DEPT_NM=" + DEPT_NM + ", EMP_NO="
				+ EMP_NO + ", KOR_NM=" + KOR_NM + ", JIKGUP_NM=" + JIKGUP_NM + ", JIKCHK_NM=" + JIKCHK_NM
				+ ", IN_PHONE_NO=" + IN_PHONE_NO + ", KOR_NM2=" + KOR_NM2 + ", SEX_GB=" + SEX_GB + ", OUT_DT2="
				+ OUT_DT2 + ", JUMIN_NO=" + JUMIN_NO + ", JIKGUP_CD=" + JIKGUP_CD + ", JIKCHK_CD=" + JIKCHK_CD
				+ ", DEPT_CD=" + DEPT_CD + ", PHONE_NO=" + PHONE_NO + ", H_PHONE_NO=" + H_PHONE_NO + ", BON_ADDRESS="
				+ BON_ADDRESS + ", BORN_AREA_GB=" + BORN_AREA_GB + ", HEIGHT=" + HEIGHT + ", WEIGHT=" + WEIGHT
				+ ", BLOOD_TYPE=" + BLOOD_TYPE + ", ARMY_TYPE=" + ARMY_TYPE + ", BRANCHE_GB=" + BRANCHE_GB
				+ ", GRADE_CD=" + GRADE_CD + ", ARMS_GB=" + ARMS_GB + ", PRO_GB=" + PRO_GB + ", LEVEL_GB=" + LEVEL_GB
				+ ", OUT_STD_DT=" + OUT_STD_DT + ", OUT_DT=" + OUT_DT + ", ENG_NM=" + ENG_NM + ", HANJA_NM=" + HANJA_NM
				+ ", IN_DT=" + IN_DT + ", CUR_ZIP_NO=" + CUR_ZIP_NO + ", LEVEL1_CD=" + LEVEL1_CD + ", LEVEL2_CD="
				+ LEVEL2_CD + ", LEVEL2_NM=" + LEVEL2_NM + "]";
	}
   
}
