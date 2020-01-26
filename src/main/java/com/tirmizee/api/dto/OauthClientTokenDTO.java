package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the OAUTH_CLIENT_TOKEN database table.
 * 
 */
@Data
public class OauthClientTokenDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String authenticationId;
	private String clientId;
	private byte[] token;
	private String tokenId;
	private String userName;

}