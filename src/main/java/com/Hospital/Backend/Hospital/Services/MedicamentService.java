package com.Hospital.Backend.Hospital.Services;

import com.Hospital.Backend.Hospital.Entities.Medicament;

import java.util.List;

public interface MedicamentService {
    List<Medicament> getAllMedicaments();
    Medicament getMedicamentById(Long id);
    Medicament saveMedicament(Medicament medicament);
    void deleteMedicament(Long id);
}