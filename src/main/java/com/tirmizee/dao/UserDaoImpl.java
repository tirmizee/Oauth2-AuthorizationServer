package com.tirmizee.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.tirmizee.api.data.UserData;

@Repository
public class UserDaoImpl implements UserDao {

	public static List<UserData> mockData = Arrays.asList(
		new UserData("pratya","zee_pratya@hotmail.com"),
		new UserData("tirmizee","tirmizee@hotmail.com")
	);
	
	public static Map<String, User> mockuser(){
		HashMap<String, User> users = new HashMap<>();
		users.put("pratya", new User("pratya", "$2a$10$tH6A0S7YfVOfCz/ujfpy/O2SV1oWWdoPcGbLLxhZhRK4VDaxYWboS",new ArrayList<GrantedAuthority>()));
		users.put("tirmizee", new User("tirmizee", "$2a$10$t12EDaO4wKyNuvVC5Ktu1eFwlwlXo4.tTPjBSmfZayRMK8HBcRS3a", new ArrayList<GrantedAuthority>()));
		return users;
	} 
	
	@Override
	public List<UserData> findAll() {
		return mockData;
	}

	@Override
	public User findByUsername(String uid) {
		return mockuser().get(uid);
	}

}
