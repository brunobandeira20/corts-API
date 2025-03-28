package com.bandeira.corts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bandeira.corts.entitys.Client;

public interface ClientRepository  extends JpaRepository<Client, Integer> {

}
