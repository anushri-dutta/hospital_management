package com.hospital_management.Hospital_Management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public Patient registerPatient(Patient patient) {
        // Patient newPatient = Patient.builder()
        //         .name(patient.getName())
        //         .age(patient.getAge())
        //         .build();

        if (patient.getId() != null) {
            throw new IllegalArgumentException("Patient name cannot added");
        }

        return patientRepo.save(patient);
    }
}
