package com.tirmizee.dao;

import java.util.List;

import com.tirmizee.entities.Permission;

public interface PermissionDao {

	List<Permission> findByUsername(String username);
	
}
