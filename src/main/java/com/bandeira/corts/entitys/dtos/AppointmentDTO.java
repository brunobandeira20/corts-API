
package com.bandeira.corts.entitys.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.bandeira.corts.entitys.Appointment;
import com.bandeira.corts.entitys.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDTO {
	
	private Integer id;
	private LocalDateTime date;
	private Status status;
	private String observation;
	private String barber;
	private String client;
	public static List<AppointmentDTO> convertList(List<Appointment> appointment) {
		return appointment.stream().map(x -> new AppointmentDTO(x.getId(), x.getDate(),
				x.getStatus(),x.getObservation(), 
				x.getBarber().getName(), x.getClient().getName())).toList();
	}
}
