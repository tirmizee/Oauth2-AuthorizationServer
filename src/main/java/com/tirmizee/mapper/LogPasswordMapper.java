package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.LogPasswordDTO;
import com.tirmizee.entities.LogPassword;

@Mapper
public interface LogPasswordMapper extends GenericMapper<LogPasswordDTO, LogPassword> {

	static final LogPasswordMapper INSTANCE = Mappers.getMapper(LogPasswordMapper.class);
	
}