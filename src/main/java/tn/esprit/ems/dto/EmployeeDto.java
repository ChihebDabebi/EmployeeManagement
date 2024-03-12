package tn.esprit.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto { // to transport data between client and server
    private Long id ;
    private String firstName ;
    private String lastName ;
    private String email;
}
