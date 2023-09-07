package com.afterlife.companyprofile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    // index html data
    @GetMapping(value = "/index")
    public String getIndex(){
        return "index";
    }
}
