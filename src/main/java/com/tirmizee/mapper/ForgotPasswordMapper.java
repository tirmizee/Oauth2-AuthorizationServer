package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.ForgotPasswordDTO;
import com.tirmizee.entities.ForgotPassword;

@Mapper
public interface ForgotPasswordMapper extends GenericMapper<ForgotPasswordDTO, ForgotPassword> {
	
	static final ForgotPasswordMapper INSTANCE = Mappers.getMapper(ForgotPasswordMapper.class);

}