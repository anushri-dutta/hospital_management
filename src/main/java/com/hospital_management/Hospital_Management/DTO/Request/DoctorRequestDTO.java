package com.hospital_management.Hospital_Management.DTO.Request;

import java.util.List;

import lombok.Data;

@Data
public class DoctorRequestDTO {

	private String name;

	private String specialization;

	private String email;

	private List<Long> departmentIds;

}
