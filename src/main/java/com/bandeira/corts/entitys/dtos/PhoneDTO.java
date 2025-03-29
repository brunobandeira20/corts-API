
package com.bandeira.corts.entitys.dtos;

import java.util.List;

import com.bandeira.corts.entitys.comuns.Phone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {
	private Long id;
	private String number;
	
	public static List<PhoneDTO> convertList(List<Phone> phones) {
		return phones.stream().map( x -> new PhoneDTO(x.getId(), x.getNumber())).toList();
	}
}
