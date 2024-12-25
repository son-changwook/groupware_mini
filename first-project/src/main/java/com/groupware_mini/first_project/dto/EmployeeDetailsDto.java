package com.groupware_mini.first_project.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDetailsDto {

    private int employeeId;
    private Date birthDate;
    private Date joinDate;
    private Date resignationDate;
    private String address;
    private String detailed_address;

}
