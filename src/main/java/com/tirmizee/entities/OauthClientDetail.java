package com.tirmizee.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the OAUTH_CLIENT_DETAILS database table.
 * 
 */

@Data
@Entity
@Table(name="OAUTH_CLIENT_DETAILS")
@NamedQuery(name="OauthClientDetail.findAll", query="SELECT o FROM OauthClientDetail o")
public class OauthClientDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLIENT_ID")
	private String clientId;

	@Column(name="ACCESS_TOKEN_VALIDITY")
	private BigDecimal accessTokenValidity;

	@Column(name="ADDITIONAL_INFORMATION")
	private String additionalInformation;

	private String authorities;

	@Column(name="AUTHORIZED_GRANT_TYPES")
	private String authorizedGrantTypes;

	private String autoapprove;

	@Column(name="CLIENT_SECRET")
	private String clientSecret;

	@Column(name="REFRESH_TOKEN_VALIDITY")
	private BigDecimal refreshTokenValidity;

	@Column(name="RESOURCE_IDS")
	private String resourceIds;

	@Column(name="\"SCOPE\"")
	private String scope;

	@Column(name="WEB_SERVER_REDIRECT_URI")
	private String webServerRedirectUri;

}