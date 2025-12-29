package com.hospital_management.Hospital_Management.DTO.Request;

import lombok.Data;

@Data
public class InsuranceRequestDTO {

	private String policyNumber;

	private String provider;

	private String validTill;

	private Long patientId;

}
