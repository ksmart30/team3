package ksmart30.team00.system.domain;

import org.springframework.stereotype.Component;

@Component
public class Login {

    private String EMP_NO;  // 아이디(사원번호)
    private String PASS_WD; // 비밀번호
    private String KOR_NM;  // 사원명

    public String getEMP_NO() {
        return EMP_NO;
    }
    public void setEMP_NO(String eMP_NO) {
        EMP_NO = eMP_NO;
    }
    public String getPASS_WD() {
        return PASS_WD;
    }
    public void setPASS_WD(String pASS_WD) {
        PASS_WD = pASS_WD;
    }
    public String getKOR_NM() {
        return KOR_NM;
    }
    public void setKOR_NM(String kOR_NM) {
        KOR_NM = kOR_NM;
    }
    @Override
	public String toString() {
		return "Login [EMP_NO=" + EMP_NO + ", PASS_WD=" + PASS_WD +", KOR_NM=" + KOR_NM +"]";
	}
}
