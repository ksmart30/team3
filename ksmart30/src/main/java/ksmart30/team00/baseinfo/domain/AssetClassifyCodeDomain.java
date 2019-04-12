/* 10.2.7.자산분류코드
 * @file    AssetClassifyCodeDomain.java
 * @brief   자산분류코드 Domain
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.domain;

public class AssetClassifyCodeDomain {
	private String ASSET_CD;
	private String CODE_NM;
	private String LAW_YY;
	private String ACC_CD;
	private String ACC_DTL_CD;
	
	public String getASSET_CD() {
		return ASSET_CD;
	}
	public void setASSET_CD(String aSSET_CD) {
		ASSET_CD = aSSET_CD;
	}
	public String getCODE_NM() {
		return CODE_NM;
	}
	public void setCODE_NM(String cODE_NM) {
		CODE_NM = cODE_NM;
	}
	public String getLAW_YY() {
		return LAW_YY;
	}
	public void setLAW_YY(String lAW_YY) {
		LAW_YY = lAW_YY;
	}
	public String getACC_CD() {
		return ACC_CD;
	}
	public void setACC_CD(String aCC_CD) {
		ACC_CD = aCC_CD;
	}
	public String getACC_DTL_CD() {
		return ACC_DTL_CD;
	}
	public void setACC_DTL_CD(String aCC_DTL_CD) {
		ACC_DTL_CD = aCC_DTL_CD;
	}
	@Override
	public String toString() {
		return "AssetClassifyCode [ASSET_CD=" + ASSET_CD + ", CODE_NM=" + CODE_NM + ", LAW_YY=" + LAW_YY + ", ACC_CD="
				+ ACC_CD + ", ACC_DTL_CD=" + ACC_DTL_CD + "]";
	}
	
	
}
