package com.hospital_management.Hospital_Management.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq_gen")
    @SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_seq", initialValue = 1, allocationSize = 5)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "age", nullable = false)
    private Number age;

    @Column(name = "blood_group", nullable = false)
    private String bloodGroup;

    @OneToOne
    @JoinColumn(name = "insurance_id", nullable = true)
    private Insurance insuranceId;


    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    
}
