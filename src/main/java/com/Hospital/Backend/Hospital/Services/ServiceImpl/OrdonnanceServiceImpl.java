package com.Hospital.Backend.Hospital.Services.ServiceImpl;

import com.Hospital.Backend.Hospital.Entities.Ordonnance;
import com.Hospital.Backend.Hospital.Repositories.OrdonnanceRepository;
import com.Hospital.Backend.Hospital.Services.OrdonnanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdonnanceServiceImpl implements OrdonnanceService {
    @Autowired
    private OrdonnanceRepository ordonnanceRepository;

    @Override
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceRepository.findAll();
    }

    @Override
    public Ordonnance getOrdonnanceById(Long id) {
        return ordonnanceRepository.findById(id).orElse(null);
    }

    @Override
    public Ordonnance saveOrdonnance(Ordonnance ordonnance) {
        return ordonnanceRepository.save(ordonnance);
    }

    @Override
    public void deleteOrdonnance(Long id) {
        ordonnanceRepository.deleteById(id);
    }

}