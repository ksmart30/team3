package ksmart30.team03.mh.domain;

import org.springframework.stereotype.Component;

@Component
public class ProjectEnd {
    private String PJT_CD;//프로젝트 코드
    private String DEPT_NM;//부서명
    private String PJT_NM;//프로젝트명
    private String PJT_TYPE;//프로젝트 타입
    private String PRE_PJT_CD;//프로젝트 코드(사업성검토중)
    private String SEQ;//프로젝트 분류(사업성검토)
    private String BGCOLOR;//백그라운드 컬러
	private String WORK_STEP; //프로젝트 단계
	private String WORK_STEP_NM; //프로젝트 단계 명
    private String END_EXP_DATE;//완료 예정일
    private String END_DATE;//종료일
	private String END_YN;//종료 여부(1:종료, 0:종료 전)
	private String PLAN_END_DAY; //완료예정일
	private String REAL_END_DAY; //종료일자
	

    /**
     * @return the dEPT_NM
     */
    public String getDEPT_NM() {
        return DEPT_NM;
    }

    /**
     * @param dEPT_NM the dEPT_NM to set
     */
    public void setDEPT_NM(String dEPT_NM) {
        DEPT_NM = dEPT_NM;
    }

    /**
     * @return the pJT_NM
     */
    public String getPJT_NM() {
        return PJT_NM;
    }

    /**
     * @param pJT_NM the pJT_NM to set
     */
    public void setPJT_NM(String pJT_NM) {
        PJT_NM = pJT_NM;
    }

    /**
     * @return the pJT_TYPE
     */
    public String getPJT_TYPE() {
        return PJT_TYPE;
    }

    /**
     * @param pJT_TYPE the pJT_TYPE to set
     */
    public void setPJT_TYPE(String pJT_TYPE) {
        PJT_TYPE = pJT_TYPE;
    }

    @Override
	public String toString() {
		return "ProjectEnd [BGCOLOR=" + BGCOLOR + ", DEPT_NM=" + DEPT_NM + ", END_DATE=" + END_DATE + ", END_EXP_DATE="
				+ END_EXP_DATE + ", END_YN=" + END_YN + ", PJT_CD=" + PJT_CD + ", PJT_NM=" + PJT_NM + ", PJT_TYPE="
				+ PJT_TYPE + ", PLAN_END_DAY=" + PLAN_END_DAY + ", PRE_PJT_CD=" + PRE_PJT_CD + ", REAL_END_DAY="
				+ REAL_END_DAY + ", SEQ=" + SEQ + ", WORK_STEP=" + WORK_STEP + ", WORK_STEP_NM=" + WORK_STEP_NM + "]";
	}

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
	 * @return the sEQ
	 */
	public String getSEQ() {
		return SEQ;
	}

	/**
	 * @param sEQ the sEQ to set
	 */
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	/**
	 * @return the bGCOLOR
	 */
	public String getBGCOLOR() {
		return BGCOLOR;
	}

	/**
	 * @param bGCOLOR the bGCOLOR to set
	 */
	public void setBGCOLOR(String bGCOLOR) {
		BGCOLOR = bGCOLOR;
	}


	/**
	 * @return the eND_EXP_DATE
	 */
	public String getEND_EXP_DATE() {
		return END_EXP_DATE;
	}

	/**
	 * @param eND_EXP_DATE the eND_EXP_DATE to set
	 */
	public void setEND_EXP_DATE(String eND_EXP_DATE) {
		END_EXP_DATE = eND_EXP_DATE;
	}

	/**
	 * @return the eND_DATE
	 */
	public String getEND_DATE() {
		return END_DATE;
	}

	/**
	 * @param eND_DATE the eND_DATE to set
	 */
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	/**
	 * @return the eND_YN
	 */
	public String getEND_YN() {
		return END_YN;
	}

	/**
	 * @param eND_YN the eND_YN to set
	 */
	public void setEND_YN(String eND_YN) {
		END_YN = eND_YN;
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

	/**
	 * @return the wORK_STEP
	 */
	public String getWORK_STEP() {
		return WORK_STEP;
	}

	/**
	 * @param wORK_STEP the wORK_STEP to set
	 */
	public void setWORK_STEP(String wORK_STEP) {
		WORK_STEP = wORK_STEP;
	}

	/**
	 * @return the pLAN_END_DAY
	 */
	public String getPLAN_END_DAY() {
		return PLAN_END_DAY;
	}

	/**
	 * @param pLAN_END_DAY the pLAN_END_DAY to set
	 */
	public void setPLAN_END_DAY(String pLAN_END_DAY) {
		PLAN_END_DAY = pLAN_END_DAY;
	}

	/**
	 * @return the rEAL_END_DAY
	 */
	public String getREAL_END_DAY() {
		return REAL_END_DAY;
	}

	/**
	 * @param rEAL_END_DAY the rEAL_END_DAY to set
	 */
	public void setREAL_END_DAY(String rEAL_END_DAY) {
		REAL_END_DAY = rEAL_END_DAY;
	}

	/**
	 * @return the wORK_STEP_NM
	 */
	public String getWORK_STEP_NM() {
		return WORK_STEP_NM;
	}

	/**
	 * @param wORK_STEP_NM the wORK_STEP_NM to set
	 */
	public void setWORK_STEP_NM(String wORK_STEP_NM) {
		WORK_STEP_NM = wORK_STEP_NM;
	}
   
    

}