package com.groupware_mini.groupware.mapper;

import com.groupware_mini.groupware.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    EmployeeDto findByEmployeeName(@Param("employeeName") String employeeName);
}
