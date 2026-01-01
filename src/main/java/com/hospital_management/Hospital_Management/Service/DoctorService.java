package com.hospital_management.Hospital_Management.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital_management.Hospital_Management.Entity.Doctor;
import com.hospital_management.Hospital_Management.Repository.DoctorRepo;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.DoctorServiceInterface;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorService implements DoctorServiceInterface {

    public final DoctorRepo doctorRepo;

    @Override
    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

}
