package com.Hospital.Backend.Hospital.Repositories;


import com.Hospital.Backend.Hospital.Entities.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {
}