package com.Hospital.Backend.Hospital.Services.ServiceImpl;

import com.Hospital.Backend.Hospital.Entities.Medicament;
import com.Hospital.Backend.Hospital.Repositories.MedicamentRepository;
import com.Hospital.Backend.Hospital.Services.MedicamentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentServiceImpl implements MedicamentService {
    @Autowired
    private MedicamentRepository medicamentRepository;

    @Override
    public List<Medicament> getAllMedicaments() {
        return medicamentRepository.findAll();
    }

    @Override
    public Medicament getMedicamentById(Long id) {
        return medicamentRepository.findById(id).orElse(null);
    }

    @Override
    public Medicament saveMedicament(Medicament medicament) {
        return medicamentRepository.save(medicament);
    }

    @Override
    public void deleteMedicament(Long id) {
        medicamentRepository.deleteById(id);
    }
}