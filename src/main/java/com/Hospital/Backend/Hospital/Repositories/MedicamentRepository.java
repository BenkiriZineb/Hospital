package com.Hospital.Backend.Hospital.Repositories;


import com.Hospital.Backend.Hospital.Entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
}
