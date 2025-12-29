package com.hospital_management.Hospital_Management.DTO.Response;

import lombok.Data;

@Data
public class InsuranceResponseDTO {

	private Long id;

	private String policyNumber;

	private String provider;

	private String validTill;

	private Long patientId;

}
