package tn.esprit.ems.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.ems.dto.DepartementDto;
import tn.esprit.ems.entity.Departement;
import tn.esprit.ems.entity.Employee;
import tn.esprit.ems.exception.ResourceNotFoundException;
import tn.esprit.ems.mapper.DepartementMapper;
import tn.esprit.ems.mapper.EmployeeMapper;
import tn.esprit.ems.repository.DepartementRepository;
import tn.esprit.ems.service.DepartementService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartementServiceImpl implements DepartementService {

    private final DepartementRepository departementRepository;

    public DepartementServiceImpl(DepartementRepository departementRepository){
        this.departementRepository=departementRepository;
    }
    @Override
    public DepartementDto createDepartement(DepartementDto departementDto) {
        Departement departement = DepartementMapper.mapToDepartement(departementDto);
        Departement savedDepartement = departementRepository.save(departement);
        return DepartementMapper.mapToDepartementDto(savedDepartement);
    }

    @Override
    public DepartementDto getDepartementById(Long departementId) {
        Departement departement = departementRepository.findById(departementId).orElseThrow(() -> new ResourceNotFoundException("Departement is not exist with given id :  " + departementId));
        return DepartementMapper.mapToDepartementDto(departement);    }

    @Override
    public void deleteDepartement(Long id) {
        departementRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Departement with given id not found"));
        departementRepository.deleteById(id);
    }

    @Override
    public List<DepartementDto> getAll() {
        List<Departement> departements = departementRepository.findAll();
        return departements.stream()
                .map(departement->DepartementMapper.mapToDepartementDto(departement))
                .collect(Collectors.toList());
    }

    @Override
    public DepartementDto updateDepartement(Long id, DepartementDto updatedDepartement) {
        Departement departement = departementRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Departement not found with given id : " + id));
        departement.setName(updatedDepartement.getName());
        Departement updated = departementRepository.save(departement);
        return DepartementMapper.mapToDepartementDto(updated);

    }
}
