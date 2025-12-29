package com.hospital_management.Hospital_Management.DTO.Response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class DepartmentResponseDTO {

	private Long id;

	private String name;

	private LocalDateTime createdAt;

	private Long headDoctorId;

	private List<Long> doctorIds;

}
