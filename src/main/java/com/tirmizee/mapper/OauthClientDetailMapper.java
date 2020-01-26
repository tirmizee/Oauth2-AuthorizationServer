package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthClientDetailDTO;
import com.tirmizee.entities.OauthClientDetail;

@Mapper
public interface OauthClientDetailMapper extends GenericMapper<OauthClientDetailDTO, OauthClientDetail> {

	static final OauthClientDetailMapper INSTANCE = Mappers.getMapper(OauthClientDetailMapper.class);
	
}