package com.groupware_mini.groupware.controller;

import com.groupware_mini.groupware.dto.DepartmentDto;
import com.groupware_mini.groupware.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @GetMapping("/departments")
    @ResponseBody
    public List<DepartmentDto> getDepartments() {
        return accountService.getDepartments();
    }


}
