package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.GeographyDTO;
import com.tirmizee.entities.Geography;

@Mapper
public interface GeographyMapper extends GenericMapper<GeographyDTO, Geography> {
	
	static final GeographyMapper INSTANCE = Mappers.getMapper(GeographyMapper.class);
	
}