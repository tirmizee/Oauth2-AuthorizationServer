package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.VillageDTO;
import com.tirmizee.entities.Village;

@Mapper
public interface VillageMapper extends GenericMapper<VillageDTO, Village> {

	static final VillageMapper INSTANCE = Mappers.getMapper(VillageMapper.class);
	
}