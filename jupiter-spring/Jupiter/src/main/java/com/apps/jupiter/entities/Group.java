package com.apps.jupiter.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author tocka
 */
@Entity
@Table(name = "GROUPS")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	private String descripion;

	@ManyToMany
	private Collection<User> users;

	@ManyToMany
	@JoinTable(name = "GROUP_ROLES")
	private Collection<Role> roles;

	@ManyToOne
	@JoinColumn(name = "GROUP_UNIVER")
	private Univer univer;

	public Group() {
		super();
	}

	public Group(String name, String descripion) {
		super();
		this.name = name;
		this.descripion = descripion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	@JsonIgnore
	public Collection<User> getUsers() {
		return users;
	}

	@JsonSetter
	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	@JsonIgnore
	public Collection<Role> getRoles() {
		return roles;
	}

	@JsonSetter
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Univer getUniver() {
		return univer;
	}

	public void setUniver(Univer univer) {
		this.univer = univer;
	}

}
