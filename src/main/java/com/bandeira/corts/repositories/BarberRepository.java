package com.bandeira.corts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bandeira.corts.entitys.Barber;

public interface BarberRepository  extends JpaRepository<Barber, Integer> {

}
