package com.assignment.jforce.dao;

import java.util.List;

import com.assignment.jforce.model.UserBO;

public interface UserDao {
	
	public List getUsers();
	
	public UserBO getUser(String email,String password ,Boolean active);
	
	public UserBO getUser(String email);
	
	public UserBO registerUser(UserBO user);

}
