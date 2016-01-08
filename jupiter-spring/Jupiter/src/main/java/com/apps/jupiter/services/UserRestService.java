package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.UserBusiness;
import com.apps.jupiter.entities.User;

@RestController
public class UserRestService {
	
	@Autowired
	private UserBusiness userBusiness;

	@Secured(value = { "ROLE_ADMIN", "ROLE_MANAGER" })
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public User saveUser(@RequestBody User u) {
		return userBusiness.saveUser(u);
	}

	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userBusiness.getAllUsers();
	}

	@Secured(value = { "ROLE_ADMIN", "ROLE_MANAGER" })
	public User updateUser(String id) {
		return userBusiness.updateUser(id);
	}

	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User findUser(@PathVariable String id) {
		return userBusiness.findUser(id);
	}

	@Secured(value = { "ROLE_ADMIN" })
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
		userBusiness.deleteUser(id);
	}

	@RequestMapping(value="/usersByRole", method=RequestMethod.GET)
	public List<User> getUserByRole() {
		return userBusiness.getUserByRole();
	}

	@RequestMapping(value="/activedUsers", method=RequestMethod.GET)
	public List<User> getActivedUsers() {
		return userBusiness.getActivedUsers();
	}

	@RequestMapping(value="/currentUser", method=RequestMethod.GET)
	public User getCurrentUser() {
		return userBusiness.getCurrentUser();
	}

	@RequestMapping(value="/username", method=RequestMethod.GET)
	public String printUser() {
		return userBusiness.printUser();
	}

}
