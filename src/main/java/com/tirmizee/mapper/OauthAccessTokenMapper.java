package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthAccessTokenDTO;
import com.tirmizee.entities.OauthAccessToken;

@Mapper
public interface OauthAccessTokenMapper extends GenericMapper<OauthAccessTokenDTO, OauthAccessToken> {

	static final OauthAccessTokenMapper INSTANCE = Mappers.getMapper(OauthAccessTokenMapper.class);
	
}