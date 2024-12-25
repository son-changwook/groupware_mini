package com.groupware_mini.first_project.controller;

import org.springframework.stereotype.Controller;

import com.groupware_mini.first_project.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    public final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping({ "/account" })
    public String accountPage() {
        return "/account/login";
    }

    @GetMapping("/account/register")
    public String registerPage() {
        return "/account/register";
    }

}
