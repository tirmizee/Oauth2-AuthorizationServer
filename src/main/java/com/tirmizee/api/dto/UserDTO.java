package com.tirmizee.api.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class UserDTO {
	
	private long userId;
	private Object accountExpiredDate;
	private Object accountLockedDate;
	private BigDecimal accountNonExpired;
	private BigDecimal accountNonLocked;
	private Object createDate;
	private Object credentialsExpiredDate;
	private BigDecimal credentialsNonExpired;
	private BigDecimal enabled;
	private BigDecimal firstLogin;
	private BigDecimal fkRoleId;
	private BigDecimal maxSession;
	private String password;
	private BigDecimal profileId;
	private Object updateDate;
	private String username;
	
}
