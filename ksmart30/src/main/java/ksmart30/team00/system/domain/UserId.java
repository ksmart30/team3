package ksmart30.team00.system.domain;

import org.springframework.stereotype.Component;

@Component
public class UserId {
    private String EMP_NO;          // 사원명
	private String JIK_GB;          // 직원코드
    private String PASS_WD;         // 비밀번호
    private String PASS_WD_CHECK;   // 비밀번호 확인
	private String LOG_STA;         // 로그상태
	private String CRT_MAN;         // 등록자
	private String CRT_DATE;        // 등록일자
	private String UPD_MAN;         // 수정자
    private String UPD_DATE;        // 수정일자
    private String RESULT;          // 리턴변수(임시)

    public String getEMP_NO() {
        return EMP_NO;
    }
    public void setEMP_NO(String eMP_NO) {
        EMP_NO = eMP_NO;
    }
    public String getJIK_GB() {
        return JIK_GB;
    }
    public void setJIK_GB(String jIK_GB) {
        JIK_GB = jIK_GB;
    }
    public String getPASS_WD() {
        return PASS_WD;
    }
    public void setPASS_WD(String pASS_WD) {
        PASS_WD = pASS_WD;
    }
    public String getLOG_STA() {
        return LOG_STA;
    }
    public void setLOG_STA(String lOG_STA) {
        LOG_STA = lOG_STA;
    }
    public String getCRT_MAN() {
        return CRT_MAN;
    }
    public void setCRT_MAN(String cRT_MAN) {
        CRT_MAN = cRT_MAN;
    }
    public String getCRT_DATE() {
        return CRT_DATE;
    }
    public void setCRT_DATE(String cRT_DATE) {
        CRT_DATE = cRT_DATE;
    }
    public String getUPD_MAN() {
        return UPD_MAN;
    }
    public void setUPD_MAN(String uPD_MAN) {
        UPD_MAN = uPD_MAN;
    }
    public String getUPD_DATE() {
        return UPD_DATE;
    }
    public void setUPD_DATE(String uPD_DATE) {
        UPD_DATE = uPD_DATE;
    }
    public String getPASS_WD_CHECK() {
        return PASS_WD_CHECK;
    }
    public void setPASS_WD_CHECK(String pASS_WD_CHECK) {
        PASS_WD_CHECK = pASS_WD_CHECK;
    }
    public String getRESULT() {
        return RESULT;
    }
    public void setRESULT(String rESULT) {
        this.RESULT = rESULT;
    }
    @Override
    public String toString() {
        return "UserId [CRT_DATE=" + CRT_DATE + ", CRT_MAN=" + CRT_MAN + ", EMP_NO=" + EMP_NO + ", JIK_GB=" + JIK_GB
                + ", LOG_STA=" + LOG_STA + ", PASS_WD=" + PASS_WD + ", PASS_WD_CHECK=" + PASS_WD_CHECK + ", UPD_DATE="
                + UPD_DATE + ", UPD_MAN=" + UPD_MAN + ", RESULT=" + RESULT + "]";
    }
}
