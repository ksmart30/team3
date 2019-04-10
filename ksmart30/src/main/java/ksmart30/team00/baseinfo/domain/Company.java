package ksmart30.team00.baseinfo.domain;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private String COMP_NM;         // 회사명
    private String COMP_NO;         // 사업자번호
    private String CORPORATION_NO;  // 법인등록번호
    private String TAX_OFFICE_NM;   // 관할세무서명
    private String PRESIDENT_NM;    // 대표자명
    private String ZIP_NO;          // 우편번호
    private String ADDRESS;         // 주소
    private String PHONE_NO;        // 전화번호
    private String FAX_NO;          // 팩스번호
    private String UPTAE;           // 업태
    private String UPJONG;          // 업종
    private String AUDIT_ID;        // 등록자
    private String H_INSURE;        // 건강보험
    private String AUDIT_TM;        // 등록일시
    private String PENSION;         // 국민연금
    private String E_INSURE;        // 고용보험
    private String IMG_LOC;         // 회사로고

    public String getCOMP_NM() {
        return COMP_NM;
    }
    public void setCOMP_NM(String cOMP_NM) {
        COMP_NM = cOMP_NM;
    }
    public String getCOMP_NO() {
        return COMP_NO;
    }
    public void setCOMP_NO(String cOMP_NO) {
        COMP_NO = cOMP_NO;
    }
    public String getCORPORATION_NO() {
        return CORPORATION_NO;
    }
    public void setCORPORATION_NO(String cORPORATION_NO) {
        CORPORATION_NO = cORPORATION_NO;
    }
    public String getTAX_OFFICE_NM() {
        return TAX_OFFICE_NM;
    }
    public void setTAX_OFFICE_NM(String tAX_OFFICE_NM) {
        TAX_OFFICE_NM = tAX_OFFICE_NM;
    }
    public String getPRESIDENT_NM() {
        return PRESIDENT_NM;
    }
    public void setPRESIDENT_NM(String pRESIDENT_NM) {
        PRESIDENT_NM = pRESIDENT_NM;
    }
    public String getZIP_NO() {
        return ZIP_NO;
    }
    public void setZIP_NO(String zIP_NO) {
        ZIP_NO = zIP_NO;
    }
    public String getADDRESS() {
        return ADDRESS;
    }
    public void setADDRESS(String aDDRESS) {
        ADDRESS = aDDRESS;
    }
    public String getPHONE_NO() {
        return PHONE_NO;
    }
    public void setPHONE_NO(String pHONE_NO) {
        PHONE_NO = pHONE_NO;
    }
    public String getFAX_NO() {
        return FAX_NO;
    }
    public void setFAX_NO(String fAX_NO) {
        FAX_NO = fAX_NO;
    }
    public String getUPTAE() {
        return UPTAE;
    }
    public void setUPTAE(String uPTAE) {
        UPTAE = uPTAE;
    }
    public String getUPJONG() {
        return UPJONG;
    }
    public void setUPJONG(String uPJONG) {
        UPJONG = uPJONG;
    }
    public String getAUDIT_ID() {
        return AUDIT_ID;
    }
    public void setAUDIT_ID(String aUDIT_ID) {
        AUDIT_ID = aUDIT_ID;
    }
    public String getH_INSURE() {
        return H_INSURE;
    }
    public void setH_INSURE(String h_INSURE) {
        H_INSURE = h_INSURE;
    }
    public String getAUDIT_TM() {
        return AUDIT_TM;
    }
    public void setAUDIT_TM(String aUDIT_TM) {
        AUDIT_TM = aUDIT_TM;
    }
    public String getPENSION() {
        return PENSION;
    }
    public void setPENSION(String pENSION) {
        PENSION = pENSION;
    }
    public String getE_INSURE() {
        return E_INSURE;
    }
    public void setE_INSURE(String e_INSURE) {
        E_INSURE = e_INSURE;
    }
    public String getIMG_LOC() {
        return IMG_LOC;
    }
    public void setIMG_LOC(String iMG_LOC) {
        IMG_LOC = iMG_LOC;
    }
    
	@Override
	public String toString() {
		return "Company [COMP_NM=" + COMP_NM + ", COMP_NO=" + COMP_NO + ", CORPORATION_NO=" + CORPORATION_NO
				+ ", TAX_OFFICE_NM=" + TAX_OFFICE_NM + ", PRESIDENT_NM=" + PRESIDENT_NM + ", ZIP_NO=" + ZIP_NO
				+ ", ADDRESS=" + ADDRESS + ", PHONE_NO=" + PHONE_NO + ", FAX_NO=" + FAX_NO + ", UPTAE=" + UPTAE
				+ ", UPJONG=" + UPJONG + ", AUDIT_ID=" + AUDIT_ID + ", H_INSURE=" + H_INSURE + ", AUDIT_TM=" + AUDIT_TM
				+ ", PENSION=" + PENSION + ", E_INSURE=" + E_INSURE + ", IMG_LOC=" + IMG_LOC + "]";
	} 
}
