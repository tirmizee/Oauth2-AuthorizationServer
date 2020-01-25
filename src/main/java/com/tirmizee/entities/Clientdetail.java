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
 * The persistent class for the CLIENTDETAILS database table.
 * 
 */
@Data
@Entity
@Table(name="CLIENTDETAILS")
@NamedQuery(name="Clientdetail.findAll", query="SELECT c FROM Clientdetail c")
public class Clientdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String appid;

	@Column(name="ACCESS_TOKEN_VALIDITY")
	private BigDecimal accessTokenValidity;

	private String additionalinformation;

	private String appsecret;

	private String authorities;

	private String autoapprovescopes;

	private String granttypes;

	private String redirecturl;

	@Column(name="REFRESH_TOKEN_VALIDITY")
	private BigDecimal refreshTokenValidity;

	private String resourceids;

	@Column(name="\"SCOPE\"")
	private String scope;

}