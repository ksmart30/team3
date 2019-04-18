package ksmart30.team03.person.domain;

import org.springframework.stereotype.Component;

@Component
public class Pay {

    private String ITEM_GB;         // 항목구분
    private String ITEM_CD;         // 항목코드
    private String TAXATION_YN;     // 과세여부
    private String ITEM_NM;         // 항목명칭
    private String CHANGE_YN;       // 변동여부
    private String BASE_YN;         // 기본급여
    private String H_INSURE_YN;     // 건강보험
    private String PENSION_YN;      // 국민연금
    private String E_INSURE_YN;     // 고용보험
    private String AVER_PAY_YN;     // 평균임금
    private String USUA_PAY_YN;     // 통상임금
    private int TAX_FREE_AMT;       // 비과세한도
    private String AUDIT_ID;        // 입력자
    private String AUDIT_TM;        // 입력일시
    
	public String getITEM_GB() {
		return ITEM_GB;
	}
	public void setITEM_GB(String iTEM_GB) {
		ITEM_GB = iTEM_GB;
	}
	public String getITEM_CD() {
		return ITEM_CD;
	}
	public void setITEM_CD(String iTEM_CD) {
		ITEM_CD = iTEM_CD;
	}
	public String getTAXATION_YN() {
		return TAXATION_YN;
	}
	public void setTAXATION_YN(String tAXATION_YN) {
		TAXATION_YN = tAXATION_YN;
	}
	public String getITEM_NM() {
		return ITEM_NM;
	}
	public void setITEM_NM(String iTEM_NM) {
		ITEM_NM = iTEM_NM;
	}
	public String getCHANGE_YN() {
		return CHANGE_YN;
	}
	public void setCHANGE_YN(String cHANGE_YN) {
		CHANGE_YN = cHANGE_YN;
	}
	public String getBASE_YN() {
		return BASE_YN;
	}
	public void setBASE_YN(String bASE_YN) {
		BASE_YN = bASE_YN;
	}
	public String getH_INSURE_YN() {
		return H_INSURE_YN;
	}
	public void setH_INSURE_YN(String h_INSURE_YN) {
		H_INSURE_YN = h_INSURE_YN;
	}
	public String getPENSION_YN() {
		return PENSION_YN;
	}
	public void setPENSION_YN(String pENSION_YN) {
		PENSION_YN = pENSION_YN;
	}
	public String getE_INSURE_YN() {
		return E_INSURE_YN;
	}
	public void setE_INSURE_YN(String e_INSURE_YN) {
		E_INSURE_YN = e_INSURE_YN;
	}
	public String getAVER_PAY_YN() {
		return AVER_PAY_YN;
	}
	public void setAVER_PAY_YN(String aVER_PAY_YN) {
		AVER_PAY_YN = aVER_PAY_YN;
	}
	public String getUSUA_PAY_YN() {
		return USUA_PAY_YN;
	}
	public void setUSUA_PAY_YN(String uSUA_PAY_YN) {
		USUA_PAY_YN = uSUA_PAY_YN;
	}
	public int getTAX_FREE_AMT() {
		return TAX_FREE_AMT;
	}
	public void setTAX_FREE_AMT(int tAX_FREE_AMT) {
		TAX_FREE_AMT = tAX_FREE_AMT;
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
		return "Pay [ITEM_GB=" + ITEM_GB + ", ITEM_CD=" + ITEM_CD + ", TAXATION_YN=" + TAXATION_YN + ", ITEM_NM="
				+ ITEM_NM + ", CHANGE_YN=" + CHANGE_YN + ", BASE_YN=" + BASE_YN + ", H_INSURE_YN=" + H_INSURE_YN
				+ ", PENSION_YN=" + PENSION_YN + ", E_INSURE_YN=" + E_INSURE_YN + ", AVER_PAY_YN=" + AVER_PAY_YN
				+ ", USUA_PAY_YN=" + USUA_PAY_YN + ", TAX_FREE_AMT=" + TAX_FREE_AMT + ", AUDIT_ID=" + AUDIT_ID
				+ ", AUDIT_TM=" + AUDIT_TM + "]";
	}
}
