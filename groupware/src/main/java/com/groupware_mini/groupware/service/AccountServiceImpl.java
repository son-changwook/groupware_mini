package com.groupware_mini.groupware.service;

import com.groupware_mini.groupware.dto.EmployeeDto;
import com.groupware_mini.groupware.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;

    @Override
    public EmployeeDto getEmployeeInfoByEnployeeName(String employeeName){

        return accountMapper.findByEmployeeName(employeeName);
    }
}
