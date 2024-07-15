package tn.esprit.ems.service;

import tn.esprit.ems.dto.DepartementDto;
import tn.esprit.ems.dto.EmployeeDto;

import java.util.List;

public interface DepartementService {
    DepartementDto createDepartement(DepartementDto departementDto);
    DepartementDto getDepartementById(Long departementId);

    void deleteDepartement(Long id);
    List<DepartementDto> getAll();
    DepartementDto updateDepartement(Long id , DepartementDto updatedDepartement);
}
