package com.hospital_management.Hospital_Management.DTO.Request;

import java.util.List;

import lombok.Data;

@Data
public class DepartmentRequestDTO {

	private String name;

	private Long headDoctorId;

	private List<Long> doctorIds;

}
