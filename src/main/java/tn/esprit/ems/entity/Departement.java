package tn.esprit.ems.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departements")
public class Departement {
    @Id
    @GeneratedValue
    private Long id ;

    private String name ;
    @Getter
    @OneToMany(mappedBy = "departement",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employees = new HashSet<>();

    public Departement(Long id, String name) {
        this.id = id ;
        this.name = name ;
    }

    @Override
    public String toString(){
        return "name : " + this.name;
    }

}
