package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.ProvinceDTO;
import com.tirmizee.entities.Province;

@Mapper
public interface ProvinceMapper extends GenericMapper<ProvinceDTO, Province> {

	static final ProvinceMapper INSTANCE = Mappers.getMapper(ProvinceMapper.class);
	
}