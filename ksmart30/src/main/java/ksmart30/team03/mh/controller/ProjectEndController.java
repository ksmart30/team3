package ksmart30.team03.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectEndController {

    @GetMapping("/manHour/projectEndView")
    public String projectEndView() {
        return "mh/project/projectEndView";
    }
}