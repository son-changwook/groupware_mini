package com.groupware_mini.groupware.service;

import com.groupware_mini.groupware.dto.DepartmentDto;
import com.groupware_mini.groupware.dto.EmpPositionDto;

import java.util.List;

public interface AccountService {
    List<DepartmentDto> getDepartments();

    List<EmpPositionDto> getPositions();
}
