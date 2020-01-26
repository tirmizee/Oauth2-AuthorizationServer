package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the APP_SETTING database table.
 * 
 */
@Data
public class AppSettingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String key;
	private String value;

}