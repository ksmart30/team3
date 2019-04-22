package ksmart30.team03.kuntae.domain;

import org.springframework.stereotype.Component;

@Component
public class DailyWork {
	
	private String SYS_COD;
	private String SORT_DEPT;
	private String GUBUN;
	private String DEPT_CD;			// 부서 코드
	private String DEPT_NM;			// 부서 이름 
	private String DEPT_TITLE;		// 
	private String TOT_INWON;		// 부서 총원
	private String CHUL_INWON;		// 결근 인원
	private String JIGAK_INWON;		// 지각 인원
	private String SAGO_INWON;		// 정상 출근
	private String SAGO_01;
	private String SAGO_02;
	private String SAGO_03;
	private String SAGO_04;
	private String SAGO_05;
	private String SAGO_06;
	private String SAGO_07;
	private String SAGO_08;
	private String SAGO_09;
	private String SAGO_10;
	private String T_TOT_INWON;		// 
	private String T_CHUL_INWON;
	private String T_JIGAK_INWON;
	private String T_SAGO_INWON;
	private String T_SAGO_01;
	private String T_SAGO_02;
	private String T_SAGO_03;
	private String T_SAGO_04;
	private String T_SAGO_05;
	private String T_SAGO_06;
	private String T_SAGO_07;
	private String T_SAGO_08;
	private String T_SAGO_09;
	private String T_SAGO_10;
	private String SAYOU_NM;
	private String ETC_TIME;
	
	
	public String getSAYOU_NM() {
		return SAYOU_NM;
	}
	public void setSAYOU_NM(String sAYOU_NM) {
		SAYOU_NM = sAYOU_NM;
	}
	public String getETC_TIME() {
		return ETC_TIME;
	}
	public void setETC_TIME(String eTC_TIME) {
		ETC_TIME = eTC_TIME;
	}
	public String getSYS_COD() {
		return SYS_COD;
	}
	public void setSYS_COD(String sYS_COD) {
		SYS_COD = sYS_COD;
	}
	public String getSORT_DEPT() {
		return SORT_DEPT;
	}
	public void setSORT_DEPT(String sORT_DEPT) {
		SORT_DEPT = sORT_DEPT;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
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
	public String getDEPT_TITLE() {
		return DEPT_TITLE;
	}
	public void setDEPT_TITLE(String dEPT_TITLE) {
		DEPT_TITLE = dEPT_TITLE;
	}
	public String getTOT_INWON() {
		return TOT_INWON;
	}
	public void setTOT_INWON(String tOT_INWON) {
		TOT_INWON = tOT_INWON;
	}
	public String getCHUL_INWON() {
		return CHUL_INWON;
	}
	public void setCHUL_INWON(String cHUL_INWON) {
		CHUL_INWON = cHUL_INWON;
	}
	public String getJIGAK_INWON() {
		return JIGAK_INWON;
	}
	public void setJIGAK_INWON(String jIGAK_INWON) {
		JIGAK_INWON = jIGAK_INWON;
	}
	public String getSAGO_INWON() {
		return SAGO_INWON;
	}
	public void setSAGO_INWON(String sAGO_INWON) {
		SAGO_INWON = sAGO_INWON;
	}
	public String getSAGO_01() {
		return SAGO_01;
	}
	public void setSAGO_01(String sAGO_01) {
		SAGO_01 = sAGO_01;
	}
	public String getSAGO_02() {
		return SAGO_02;
	}
	public void setSAGO_02(String sAGO_02) {
		SAGO_02 = sAGO_02;
	}
	public String getSAGO_03() {
		return SAGO_03;
	}
	public void setSAGO_03(String sAGO_03) {
		SAGO_03 = sAGO_03;
	}
	public String getSAGO_04() {
		return SAGO_04;
	}
	public void setSAGO_04(String sAGO_04) {
		SAGO_04 = sAGO_04;
	}
	public String getSAGO_05() {
		return SAGO_05;
	}
	public void setSAGO_05(String sAGO_05) {
		SAGO_05 = sAGO_05;
	}
	public String getSAGO_06() {
		return SAGO_06;
	}
	public void setSAGO_06(String sAGO_06) {
		SAGO_06 = sAGO_06;
	}
	public String getSAGO_07() {
		return SAGO_07;
	}
	public void setSAGO_07(String sAGO_07) {
		SAGO_07 = sAGO_07;
	}
	public String getSAGO_08() {
		return SAGO_08;
	}
	public void setSAGO_08(String sAGO_08) {
		SAGO_08 = sAGO_08;
	}
	public String getSAGO_09() {
		return SAGO_09;
	}
	public void setSAGO_09(String sAGO_09) {
		SAGO_09 = sAGO_09;
	}
	public String getSAGO_10() {
		return SAGO_10;
	}
	public void setSAGO_10(String sAGO_10) {
		SAGO_10 = sAGO_10;
	}
	public String getT_TOT_INWON() {
		return T_TOT_INWON;
	}
	public void setT_TOT_INWON(String t_TOT_INWON) {
		T_TOT_INWON = t_TOT_INWON;
	}
	public String getT_CHUL_INWON() {
		return T_CHUL_INWON;
	}
	public void setT_CHUL_INWON(String t_CHUL_INWON) {
		T_CHUL_INWON = t_CHUL_INWON;
	}
	public String getT_JIGAK_INWON() {
		return T_JIGAK_INWON;
	}
	public void setT_JIGAK_INWON(String t_JIGAK_INWON) {
		T_JIGAK_INWON = t_JIGAK_INWON;
	}
	public String getT_SAGO_INWON() {
		return T_SAGO_INWON;
	}
	public void setT_SAGO_INWON(String t_SAGO_INWON) {
		T_SAGO_INWON = t_SAGO_INWON;
	}
	public String getT_SAGO_01() {
		return T_SAGO_01;
	}
	public void setT_SAGO_01(String t_SAGO_01) {
		T_SAGO_01 = t_SAGO_01;
	}
	public String getT_SAGO_02() {
		return T_SAGO_02;
	}
	public void setT_SAGO_02(String t_SAGO_02) {
		T_SAGO_02 = t_SAGO_02;
	}
	public String getT_SAGO_03() {
		return T_SAGO_03;
	}
	public void setT_SAGO_03(String t_SAGO_03) {
		T_SAGO_03 = t_SAGO_03;
	}
	public String getT_SAGO_04() {
		return T_SAGO_04;
	}
	public void setT_SAGO_04(String t_SAGO_04) {
		T_SAGO_04 = t_SAGO_04;
	}
	public String getT_SAGO_05() {
		return T_SAGO_05;
	}
	public void setT_SAGO_05(String t_SAGO_05) {
		T_SAGO_05 = t_SAGO_05;
	}
	public String getT_SAGO_06() {
		return T_SAGO_06;
	}
	public void setT_SAGO_06(String t_SAGO_06) {
		T_SAGO_06 = t_SAGO_06;
	}
	public String getT_SAGO_07() {
		return T_SAGO_07;
	}
	public void setT_SAGO_07(String t_SAGO_07) {
		T_SAGO_07 = t_SAGO_07;
	}
	public String getT_SAGO_08() {
		return T_SAGO_08;
	}
	public void setT_SAGO_08(String t_SAGO_08) {
		T_SAGO_08 = t_SAGO_08;
	}
	public String getT_SAGO_09() {
		return T_SAGO_09;
	}
	public void setT_SAGO_09(String t_SAGO_09) {
		T_SAGO_09 = t_SAGO_09;
	}
	public String getT_SAGO_10() {
		return T_SAGO_10;
	}
	public void setT_SAGO_10(String t_SAGO_10) {
		T_SAGO_10 = t_SAGO_10;
	}
	
	@Override
	public String toString() {
		return "DailyWork [SYS_COD=" + SYS_COD + ", SORT_DEPT=" + SORT_DEPT + ", GUBUN=" + GUBUN + ", DEPT_CD="
				+ DEPT_CD + ", DEPT_NM=" + DEPT_NM + ", DEPT_TITLE=" + DEPT_TITLE + ", TOT_INWON=" + TOT_INWON
				+ ", CHUL_INWON=" + CHUL_INWON + ", JIGAK_INWON=" + JIGAK_INWON + ", SAGO_INWON=" + SAGO_INWON
				+ ", SAGO_01=" + SAGO_01 + ", SAGO_02=" + SAGO_02 + ", SAGO_03=" + SAGO_03 + ", SAGO_04=" + SAGO_04
				+ ", SAGO_05=" + SAGO_05 + ", SAGO_06=" + SAGO_06 + ", SAGO_07=" + SAGO_07 + ", SAGO_08=" + SAGO_08
				+ ", SAGO_09=" + SAGO_09 + ", SAGO_10=" + SAGO_10 + ", T_TOT_INWON=" + T_TOT_INWON + ", T_CHUL_INWON="
				+ T_CHUL_INWON + ", T_JIGAK_INWON=" + T_JIGAK_INWON + ", T_SAGO_INWON=" + T_SAGO_INWON + ", T_SAGO_01="
				+ T_SAGO_01 + ", T_SAGO_02=" + T_SAGO_02 + ", T_SAGO_03=" + T_SAGO_03 + ", T_SAGO_04=" + T_SAGO_04
				+ ", T_SAGO_05=" + T_SAGO_05 + ", T_SAGO_06=" + T_SAGO_06 + ", T_SAGO_07=" + T_SAGO_07 + ", T_SAGO_08="
				+ T_SAGO_08 + ", T_SAGO_09=" + T_SAGO_09 + ", T_SAGO_10=" + T_SAGO_10 + ", SAYOU_NM=" + SAYOU_NM
				+ ", ETC_TIME=" + ETC_TIME + "]";
	}
	
}
