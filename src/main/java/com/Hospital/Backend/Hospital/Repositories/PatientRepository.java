package com.Hospital.Backend.Hospital.Repositories;


import com.Hospital.Backend.Hospital.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient, Long> {
}