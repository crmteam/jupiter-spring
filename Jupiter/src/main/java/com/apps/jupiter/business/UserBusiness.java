package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.User;


public interface UserBusiness {

	public User saveUser(User u);

	public List<User> getAllUsers();

	public User updateUser(String id);

	public User findUser(String id);

	public void deleteUser(String id);

	public List<User> getUserByRole();

	public List<User> getActivedUsers();
	
	public User getCurrentUser();
	
	public String printUser();


}
