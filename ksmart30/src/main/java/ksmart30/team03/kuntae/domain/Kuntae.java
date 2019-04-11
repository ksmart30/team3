package ksmart30.team03.kuntae.domain;

import org.springframework.stereotype.Component;

@Component
public class Kuntae {
	private String SYS_COD;
	private String GUBUN;
	private String DEPT_NM;//부서명
	private String JIKGUP_CD;//직급코드
	private String KOR_NM;//성명
	private String EMP_NO;//사원번호
	private String JIGAK;//지각횟수
	private String KYULGUN1;//결근(사고계제출)
	private String KYULGUN2;//결근(무단결근)
	private String SAYU_NM;//결근사유
	private String JIKGUP_NM;//직급명
	private String DEPT_CD;//부서코드
	
	private String FRDATE;
	private String TODATE;
	
	private int HOLI_1;//
	private int HOLI_2;
	private int HOLI_3;
	private int HOLI_4;
	private int HOLI_5;
	private int HOLI_6;
	public String getFRDATE() {
		return FRDATE;
	}
	public void setFRDATE(String fRDATE) {
		FRDATE = fRDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	private int HOLI_7;
	private int HOLI_WORK;//휴일근무일수
	private int YEARLY_DAY;//연차휴가발생
	private int KYUL_TOT;
	private int YEARLY_CHA;
	private int CNT;
	public String getSYS_COD() {
		return SYS_COD;
	}
	public void setSYS_COD(String sYS_COD) {
		SYS_COD = sYS_COD;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
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
	public String getKOR_NM() {
		return KOR_NM;
	}
	public void setKOR_NM(String kOR_NM) {
		KOR_NM = kOR_NM;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getJIGAK() {
		return JIGAK;
	}
	public void setJIGAK(String jIGAK) {
		JIGAK = jIGAK;
	}
	public String getKYULGUN1() {
		return KYULGUN1;
	}
	public void setKYULGUN1(String kYULGUN1) {
		KYULGUN1 = kYULGUN1;
	}
	public String getKYULGUN2() {
		return KYULGUN2;
	}
	public void setKYULGUN2(String kYULGUN2) {
		KYULGUN2 = kYULGUN2;
	}
	public String getSAYU_NM() {
		return SAYU_NM;
	}
	public void setSAYU_NM(String sAYU_NM) {
		SAYU_NM = sAYU_NM;
	}
	public String getJIKGUP_NM() {
		return JIKGUP_NM;
	}
	public void setJIKGUP_NM(String jIKGUP_NM) {
		JIKGUP_NM = jIKGUP_NM;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public int getHOLI_1() {
		return HOLI_1;
	}
	public void setHOLI_1(int hOLI_1) {
		HOLI_1 = hOLI_1;
	}
	public int getHOLI_2() {
		return HOLI_2;
	}
	public void setHOLI_2(int hOLI_2) {
		HOLI_2 = hOLI_2;
	}
	public int getHOLI_3() {
		return HOLI_3;
	}
	public void setHOLI_3(int hOLI_3) {
		HOLI_3 = hOLI_3;
	}
	public int getHOLI_4() {
		return HOLI_4;
	}
	public void setHOLI_4(int hOLI_4) {
		HOLI_4 = hOLI_4;
	}
	public int getHOLI_5() {
		return HOLI_5;
	}
	public void setHOLI_5(int hOLI_5) {
		HOLI_5 = hOLI_5;
	}
	public int getHOLI_6() {
		return HOLI_6;
	}
	public void setHOLI_6(int hOLI_6) {
		HOLI_6 = hOLI_6;
	}
	public int getHOLI_7() {
		return HOLI_7;
	}
	public void setHOLI_7(int hOLI_7) {
		HOLI_7 = hOLI_7;
	}
	public int getHOLI_WORK() {
		return HOLI_WORK;
	}
	public void setHOLI_WORK(int hOLI_WORK) {
		HOLI_WORK = hOLI_WORK;
	}
	public int getYEARLY_DAY() {
		return YEARLY_DAY;
	}
	public void setYEARLY_DAY(int yEARLY_DAY) {
		YEARLY_DAY = yEARLY_DAY;
	}
	public int getKYUL_TOT() {
		return KYUL_TOT;
	}
	public void setKYUL_TOT(int kYUL_TOT) {
		KYUL_TOT = kYUL_TOT;
	}
	public int getYEARLY_CHA() {
		return YEARLY_CHA;
	}
	public void setYEARLY_CHA(int yEARLY_CHA) {
		YEARLY_CHA = yEARLY_CHA;
	}
	public int getCNT() {
		return CNT;
	}
	public void setCNT(int cNT) {
		CNT = cNT;
	}
	@Override
	public String toString() {
		return "Kuntae [SYS_COD=" + SYS_COD + ", GUBUN=" + GUBUN + ", DEPT_NM=" + DEPT_NM + ", JIKGUP_CD=" + JIKGUP_CD
				+ ", KOR_NM=" + KOR_NM + ", EMP_NO=" + EMP_NO + ", JIGAK=" + JIGAK + ", KYULGUN1=" + KYULGUN1
				+ ", KYULGUN2=" + KYULGUN2 + ", SAYU_NM=" + SAYU_NM + ", JIKGUP_NM=" + JIKGUP_NM + ", DEPT_CD="
				+ DEPT_CD + ", FRDATE=" + FRDATE + ", TODATE=" + TODATE + ", HOLI_1=" + HOLI_1 + ", HOLI_2=" + HOLI_2
				+ ", HOLI_3=" + HOLI_3 + ", HOLI_4=" + HOLI_4 + ", HOLI_5=" + HOLI_5 + ", HOLI_6=" + HOLI_6
				+ ", HOLI_7=" + HOLI_7 + ", HOLI_WORK=" + HOLI_WORK + ", YEARLY_DAY=" + YEARLY_DAY + ", KYUL_TOT="
				+ KYUL_TOT + ", YEARLY_CHA=" + YEARLY_CHA + ", CNT=" + CNT + "]";
	}
	
	
	
}