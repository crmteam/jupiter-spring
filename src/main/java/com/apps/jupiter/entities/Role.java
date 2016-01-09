package com.apps.jupiter.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tocka
 */
@Entity
@Table(name = "ROLES")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String role;
	
	private String desription;

	public Role() {
		super();
	}

	public Role(String role, String desription) {
		super();
		this.role = role;
		this.desription = desription;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

}
