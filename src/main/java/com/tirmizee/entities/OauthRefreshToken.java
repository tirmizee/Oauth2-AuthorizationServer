package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the OAUTH_REFRESH_TOKEN database table.
 * 
 */

@Data
@Entity
@Table(name="OAUTH_REFRESH_TOKEN")
@NamedQuery(name="OauthRefreshToken.findAll", query="SELECT o FROM OauthRefreshToken o")
public class OauthRefreshToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private byte[] authentication;

	@Lob
	private byte[] token;

	@Column(name="TOKEN_ID")
	private String tokenId;

}