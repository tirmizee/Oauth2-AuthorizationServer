package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.RoleDTO;
import com.tirmizee.entities.Role;

@Mapper
public interface RoleMapper extends GenericMapper<RoleDTO, Role> {

	static final RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
	
}