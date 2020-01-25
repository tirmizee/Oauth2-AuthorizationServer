package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the OAUTH_ACCESS_TOKEN database table.
 * 
 */
@Data
@Entity
@Table(name="OAUTH_ACCESS_TOKEN")
@NamedQuery(name="OauthAccessToken.findAll", query="SELECT o FROM OauthAccessToken o")
public class OauthAccessToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUTHENTICATION_ID")
	private String authenticationId;

	@Lob
	private byte[] authentication;

	@Column(name="CLIENT_ID")
	private String clientId;

	@Column(name="REFRESH_TOKEN")
	private String refreshToken;

	@Lob
	private byte[] token;

	@Column(name="TOKEN_ID")
	private String tokenId;

	@Column(name="USER_NAME")
	private String userName;

}