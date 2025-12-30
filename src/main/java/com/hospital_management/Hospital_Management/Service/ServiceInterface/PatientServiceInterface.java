package com.hospital_management.Hospital_Management.Service.ServiceInterface;

import java.util.List;

import com.hospital_management.Hospital_Management.Entity.Patient;

public interface PatientServiceInterface {
    public Patient registerPatient(Patient patient);

    public List<Patient> getAllPatients();
}
