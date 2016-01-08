package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Group;

public interface GroupBusiness {
	

	public Group saveUser(Group g);

	public List<Group> getAllGroups();

	public Group updateGroup(Long id);

	public Group findGroup(Long id);

	public void deleteGroup(Long id);

	public List<Group> getGroupByRole();

	public List<Group> getGroupsByUser();

}
