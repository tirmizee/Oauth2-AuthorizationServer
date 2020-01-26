package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthClientTokenDTO;
import com.tirmizee.entities.OauthClientToken;

@Mapper
public interface OauthClientTokenMapper extends GenericMapper<OauthClientTokenDTO, OauthClientToken> {
	
	static final OauthClientTokenMapper INSTANCE = Mappers.getMapper(OauthClientTokenMapper.class);
	
}