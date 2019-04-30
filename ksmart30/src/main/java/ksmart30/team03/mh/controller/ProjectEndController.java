package ksmart30.team03.mh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.mh.domain.ProjectEnd;
import ksmart30.team03.mh.service.ProjectEndService;

@Controller
public class ProjectEndController {
    @Autowired private ProjectEndService projectEndService;
    
    //5.2.6 프로젝트 list 출력 및 view로 이동
    @GetMapping("/manHour/projectEndView")
    public String manHourProjectEndView(Model model){
        System.out.println("CONTROLLER : 프로젝트 list 출력");
        List<ProjectEnd> data = projectEndService.getManHouProjectEndMapper();
        model.addAttribute("resultList", data);
        return "mh/project/projectEndView";
    }
    //5.2.6 프로젝트 단계종료처리 list(사업성검토,계약프로젝트 다른 list 출력)
    @GetMapping("/manHour/manHourProjectEndStepList")
    public @ResponseBody List<ProjectEnd> manHourProjectEndStepList(ProjectEnd projectEnd){
        List<ProjectEnd> data = projectEndService.getManHourProjectEndManageList(projectEnd);
        System.out.println("CONTROLLER : 프로젝트 단계종료처리 list(사업성검토,계약프로젝트 다른 list 출력)"+data);
        System.out.println("PJT_CD 확인 : "+projectEnd.getPJT_CD()+"PJT_TYPE 확인 : "+projectEnd.getPJT_TYPE());
        return data;
    }
    //5.2.6 계약프로젝트, 사업성검토 종료구분 select box list 출력    
    @GetMapping("/manHour/manHourProjectGbListView")
    public @ResponseBody List<Map<String, Object>> manHourProjectGbListView(){
        List<Map<String, Object>> data = projectEndService.endProjectGbListView();
        System.out.println("CONTROLLER : 종료구분 select box list 출력 "+data);
        return data;
    }

}