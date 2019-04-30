package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ProjectEndRequest {
   
    private String PRE_PJT_CD;//사업성검토 프로젝트 코드
    private String PJT_CD;//계약프로젝트 프로젝트 코드

    /**
     * @return the pRE_PJT_CD
     */
    public String getPRE_PJT_CD() {
        return PRE_PJT_CD;
    }

    /**
     * @param pRE_PJT_CD the pRE_PJT_CD to set
     */
    public void setPRE_PJT_CD(String pRE_PJT_CD) {
        PRE_PJT_CD = pRE_PJT_CD;
    }

    /**
     * @return the pJT_CD
     */
    public String getPJT_CD() {
        return PJT_CD;
    }

    /**
     * @param pJT_CD the pJT_CD to set
     */
    public void setPJT_CD(String pJT_CD) {
        PJT_CD = pJT_CD;
    }

    @Override
    public String toString() {
        return "ProjectEndRequest [PJT_CD=" + PJT_CD + ", PRE_PJT_CD=" + PRE_PJT_CD + "]";
    }
    
    
}