package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
