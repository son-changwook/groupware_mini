package com.groupware_mini.groupware.dto;

import lombok.Data;

@Data
public class EmployeeDto {

    private int employeeId;
    private String employeeName;
    private String password;
    private String employeePhone;
    private String employeeEmail;
    // 식별 컬럼
    private int positionId;
    private int departmentId;

}
