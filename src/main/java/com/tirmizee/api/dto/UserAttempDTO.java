package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;


/**
 * The persistent class for the USER_ATTEMP database table.
 * 
 */
@Data
public class UserAttempDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String accessIp;
	private BigDecimal attemp;
	private Object lastModified;

	public UserAttempDTO() {
	}


	@Id
	@Column(unique=true, nullable=false, length=50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	@Column(name="ACCESS_IP", length=50)
	public String getAccessIp() {
		return this.accessIp;
	}

	public void setAccessIp(String accessIp) {
		this.accessIp = accessIp;
	}


	@Column(precision=38)
	public BigDecimal getAttemp() {
		return this.attemp;
	}

	public void setAttemp(BigDecimal attemp) {
		this.attemp = attemp;
	}


	@Column(name="LAST_MODIFIED")
	public Object getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Object lastModified) {
		this.lastModified = lastModified;
	}

}