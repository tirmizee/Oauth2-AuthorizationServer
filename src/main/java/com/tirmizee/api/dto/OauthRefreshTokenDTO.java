package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the OAUTH_REFRESH_TOKEN database table.
 * 
 */
@Data
public class OauthRefreshTokenDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte[] authentication;
	private byte[] token;
	private String tokenId;

}