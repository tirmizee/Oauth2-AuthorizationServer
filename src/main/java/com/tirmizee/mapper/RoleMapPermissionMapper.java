package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.RoleMapPermissionDTO;
import com.tirmizee.entities.RoleMapPermission;

@Mapper
public interface RoleMapPermissionMapper extends GenericMapper<RoleMapPermissionDTO, RoleMapPermission> {

	static final RoleMapPermissionMapper INSTANCE = Mappers.getMapper(RoleMapPermissionMapper.class);
	
}