package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.AppSettingDTO;
import com.tirmizee.entities.AppSetting;

@Mapper
public interface AppSettingMapper extends GenericMapper<AppSettingDTO, AppSetting> {
	
	static final AppSettingMapper INSTANCE = Mappers.getMapper(AppSettingMapper.class);

}