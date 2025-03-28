package com.bandeira.corts.entitys;

import java.time.LocalDateTime;

import com.bandeira.corts.entitys.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private LocalDateTime date;
	
	
	private Status status;
	
	private String observation;
	
	@ManyToOne
	@JoinColumn(name = "barber_id")
	private Barber barber;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	
}
