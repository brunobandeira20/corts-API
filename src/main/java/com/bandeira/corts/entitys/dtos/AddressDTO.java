package com.bandeira.corts.entitys.dtos;

import com.bandeira.corts.entitys.comuns.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

	private Long id;
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;
	private String zipCode;
	
	public AddressDTO(Address address) {
		this.id = address.getId();
		this.street = address.getStreet();
		this.number = address.getNumber();
		this.complement = address.getComplement();
		this.neighborhood = address.getNeighborhood();
		this.city = address.getCity();
		this.state = address.getState();
		this.zipCode = address.getZipCode();
	}

}
