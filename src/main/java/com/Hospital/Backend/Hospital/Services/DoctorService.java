package com.Hospital.Backend.Hospital.Services;

import com.Hospital.Backend.Hospital.Entities.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    Doctor saveDoctor(Doctor doctor);
    void deleteDoctor(Long id);
}