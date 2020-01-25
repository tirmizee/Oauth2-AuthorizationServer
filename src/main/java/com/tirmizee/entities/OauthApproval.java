package com.tirmizee.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the OAUTH_APPROVALS database table.
 * 
 */

@Data
@Entity
@Table(name="OAUTH_APPROVALS")
@NamedQuery(name="OauthApproval.findAll", query="SELECT o FROM OauthApproval o")
public class OauthApproval implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String clientid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date expiresat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastmodifiedat;

	@Column(name="\"SCOPE\"")
	private String scope;

	private String status;

	private String userid;

}