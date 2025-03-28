package com.bandeira.corts.entitys.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Roles {

	ROLE_ADMIN(0, "ADMIN"), ROLE_USER(1,"USER"), ROLE_COIFFEUR(2, "COIFFEUR");
	
	private Integer id;
	private String name;
	
	public static Roles getRoleById(Integer id) {
		for (Roles role : Roles.values()) {
			if (role.getId().equals(id)) {
				return role;
			}
		}
		return null;
	}
}
