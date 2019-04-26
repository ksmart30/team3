package ksmart30.team03.kuntae.domain;

public class BreakApply {

	private String APP_DATE;	// 신청 일자
	private String EMP_NO;		// 사원번호
	private String KOR_NM;		// 이름
	private String DEPT_CD;		// 직급 코드
	private String DEPT_NM;		// 직급 이름
	private String JIKGUP_CD;	// 직책 코드
	private String JIKGUP_NM;	// 직책 이름
	private String IN_DT;		// 입사일	
	private String APP_GB;		// 근태 구분 사유 코드
	private String APP_GB_NM;	// 근태 구분 사유
	private String APP_GB1;		// 근태 구분
	private String APP_GB_NM_T; // 7-파견신청서, 1-출장신청서, 8-외출신청서, 4-휴직신청서
	private String APP_DATE1;	// 휴가 시작 날짜
	private String APP_DATE_UP; // 휴가 시작 날짜 기간 설정 위해서 
	private String APP_TIME1;	// 휴가 시작 시간?
	private String APP_DATE2;	// 휴가 끝  날짜
	private String APP_TIME2;	// 휴가 끝 시간?
	private String APP_CNT; 	// APP_DATE1+APP_DATE2
	private String APP_RMK;		// 사유
	private String APP_PJT_CD;	// 프로젝트 코드
	private String PJT_NM;		// 프로젝트 이름
	private String APP_PLACE;	// 행선지
	private String APP_BIGO;	// 비고
	private String LEAVING_GBN;	// 현지 퇴근 여부
	private String AUDIT_ID;	// 등록자
	private String PRINT_YN;	// 출력여부
	private String APP_USE;		// APP_DATE1+APP_TIME1+APP_DATE2+APP_TIME2
	private String CONFIRM_YN;	// 승인 여부 T,F
	private String CONFIRM;		// 승인 여부 승인, 대기중
	private String H_PHONE_NO;	// 번호
	private String CONFIRM_DT;	// 승인 일자
	public String getAPP_DATE() {
		return APP_DATE;
	}
	public void setAPP_DATE(String aPP_DATE) {
		APP_DATE = aPP_DATE;
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
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public String getJIKGUP_CD() {
		return JIKGUP_CD;
	}
	public void setJIKGUP_CD(String jIKGUP_CD) {
		JIKGUP_CD = jIKGUP_CD;
	}
	public String getJIKGUP_NM() {
		return JIKGUP_NM;
	}
	public void setJIKGUP_NM(String jIKGUP_NM) {
		JIKGUP_NM = jIKGUP_NM;
	}
	public String getIN_DT() {
		return IN_DT;
	}
	public void setIN_DT(String iN_DT) {
		IN_DT = iN_DT;
	}
	public String getAPP_GB() {
		return APP_GB;
	}
	public void setAPP_GB(String aPP_GB) {
		APP_GB = aPP_GB;
	}
	public String getAPP_GB_NM() {
		return APP_GB_NM;
	}
	public void setAPP_GB_NM(String aPP_GB_NM) {
		APP_GB_NM = aPP_GB_NM;
	}
	public String getAPP_GB1() {
		return APP_GB1;
	}
	public void setAPP_GB1(String aPP_GB1) {
		APP_GB1 = aPP_GB1;
	}
	public String getAPP_GB_NM_T() {
		return APP_GB_NM_T;
	}
	public void setAPP_GB_NM_T(String aPP_GB_NM_T) {
		APP_GB_NM_T = aPP_GB_NM_T;
	}
	public String getAPP_DATE1() {
		return APP_DATE1;
	}
	public void setAPP_DATE1(String aPP_DATE1) {
		APP_DATE1 = aPP_DATE1;
	}
	public String getAPP_DATE_UP() {
		return APP_DATE_UP;
	}
	public void setAPP_DATE_UP(String aPP_DATE_UP) {
		APP_DATE_UP = aPP_DATE_UP;
	}
	public String getAPP_TIME1() {
		return APP_TIME1;
	}
	public void setAPP_TIME1(String aPP_TIME1) {
		APP_TIME1 = aPP_TIME1;
	}
	public String getAPP_DATE2() {
		return APP_DATE2;
	}
	public void setAPP_DATE2(String aPP_DATE2) {
		APP_DATE2 = aPP_DATE2;
	}
	public String getAPP_TIME2() {
		return APP_TIME2;
	}
	public void setAPP_TIME2(String aPP_TIME2) {
		APP_TIME2 = aPP_TIME2;
	}
	public String getAPP_CNT() {
		return APP_CNT;
	}
	public void setAPP_CNT(String aPP_CNT) {
		APP_CNT = aPP_CNT;
	}
	public String getAPP_RMK() {
		return APP_RMK;
	}
	public void setAPP_RMK(String aPP_RMK) {
		APP_RMK = aPP_RMK;
	}
	public String getAPP_PJT_CD() {
		return APP_PJT_CD;
	}
	public void setAPP_PJT_CD(String aPP_PJT_CD) {
		APP_PJT_CD = aPP_PJT_CD;
	}
	public String getPJT_NM() {
		return PJT_NM;
	}
	public void setPJT_NM(String pJT_NM) {
		PJT_NM = pJT_NM;
	}
	public String getAPP_PLACE() {
		return APP_PLACE;
	}
	public void setAPP_PLACE(String aPP_PLACE) {
		APP_PLACE = aPP_PLACE;
	}
	public String getAPP_BIGO() {
		return APP_BIGO;
	}
	public void setAPP_BIGO(String aPP_BIGO) {
		APP_BIGO = aPP_BIGO;
	}
	public String getLEAVING_GBN() {
		return LEAVING_GBN;
	}
	public void setLEAVING_GBN(String lEAVING_GBN) {
		LEAVING_GBN = lEAVING_GBN;
	}
	public String getAUDIT_ID() {
		return AUDIT_ID;
	}
	public void setAUDIT_ID(String aUDIT_ID) {
		AUDIT_ID = aUDIT_ID;
	}
	public String getPRINT_YN() {
		return PRINT_YN;
	}
	public void setPRINT_YN(String pRINT_YN) {
		PRINT_YN = pRINT_YN;
	}
	public String getAPP_USE() {
		return APP_USE;
	}
	public void setAPP_USE(String aPP_USE) {
		APP_USE = aPP_USE;
	}
	public String getCONFIRM_YN() {
		return CONFIRM_YN;
	}
	public void setCONFIRM_YN(String cONFIRM_YN) {
		CONFIRM_YN = cONFIRM_YN;
	}
	public String getCONFIRM() {
		return CONFIRM;
	}
	public void setCONFIRM(String cONFIRM) {
		CONFIRM = cONFIRM;
	}
	public String getH_PHONE_NO() {
		return H_PHONE_NO;
	}
	public void setH_PHONE_NO(String h_PHONE_NO) {
		H_PHONE_NO = h_PHONE_NO;
	}
	public String getCONFIRM_DT() {
		return CONFIRM_DT;
	}
	public void setCONFIRM_DT(String cONFIRM_DT) {
		CONFIRM_DT = cONFIRM_DT;
	}
	@Override
	public String toString() {
		return "BreakApply [APP_DATE=" + APP_DATE + ", EMP_NO=" + EMP_NO + ", KOR_NM=" + KOR_NM + ", DEPT_CD=" + DEPT_CD
				+ ", DEPT_NM=" + DEPT_NM + ", JIKGUP_CD=" + JIKGUP_CD + ", JIKGUP_NM=" + JIKGUP_NM + ", IN_DT=" + IN_DT
				+ ", APP_GB=" + APP_GB + ", APP_GB_NM=" + APP_GB_NM + ", APP_GB1=" + APP_GB1 + ", APP_GB_NM_T="
				+ APP_GB_NM_T + ", APP_DATE1=" + APP_DATE1 + ", APP_DATE_UP=" + APP_DATE_UP + ", APP_TIME1=" + APP_TIME1
				+ ", APP_DATE2=" + APP_DATE2 + ", APP_TIME2=" + APP_TIME2 + ", APP_CNT=" + APP_CNT + ", APP_RMK="
				+ APP_RMK + ", APP_PJT_CD=" + APP_PJT_CD + ", PJT_NM=" + PJT_NM + ", APP_PLACE=" + APP_PLACE
				+ ", APP_BIGO=" + APP_BIGO + ", LEAVING_GBN=" + LEAVING_GBN + ", AUDIT_ID=" + AUDIT_ID + ", PRINT_YN="
				+ PRINT_YN + ", APP_USE=" + APP_USE + ", CONFIRM_YN=" + CONFIRM_YN + ", CONFIRM=" + CONFIRM
				+ ", H_PHONE_NO=" + H_PHONE_NO + ", CONFIRM_DT=" + CONFIRM_DT + "]";
	}
	
}
