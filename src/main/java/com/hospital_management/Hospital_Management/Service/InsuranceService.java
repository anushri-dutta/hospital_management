package com.hospital_management.Hospital_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_management.Hospital_Management.Entity.Insurance;
import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Repository.InsuranceRepo;
import com.hospital_management.Hospital_Management.Repository.PatientRepo;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.InsuranceServiceInterface;

import jakarta.transaction.Transactional;

@Service
public class InsuranceService implements InsuranceServiceInterface{

    @Autowired
    public InsuranceRepo insuranceRepo;

    @Autowired
    public PatientRepo patientRepo;

    @Override
    @Transactional
    public Insurance createInsurance(Insurance insurance, Long patientId) {

        System.out.println("Patient ID received: " + patientId);

        Patient patient = patientRepo.findById(patientId).orElseThrow(() -> new IllegalArgumentException("Invalid patient ID"));

        patient.setInsurance(insurance);
        insurance.setPatient(patient);
        return insurance;
     //   return patientRepo.save(patient).getInsurance();
    }

    @Override
    public List<Insurance> getAllInsurance() {
        return insuranceRepo.findAll();
    }

}
