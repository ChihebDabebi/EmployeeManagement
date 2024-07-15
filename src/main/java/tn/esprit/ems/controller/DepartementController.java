package tn.esprit.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ems.dto.DepartementDto;
import tn.esprit.ems.dto.EmployeeDto;
import tn.esprit.ems.entity.Departement;
import tn.esprit.ems.service.DepartementService;

@RestController
public class DepartementController {

    private final DepartementService departementService;

    public DepartementController(DepartementService departementService){
        this.departementService=departementService;
    }
    @PostMapping
    public ResponseEntity<DepartementDto> createEmployee(@RequestBody DepartementDto departementDto){
        DepartementDto savedDepartement = departementService.createDepartement(departementDto);
        return new ResponseEntity<>(savedDepartement, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
        departementService.deleteDepartement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<DepartementDto> updateEmployee(
            @PathVariable Long id,
            @RequestBody DepartementDto departementDto
    ){
        departementService.updateDepartement(id,departementDto);
        return new ResponseEntity<>(departementDto,HttpStatus.CREATED);

    }
}
