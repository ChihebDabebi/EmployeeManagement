package tn.esprit.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.ems.entity.Employee;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartementDto {
    private Long id ;
    private String name ;
    private Set<Employee> employees ;

    @Override
    public String toString(){
        return "name : " + this.name;
    }

}
