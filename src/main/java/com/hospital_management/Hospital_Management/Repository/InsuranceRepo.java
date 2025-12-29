package com.hospital_management.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital_management.Hospital_Management.Entity.Insurance;

@Repository
public interface InsuranceRepo extends JpaRepository<Insurance, Long> {
    
}
