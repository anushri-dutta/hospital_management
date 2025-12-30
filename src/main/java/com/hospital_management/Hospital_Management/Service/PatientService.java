package com.hospital_management.Hospital_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Repository.PatientRepo;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.PatientServiceInterface;

@Service
public class PatientService implements PatientServiceInterface {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public Patient registerPatient(Patient patient) {

        if (patient.getId() != null) {
            throw new IllegalArgumentException("Patient name cannot added");
        }

        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }
}
