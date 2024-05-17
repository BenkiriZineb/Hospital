package com.Hospital.Backend.Hospital.Repositories;


import com.Hospital.Backend.Hospital.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
