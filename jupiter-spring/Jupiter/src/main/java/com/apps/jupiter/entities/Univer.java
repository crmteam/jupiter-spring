package com.apps.jupiter.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author tocka
 */

@Entity
@Table(name = "UNIVERS")
public class Univer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String name;
	private String description;

	@OneToMany(mappedBy = "univer", fetch = FetchType.LAZY)
	private Collection<Group> groups;

	@OneToMany(mappedBy = "univer", fetch = FetchType.LAZY)
	private Collection<User> users;

	public Univer() {
		super();
	}

	public Univer(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public Collection<Group> getGroups() {
		return groups;
	}

	@JsonSetter
	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	@JsonIgnore
	public Collection<User> getUsers() {
		return users;
	}

	@JsonSetter
	public void setUsers(Collection<User> users) {
		this.users = users;
	}

}
