package com.willmin.springboot.service;

import java.util.List;

import com.willmin.springboot.model.User;


public interface UserService {
	public List<User> getAllUser();
	public List<User> getAllByXml();
	//public User getUserById(String id);
	
}
