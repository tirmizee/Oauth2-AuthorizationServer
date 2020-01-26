package com.tirmizee.api.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	
	private long userId;
	private Date accountExpiredDate;
	private Date accountLockedDate;
	private BigDecimal accountNonExpired;
	private BigDecimal accountNonLocked;
	private Date createDate;
	private Date credentialsExpiredDate;
	private BigDecimal credentialsNonExpired;
	private BigDecimal enabled;
	private BigDecimal firstLogin;
	private BigDecimal fkRoleId;
	private BigDecimal maxSession;
	private String password;
	private BigDecimal profileId;
	private Date updateDate;
	private String username;
	
}
