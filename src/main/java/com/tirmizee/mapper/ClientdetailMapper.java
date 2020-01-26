package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.ClientdetailDTO;
import com.tirmizee.entities.Clientdetail;

@Mapper
public interface ClientdetailMapper extends GenericMapper<ClientdetailDTO, Clientdetail> {
	
	static final ClientdetailMapper INSTANCE = Mappers.getMapper(ClientdetailMapper.class);
	
}