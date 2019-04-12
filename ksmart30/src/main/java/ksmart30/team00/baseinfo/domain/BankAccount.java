package ksmart30.team00.baseinfo.domain;

public class BankAccount {
	private String ACNT_NO;
	private String BANK_BRCH_CD;
	private String BRCH_LONG_NM;
	private String BRCH_SHRT_NM;
	private String ACNT_KIND;
	private String ACNT_OWNER;
	private String ACNT_NM;
	private String ABLE_YN;
	private String INT_RATE;
	private String STR_DATE;
	private String END_DATE;
	private String REM;
	private String id;
	private String pid;
	private String name;
	public String getACNT_NO() {
		return ACNT_NO;
	}
	public void setACNT_NO(String aCNT_NO) {
		ACNT_NO = aCNT_NO;
	}
	public String getBANK_BRCH_CD() {
		return BANK_BRCH_CD;
	}
	public void setBANK_BRCH_CD(String bANK_BRCH_CD) {
		BANK_BRCH_CD = bANK_BRCH_CD;
	}
	public String getBRCH_LONG_NM() {
		return BRCH_LONG_NM;
	}
	public void setBRCH_LONG_NM(String bRCH_LONG_NM) {
		BRCH_LONG_NM = bRCH_LONG_NM;
	}
	public String getBRCH_SHRT_NM() {
		return BRCH_SHRT_NM;
	}
	public void setBRCH_SHRT_NM(String bRCH_SHRT_NM) {
		BRCH_SHRT_NM = bRCH_SHRT_NM;
	}
	public String getACNT_KIND() {
		return ACNT_KIND;
	}
	public void setACNT_KIND(String aCNT_KIND) {
		ACNT_KIND = aCNT_KIND;
	}
	public String getACNT_OWNER() {
		return ACNT_OWNER;
	}
	public void setACNT_OWNER(String aCNT_OWNER) {
		ACNT_OWNER = aCNT_OWNER;
	}
	public String getACNT_NM() {
		return ACNT_NM;
	}
	public void setACNT_NM(String aCNT_NM) {
		ACNT_NM = aCNT_NM;
	}
	public String getABLE_YN() {
		return ABLE_YN;
	}
	public void setABLE_YN(String aBLE_YN) {
		ABLE_YN = aBLE_YN;
	}
	public String getINT_RATE() {
		return INT_RATE;
	}
	public void setINT_RATE(String iNT_RATE) {
		INT_RATE = iNT_RATE;
	}
	public String getSTR_DATE() {
		return STR_DATE;
	}
	public void setSTR_DATE(String sTR_DATE) {
		STR_DATE = sTR_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getREM() {
		return REM;
	}
	public void setREM(String rEM) {
		REM = rEM;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BankAccount [ACNT_NO=" + ACNT_NO + ", BANK_BRCH_CD=" + BANK_BRCH_CD + ", BRCH_LONG_NM=" + BRCH_LONG_NM
				+ ", BRCH_SHRT_NM=" + BRCH_SHRT_NM + ", ACNT_KIND=" + ACNT_KIND + ", ACNT_OWNER=" + ACNT_OWNER
				+ ", ACNT_NM=" + ACNT_NM + ", ABLE_YN=" + ABLE_YN + ", INT_RATE=" + INT_RATE + ", STR_DATE=" + STR_DATE
				+ ", END_DATE=" + END_DATE + ", REM=" + REM + ", id=" + id + ", pid=" + pid + ", name=" + name + "]";
	}
	
}
