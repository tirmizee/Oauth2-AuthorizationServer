package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the SUBDISTRICTS database table.
 * 
 */
@Data
public class SubdistrictDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long subdistrictId;
	private String districtCode;
	private String subdistrictCode;
	private String subdistrictNameEn;
	private String subdistrictNameTh;

}