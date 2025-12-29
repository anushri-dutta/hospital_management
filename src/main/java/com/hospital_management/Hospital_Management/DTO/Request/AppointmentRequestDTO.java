package com.hospital_management.Hospital_Management.DTO.Request;

import java.time.LocalDateTime;

import com.hospital_management.Hospital_Management.enums.AppointmentStaus;

import lombok.Data;

@Data
public class AppointmentRequestDTO {

	private LocalDateTime appointmentTime;

	private String reason;

	private AppointmentStaus status;

	private Long patientId;

	private Long doctorId;

}
