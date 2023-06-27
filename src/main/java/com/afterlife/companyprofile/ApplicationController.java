package com.afterlife.companyprofile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping(value = "/afterlife/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping(value = "/afterlife/inner-page")
    public String getInnerPage(){
        return "inner-page";
    }
}
