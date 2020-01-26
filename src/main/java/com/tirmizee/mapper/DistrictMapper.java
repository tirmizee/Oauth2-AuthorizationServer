package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.DistrictDTO;
import com.tirmizee.entities.District;

@Mapper
public interface DistrictMapper extends GenericMapper<DistrictDTO, District> {
	
	static final DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

}