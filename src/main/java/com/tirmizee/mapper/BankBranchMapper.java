package com.tirmizee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tirmizee.api.dto.BankBranchDTO;
import com.tirmizee.entities.BankBranch;

@Mapper
public interface BankBranchMapper extends GenericMapper<BankBranchDTO, BankBranch> {
	
	static final BankBranchMapper INSTANCE = Mappers.getMapper(BankBranchMapper.class);

}