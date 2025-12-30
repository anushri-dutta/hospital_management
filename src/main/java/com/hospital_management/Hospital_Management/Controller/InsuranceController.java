package com.hospital_management.Hospital_Management.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_management.Hospital_Management.Entity.Insurance;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.InsuranceServiceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/insurances")
public class InsuranceController {

    @Autowired
    public InsuranceServiceInterface insuranceServiceInterface;

    @PostMapping
    public Insurance createInsurance(@RequestBody Insurance insurance, @RequestParam Long patientId) {

        return insuranceServiceInterface.createInsurance(insurance, patientId);

    }

    @GetMapping
    public List<Insurance> getAllInsurance() {

        return insuranceServiceInterface.getAllInsurance();

    }

}
