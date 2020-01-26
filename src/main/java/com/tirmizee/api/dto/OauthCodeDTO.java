package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the OAUTH_CODE database table.
 * 
 */
@Data
public class OauthCodeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte[] authentication;
	private String code;

}