package com.hospital_management.Hospital_Management.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_management.Hospital_Management.Entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

    @Query("""
    SELECT DISTINCT p
    FROM Patient p
    LEFT JOIN FETCH p.appointments a
    LEFT JOIN FETCH a.doctor
    """)
    List<Patient> findAllWithAppointmentsAndDoctors();

}
