package com.apps.jupiter.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.GroupRepository;
import com.apps.jupiter.entities.Group;

@Service
@Transactional
public class GroupBusinessImpl implements GroupBusiness {
	
	@Autowired
	private GroupRepository groupRepository;

	@Override
	public Group saveUser(Group g) {
		return groupRepository.save(g);
	}

	@Override
	public List<Group> getAllGroups() {
		return groupRepository.findAll();
	}

	@Override
	public Group updateGroup(Long id) {
		Group g  = findGroup(id);
		return groupRepository.save(g);
	}

	@Override
	public Group findGroup(Long id) {
		return groupRepository.findOne(id);
	}

	@Override
	public void deleteGroup(Long id) {
		groupRepository.delete(id);
	}

	@Override
	public List<Group> getGroupByRole() {
		return null;
	}

	@Override
	public List<Group> getGroupsByUser() {
		return null;
	}

}
