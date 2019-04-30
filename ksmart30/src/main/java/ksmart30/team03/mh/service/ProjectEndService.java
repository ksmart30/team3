package ksmart30.team03.mh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.ProjectEnd;
import ksmart30.team03.mh.mapper.ProjectEndMapper;

@Service
public class ProjectEndService{
    @Autowired private ProjectEndMapper projectEndMapper;

    //5.2.6 프로젝트 종료 프로젝트 list 출력 
    public List<ProjectEnd> getManHouProjectEndMapper(){
        System.out.println("SERVICE : 프로젝트 list 출력");
        return projectEndMapper.getManHourProjectEndList();
    }
    //5.2.6 프로젝트 단계종료처리 list 출력(사업성검토, 계약프로젝트list가 서로 다름)
    public List<ProjectEnd> getManHourProjectEndManageList(ProjectEnd projectEnd){
        String PJT_TYPE = projectEnd.getPJT_TYPE();
        String PJT_CD = projectEnd.getPJT_CD();

        List<ProjectEnd> result = new ArrayList<>();
        //PJT_TYPE = NULL 계약프로젝트관리 처리  NOT NULL 사업성검토 처리
        if(PJT_TYPE.equals(" ")){
            result = projectEndMapper.getManHourProjectEndProjectManageList(projectEnd);
            System.out.println("SERVICE : 결과값(계약프로젝트) "+result);
        }else if(PJT_TYPE.equals("C") || PJT_TYPE.equals("F")){                   
            String PRE_PJT_CD = 20+PJT_CD;
            projectEnd.setPJT_CD(PRE_PJT_CD);
            result =  projectEndMapper.getManHourProjectEndBusinessManageList(projectEnd);
            System.out.println("SERVICE : 결과값(사업성검토) "+result+"PJT_CD 확인 : "+PJT_CD);
        }
        return result;
    }
    //5.2.6 계약프로젝트, 사업성검토 종료구분 select box list 출력 endProjectGbListView 
    public List<Map<String, Object>> endProjectGbListView(){
        System.out.println("SERVICE : 프로젝트 종료구분 list 출력");
        return projectEndMapper.endProjectGbListView();
    }


}