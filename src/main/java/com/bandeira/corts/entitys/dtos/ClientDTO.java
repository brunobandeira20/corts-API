
package com.bandeira.corts.entitys.dtos;

import java.time.LocalDate;
import java.util.List;

import com.bandeira.corts.entitys.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

	private Integer id;
	private String name;
	private String email;
	private UserDTO user;
	private AddressDTO address;
	private List<PhoneDTO> phones;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate createdAt;
	private List<AppointmentDTO> appointment;
	
	public ClientDTO(Client obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.email = obj.getEmail();
		this.user = new UserDTO(obj.getUser());
		this.address = new AddressDTO(obj.getAddress());
		this.phones = PhoneDTO.convertList(obj.getPhones());
		this.createdAt = obj.getCreatedAt();
		this.appointment = AppointmentDTO.convertList(obj.getAppointment());
	}
}
