package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the OAUTH_ACCESS_TOKEN database table.
 * 
 */
@Data
public class OauthAccessTokenDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String authenticationId;
	private byte[] authentication;
	private String clientId;
	private String refreshToken;
	private byte[] token;
	private String tokenId;
	private String userName;

}