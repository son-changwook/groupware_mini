package com.groupware_mini.groupware.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDetailsDto {

    private int employeeId;
    private Date birthDate;
    private Date joinDate;
    private Date resignationDate;
    private String address;
    private String detailedAddress;

}
