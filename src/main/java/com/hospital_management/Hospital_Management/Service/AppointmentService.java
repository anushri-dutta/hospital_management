package com.hospital_management.Hospital_Management.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital_management.Hospital_Management.Entity.Appointment;
import com.hospital_management.Hospital_Management.Entity.Doctor;
import com.hospital_management.Hospital_Management.Entity.Patient;
import com.hospital_management.Hospital_Management.Repository.AppointmentRepo;
import com.hospital_management.Hospital_Management.Repository.DoctorRepo;
import com.hospital_management.Hospital_Management.Repository.PatientRepo;
import com.hospital_management.Hospital_Management.Service.ServiceInterface.AppointmentServiceInterface;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentService implements AppointmentServiceInterface {

    public final AppointmentRepo appointmentRepo;

    public final PatientRepo patientRepo;

    public final DoctorRepo doctorRepo;

    @Override
    public Appointment createAppointment(Appointment appointment, Long patientId, Long doctorId) {

        Patient patient = patientRepo.findById(patientId).orElseThrow(() -> new IllegalArgumentException("Invalid patient ID"));
        Doctor doctor = doctorRepo.findById(doctorId).orElseThrow(() -> new IllegalArgumentException("Invalid doctor ID"));

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);
        doctor.getAppointments().add(appointment);

        return appointmentRepo.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepo.findAll();
    }

    @Override
    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
        Patient patient = patientRepo.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid patient ID"));
        return patient.getAppointments();
    }
}