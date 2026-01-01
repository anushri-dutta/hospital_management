package com.hospital_management.Hospital_Management.Service.ServiceInterface;

import java.util.List;

import com.hospital_management.Hospital_Management.Entity.Appointment;

public interface AppointmentServiceInterface {
    public Appointment createAppointment(Appointment appointment, Long patientId, Long doctorId);
    public List<Appointment> getAllAppointment();
}
