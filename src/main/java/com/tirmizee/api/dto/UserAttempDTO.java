package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
	private Date lastModified;

}