package com.hospital_management.Hospital_Management.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_management.Hospital_Management.Entity.Appointment;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.AppointmentServiceInterface;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/appointments")
@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentServiceInterface appointmentServiceInterface;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment, @RequestParam Long patientId, @RequestParam Long doctorId) {
        return appointmentServiceInterface.createAppointment(appointment, patientId, doctorId);
    }

    @GetMapping
    public List<Appointment> getAllAppointment() {
        return appointmentServiceInterface.getAllAppointment();
    }

}
