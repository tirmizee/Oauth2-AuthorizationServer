package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthCodeDTO;
import com.tirmizee.entities.OauthCode;

@Mapper
public interface OauthCodeMapper extends GenericMapper<OauthCodeDTO, OauthCode> {

	static final OauthCodeMapper INSTANCE = Mappers.getMapper(OauthCodeMapper.class);
	
}