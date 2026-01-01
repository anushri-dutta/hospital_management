package com.hospital_management.Hospital_Management.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "insurances")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_seq", initialValue = 1, allocationSize = 5)
    private Long id;

    @Column(name = "policy_number", nullable = false)
    private String policyNumber;

    @Column(name = "provider", nullable = true)
    private String provider;

    @Column(name = "valid_till", nullable = false)
    private String validTill;

    @OneToOne(mappedBy = "insurance")
   // @JsonBackReference
    private Patient patient;

}
