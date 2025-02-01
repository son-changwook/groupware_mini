package com.groupware_mini.groupware.service;

import com.groupware_mini.groupware.dto.EmployeeDto;

public interface AccountService {
    EmployeeDto getEmployeeInfoByEnployeeName(String employeeName);
}
