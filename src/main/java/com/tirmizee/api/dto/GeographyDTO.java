package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the GEOGRAPHY database table.
 * 
 */
@Data
public class GeographyDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long geoId;
	private String geoNameEn;
	private String geoNameTh;

}