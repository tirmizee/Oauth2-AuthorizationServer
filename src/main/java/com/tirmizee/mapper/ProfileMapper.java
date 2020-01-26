package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.ProfileDTO;
import com.tirmizee.entities.Profile;

@Mapper
public interface ProfileMapper extends GenericMapper<ProfileDTO, Profile> {

	static final ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);
	
}