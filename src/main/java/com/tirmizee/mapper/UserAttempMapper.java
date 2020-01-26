package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.UserAttempDTO;
import com.tirmizee.entities.UserAttemp;

@Mapper
public interface UserAttempMapper extends GenericMapper<UserAttempDTO, UserAttemp> {

	static final UserAttempMapper INSTANCE = Mappers.getMapper(UserAttempMapper.class);
	
}