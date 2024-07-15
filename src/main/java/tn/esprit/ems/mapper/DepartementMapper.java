package tn.esprit.ems.mapper;

import tn.esprit.ems.dto.DepartementDto;
import tn.esprit.ems.entity.Departement;

public class DepartementMapper {


    public static DepartementDto mapToDepartementDto(Departement departement){
        return new DepartementDto(
                departement.getId(),
                departement.getName(),
                departement.getEmployees()
        );
    }
    public static Departement mapToDepartement(DepartementDto departementDto){
        return new Departement(
                departementDto.getId(),
                departementDto.getName(),
                departementDto.getEmployees()

        );
    }
}
