package com.hospital_management.Hospital_Management.DTO.Response;

import java.util.List;

import lombok.Data;

@Data
public class DoctorResponseDTO {

	private Long id;

	private String name;

	private String specialization;

	private String email;

	private List<Long> appointmentIds;

	private List<Long> departmentIds;

}
