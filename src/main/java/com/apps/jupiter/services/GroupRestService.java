package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.GroupBusiness;
import com.apps.jupiter.entities.Group;

@RestController
public class GroupRestService {
	
	@Autowired
	private GroupBusiness groupBusiness;
	
	@Secured(value = { "ROLE_ADMIN"})
	@RequestMapping(value="/groups", method=RequestMethod.POST)
	public Group saveUser(@RequestBody Group g) {
		return groupBusiness.saveUser(g);
	}

	@RequestMapping(value="/groups", method=RequestMethod.GET)
	public List<Group> getAllGroups() {
		return groupBusiness.getAllGroups();
	}
	
	@Secured(value = { "ROLE_ADMIN"})
	@RequestMapping(value="/groups/{id}", method=RequestMethod.PUT)
	public Group updateGroup(@PathVariable Long id) {
		return groupBusiness.updateGroup(id);
	}


	@RequestMapping(value="/groups/{id}", method=RequestMethod.GET)
	public Group findGroup(@PathVariable Long id) {
		return groupBusiness.findGroup(id);
	}

	@Secured(value = { "ROLE_ADMIN"})
	@RequestMapping(value="/groups/{id}", method=RequestMethod.DELETE)
	public void deleteGroup(@PathVariable Long id) {
		groupBusiness.deleteGroup(id);
	}

	public List<Group> getGroupByRole() {
		return groupBusiness.getGroupByRole();
	}

	public List<Group> getGroupsByUser() {
		return groupBusiness.getGroupsByUser();
	}
	

}
