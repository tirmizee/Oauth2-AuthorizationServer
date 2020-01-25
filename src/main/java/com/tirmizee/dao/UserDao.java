package com.tirmizee.dao;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.tirmizee.api.data.UserData;

public interface UserDao {
	
	List<UserData> findAll();
	
	User findByUsername(String uid);

}
