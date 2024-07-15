package tn.esprit.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ems.entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
