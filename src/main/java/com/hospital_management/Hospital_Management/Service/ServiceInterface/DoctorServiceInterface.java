package com.hospital_management.Hospital_Management.Service.ServiceInterface;

import java.util.List;

import com.hospital_management.Hospital_Management.Entity.Doctor;

public interface DoctorServiceInterface {
    public Doctor registerDoctor(Doctor doctor);

    public List<Doctor> getAllDoctors();
}
