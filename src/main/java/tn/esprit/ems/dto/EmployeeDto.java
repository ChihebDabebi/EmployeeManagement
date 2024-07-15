package tn.esprit.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.ems.entity.Departement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto { // to transport data between client and server
    private Long id ;
    private String firstName ;
    private String lastName ;
    private String email;
    private Departement departement;
}
