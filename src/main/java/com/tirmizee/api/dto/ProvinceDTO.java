package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;


/**
 * The persistent class for the PROVINCES database table.
 * 
 */
@Data
public class ProvinceDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long provinceId;
	private BigDecimal geoId;
	private String provinceCode;
	private String provinceNameEn;
	private String provinceNameTh;

}