package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the VILLAGES database table.
 * 
 */
@Data
public class VillageDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subDistrictCode;
	private String villageCode;
	private String villageName;
	private String villageNo;

}