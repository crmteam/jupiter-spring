package com.apps.jupiter.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.UserRepository;
import com.apps.jupiter.entities.User;

@Service
@Transactional
public class UserBusinessImpl implements UserBusiness {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(String id) {

		return userRepository.save(findUser(id));
	}

	@Override
	public User findUser(String id) {
		return userRepository.findOne(id);
	}

	@Override
	public void deleteUser(String id) {
		userRepository.delete(id);
	}

	@Override
	public List<User> getUserByRole() {
		return null;
	}

	@Override
	public List<User> getActivedUsers() {
		return null;
	}

	@Override
	public User getCurrentUser() {
		
		String userame = printUser();
		User u = userRepository.findOne(userame);
		return u;
	}


	// return the loged user id=username
	@Override
	public String printUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		System.out.println(name);
		return name;

	}

}
