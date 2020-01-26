package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the DISTRICTS database table.
 * 
 */
@Data
public class DistrictDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long districtId;
	private String districtCode;
	private String districtNameEn;
	private String districtNameTh;
	private String provinceCode;
}