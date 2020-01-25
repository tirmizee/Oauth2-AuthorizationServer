package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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

	private String clientid;

	private Object expiresat;

	private Object lastmodifiedat;

	@Column(name="\"SCOPE\"")
	private String scope;

	private String status;

	private String userid;

}