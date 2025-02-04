package com.groupware_mini.groupware.mapper;

import com.groupware_mini.groupware.dto.DepartmentDto;
import com.groupware_mini.groupware.dto.EmpPositionDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("SELECT department_id, department_name, parent_name FROM department")
    List<DepartmentDto> getAllDepartments();

    @Select("SELECT position_id, position_name FROM emp_position")
    List<EmpPositionDto> getAllPositions();
}
