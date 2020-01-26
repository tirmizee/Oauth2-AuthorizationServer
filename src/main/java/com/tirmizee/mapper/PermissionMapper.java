package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.PermissionDTO;
import com.tirmizee.entities.Permission;

@Mapper
public interface PermissionMapper extends GenericMapper<PermissionDTO, Permission> {

	static final PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);
	
}