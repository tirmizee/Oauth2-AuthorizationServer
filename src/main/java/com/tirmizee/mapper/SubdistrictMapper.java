package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.SubdistrictDTO;
import com.tirmizee.entities.Subdistrict;

@Mapper
public interface SubdistrictMapper extends GenericMapper<SubdistrictDTO, Subdistrict> {

	static final SubdistrictMapper INSTANCE = Mappers.getMapper(SubdistrictMapper.class);
	
}