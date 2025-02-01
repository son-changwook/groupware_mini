package com.groupware_mini.groupware.mapper;

import com.groupware_mini.groupware.dto.DepartmentDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("SELECT department_id, department_name, parent_id FROM department")
    List<DepartmentDto> getAllDepartments();
}
