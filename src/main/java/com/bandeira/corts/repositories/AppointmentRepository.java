package com.bandeira.corts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bandeira.corts.entitys.Appointment;

public interface AppointmentRepository  extends JpaRepository<Appointment, Integer> {

}
