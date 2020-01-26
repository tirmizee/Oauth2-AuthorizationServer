package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.OauthApprovalDTO;
import com.tirmizee.entities.OauthApproval;

@Mapper
public interface OauthApprovalMapper extends GenericMapper<OauthApprovalDTO, OauthApproval> {

	static final OauthApprovalMapper INSTANCE = Mappers.getMapper(OauthApprovalMapper.class);
	
}