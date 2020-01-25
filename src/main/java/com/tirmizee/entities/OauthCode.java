package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the OAUTH_CODE database table.
 * 
 */

@Data
@Entity
@Table(name="OAUTH_CODE")
@NamedQuery(name="OauthCode.findAll", query="SELECT o FROM OauthCode o")
public class OauthCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private byte[] authentication;

	@Id
	private String code;

}