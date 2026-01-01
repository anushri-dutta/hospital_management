package com.hospital_management.Hospital_Management.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.hospital_management.Hospital_Management.Entity.Doctor;
import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.DoctorServiceInterface;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.PatientServiceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    DoctorServiceInterface doctorServiceInterface;

    @PostMapping
    public Doctor registerDoctor(@RequestBody Doctor doctor) {
        return doctorServiceInterface.registerDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorServiceInterface.getAllDoctors();
    }

}
