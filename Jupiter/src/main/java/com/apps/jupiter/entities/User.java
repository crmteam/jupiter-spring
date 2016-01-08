package com.apps.jupiter.entities;

/**
 * @author tocka
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String password;

	private boolean actived;

	@ManyToMany
	@JoinTable(name = "USER_ROLES")
	private Collection<Role> roles;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<Activity> activities;

	@ManyToMany
	@JoinColumn(name = "USER_GROUPS")
	private Collection<Group> groups;

	@ManyToOne
	@JoinColumn(name = "USER_UNIVER")
	private Univer univer;

	public User() {
		super();
	}

	public User(String username, String password, boolean actived) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}
	
	@JsonIgnore
	public Collection<Role> getRoles() {
		return roles;
	}

	@JsonSetter
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@JsonIgnore
	public Collection<Activity> getActivities() {
		return activities;
	}

	@JsonSetter
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@JsonIgnore
	public Collection<Group> getGroups() {
		return groups;
	}

	@JsonSetter
	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	public Univer getUniver() {
		return univer;
	}

	public void setUniver(Univer univer) {
		this.univer = univer;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public void setActivities(Collection<Activity> activities) {
		this.activities = activities;
	}

}
