package com.groupware_mini.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(path = { "/", "home" })
    public String blankPage() {
        return "blank";
    }

}
