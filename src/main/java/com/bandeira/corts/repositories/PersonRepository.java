package com.bandeira.corts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bandeira.corts.entitys.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer> {

}
