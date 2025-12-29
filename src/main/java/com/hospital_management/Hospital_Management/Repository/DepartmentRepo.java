package com.hospital_management.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital_management.Hospital_Management.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    
}
