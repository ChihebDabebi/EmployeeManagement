package tn.esprit.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ems.dto.EmployeeDto;
import tn.esprit.ems.entity.Employee;
import tn.esprit.ems.service.EmployeeService;
import tn.esprit.ems.service.impl.EmployeeServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id ){
        EmployeeDto employeeById = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employeeById,HttpStatus.ACCEPTED);
    }
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> getEmployees(){
        return new ResponseEntity<>(employeeService.getAll(),HttpStatus.ACCEPTED);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(
            @PathVariable Long id,
            @RequestBody EmployeeDto employeeDto
    ){
        employeeService.updateEmployee(id,employeeDto);
        return new ResponseEntity<>(employeeDto,HttpStatus.CREATED);

    }


}
