package com.groupware_mini.first_project.service;

import org.springframework.stereotype.Service;

import com.groupware_mini.first_project.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    // 생성자 주입
    public AccountServiceImpl(AccountMapper accountMapper) {

        this.accountMapper = accountMapper; // 의존성 초기화
    }

}
