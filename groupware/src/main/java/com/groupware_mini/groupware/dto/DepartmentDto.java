package com.groupware_mini.groupware.dto;

import lombok.Data;

@Data
public class DepartmentDto {
    private int departmentId;
    private String departmentName;
    private int parentId;
}
