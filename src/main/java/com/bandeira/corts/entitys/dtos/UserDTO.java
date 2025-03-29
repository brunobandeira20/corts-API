
package com.bandeira.corts.entitys.dtos;

import java.util.Set;

import com.bandeira.corts.entitys.comuns.User;
import com.bandeira.corts.entitys.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	private Long id;
	private String username;
	private Set<Roles> roles;
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.roles = user.getRoles();
	}
}
