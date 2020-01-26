package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;;


/**
 * The persistent class for the CLIENTDETAILS database table.
 * 
 */
@Data
public class ClientdetailDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String appid;
	private BigDecimal accessTokenValidity;
	private String additionalinformation;
	private String appsecret;
	private String authorities;
	private String autoapprovescopes;
	private String granttypes;
	private String redirecturl;
	private BigDecimal refreshTokenValidity;
	private String resourceids;
	private String scope;
}