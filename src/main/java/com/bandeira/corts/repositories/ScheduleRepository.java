package com.bandeira.corts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bandeira.corts.entitys.Schedule;

public interface ScheduleRepository  extends JpaRepository<Schedule, Integer> {

}
