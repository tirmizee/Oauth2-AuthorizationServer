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
 * The persistent class for the OAUTH_CLIENT_TOKEN database table.
 * 
 */

@Data
@Entity
@Table(name="OAUTH_CLIENT_TOKEN")
@NamedQuery(name="OauthClientToken.findAll", query="SELECT o FROM OauthClientToken o")
public class OauthClientToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUTHENTICATION_ID")
	private String authenticationId;

	@Column(name="CLIENT_ID")
	private String clientId;

	@Lob
	private byte[] token;

	@Column(name="TOKEN_ID")
	private String tokenId;

	@Column(name="USER_NAME")
	private String userName;

}