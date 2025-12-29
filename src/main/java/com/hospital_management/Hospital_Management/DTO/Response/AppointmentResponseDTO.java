package com.hospital_management.Hospital_Management.DTO.Response;

import java.time.LocalDateTime;

import com.hospital_management.Hospital_Management.enums.AppointmentStaus;

import lombok.Data;

@Data
public class AppointmentResponseDTO {

	private Long id;

	private LocalDateTime appointmentTime;

	private String reason;

	private AppointmentStaus status;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	private Long patientId;

	private Long doctorId;

}
