package com.bandeira.corts.entitys;

import java.time.LocalTime;

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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private LocalTime startTime; // Horário de início
    private LocalTime endTime;   // Horário de fim
    
    @ManyToOne
    @JoinColumn(name = "barber_id")
	private Barber barber;
    
	@ManyToOne
	@JoinColumn(name = "salon_id")
	private Salon salon;

}
