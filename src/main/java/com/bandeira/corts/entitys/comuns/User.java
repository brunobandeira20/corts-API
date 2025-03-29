package com.bandeira.corts.entitys.comuns;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.bandeira.corts.entitys.enums.Roles;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    
    @ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "ROLES")
    private Set<Integer> roles = new HashSet<>() ;
    
	public void addRole(Roles role) {
        this.roles.add(role.getId());
    }
	
	public Set<Roles> getRoles() {
		return roles.stream().map(x -> Roles.getRoleById(x)).collect(Collectors.toSet());
	}
}