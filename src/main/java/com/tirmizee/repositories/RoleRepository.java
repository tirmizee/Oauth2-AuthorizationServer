package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
