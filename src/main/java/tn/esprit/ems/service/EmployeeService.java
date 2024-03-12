package tn.esprit.ems.service;

import tn.esprit.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    void deleteEmployee(Long id);
    List<EmployeeDto> getAll();
    EmployeeDto updateEmployee(Long id , EmployeeDto updatedEmployee);

}
