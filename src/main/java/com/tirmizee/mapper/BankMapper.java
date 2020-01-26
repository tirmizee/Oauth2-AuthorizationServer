package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.BankDTO;
import com.tirmizee.entities.Bank;

@Mapper
public interface BankMapper extends GenericMapper<BankDTO, Bank> {

	static final BankMapper INSTANCE = Mappers.getMapper(BankMapper.class);
	
}