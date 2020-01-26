package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;


/**
 * The persistent class for the OAUTH_CLIENT_DETAILS database table.
 * 
 */
@Data
public class OauthClientDetailDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String clientId;
	private BigDecimal accessTokenValidity;
	private String additionalInformation;
	private String authorities;
	private String authorizedGrantTypes;
	private String autoapprove;
	private String clientSecret;
	private BigDecimal refreshTokenValidity;
	private String resourceIds;
	private String scope;
	private String webServerRedirectUri;

}