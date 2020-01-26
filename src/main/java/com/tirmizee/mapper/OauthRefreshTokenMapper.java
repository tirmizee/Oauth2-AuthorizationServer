package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthRefreshTokenDTO;
import com.tirmizee.entities.OauthRefreshToken;

@Mapper
public interface OauthRefreshTokenMapper extends GenericMapper<OauthRefreshTokenDTO, OauthRefreshToken> {

	static final OauthRefreshTokenMapper INSTANCE = Mappers.getMapper(OauthRefreshTokenMapper.class);
	
}