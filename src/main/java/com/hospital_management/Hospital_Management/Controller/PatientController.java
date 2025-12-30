package com.hospital_management.Hospital_Management.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.PatientServiceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientServiceInterface patientServiceInterface;

    @PostMapping
    public Patient registerPatient(@RequestBody Patient patient) {

        return patientServiceInterface.registerPatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientServiceInterface.getAllPatients();
    }

}
