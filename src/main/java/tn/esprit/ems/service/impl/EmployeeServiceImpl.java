package tn.esprit.ems.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.ems.dto.EmployeeDto;
import tn.esprit.ems.entity.Employee;
import tn.esprit.ems.mapper.EmployeeMapper;
import tn.esprit.ems.repository.EmployeeRepository;
import tn.esprit.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
