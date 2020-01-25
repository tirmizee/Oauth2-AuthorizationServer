package com.tirmizee.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.RoleMapPermission;

public interface RoleMapPermissionRepository extends JpaRepository<RoleMapPermission, BigDecimal>{

}
