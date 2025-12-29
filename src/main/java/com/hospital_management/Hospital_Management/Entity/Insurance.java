package com.hospital_management.Hospital_Management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "insurances")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq_gen")
    @SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_seq", initialValue = 1, allocationSize = 5)
    private Long id;

    @Column(name = "policy_number", nullable = false)
    private String policyNumber;

    @Column(name = "provider", nullable = true)
    private String provider;

    @Column(name = "valid_till", nullable = false)
    private String validTill;

    @OneToOne(mappedBy = "insuranceId")
    private Patient patient;

}
