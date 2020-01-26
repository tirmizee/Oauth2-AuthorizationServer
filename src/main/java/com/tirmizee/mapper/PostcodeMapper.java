package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.PostcodeDTO;
import com.tirmizee.entities.Postcode;

@Mapper
public interface PostcodeMapper extends GenericMapper<PostcodeDTO, Postcode> {

	static final PostcodeMapper INSTANCE = Mappers.getMapper(PostcodeMapper.class);
	
}