package com.groupware_mini.groupware.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @RequestMapping(path= { "/", "/home" })
    public String homePage(){

        return "home";
    }

}
