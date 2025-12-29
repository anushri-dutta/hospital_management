package com.hospital_management.Hospital_Management.DTO.Response;

import java.util.List;

import lombok.Data;

@Data
public class PatientResponseDTO {

	private Long id;

	private String name;

	private String email;

	private Number age;

	private String bloodGroup;

	private Long insuranceId;

	private List<Long> appointmentIds;

}
