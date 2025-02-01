package com.groupware_mini.groupware.controller;

import com.groupware_mini.groupware.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/login")
    public String loginPage(){
        return "/account/login";
    }

    @GetMapping("register")
    public String registerPage(){
        return "/account/register";
    }
}
