package com.groupware_mini.groupware.service;

import com.groupware_mini.groupware.dto.DepartmentDto;
import com.groupware_mini.groupware.dto.EmployeeDto;
import com.groupware_mini.groupware.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;

    public List<DepartmentDto> getDepartments(){
        return accountMapper.getAllDepartments();
    }

}
