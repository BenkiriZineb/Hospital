package com.Hospital.Backend.Hospital.Entities;

import jakarta.persistence.*;

import java.util.List;

import lombok.Data;

@Entity
@Data
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToMany
    @JoinTable(
            name = "ordonnance_medicament",
            joinColumns = @JoinColumn(name = "ordonnance_id"),
            inverseJoinColumns = @JoinColumn(name = "medicament_id"))
    private List<Medicament> medicament;
    // You can add other necessary fields
    // Getters and setters
}