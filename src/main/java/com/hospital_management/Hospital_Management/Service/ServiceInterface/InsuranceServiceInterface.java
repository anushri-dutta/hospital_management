package com.hospital_management.Hospital_Management.Service.ServiceInterface;

import java.util.List;

import com.hospital_management.Hospital_Management.Entity.Insurance;

public interface InsuranceServiceInterface {

    public Insurance createInsurance(Insurance insurance, Long patientId);

    public List<Insurance> getAllInsurance();

}
