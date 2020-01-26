package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the OAUTH_APPROVALS database table.
 * 
 */
@Data
public class OauthApprovalDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String clientid;
	private Object expiresat;
	private Object lastmodifiedat;
	private String scope;
	private String status;
	private String userid;

}