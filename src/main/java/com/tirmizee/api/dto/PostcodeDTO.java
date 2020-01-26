package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the POSTCODE database table.
 * 
 */
@Data
public class PostcodeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long postCodeId;
	private String subDistrictCode;
	private String zipcode;

}