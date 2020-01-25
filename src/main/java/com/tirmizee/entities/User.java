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
 * The persistent class for the USERS database table.
 * 
 */

@Data
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private long userId;

	@Column(name="ACCOUNT_EXPIRED_DATE")
	private Object accountExpiredDate;

	@Column(name="ACCOUNT_LOCKED_DATE")
	private Object accountLockedDate;

	@Column(name="ACCOUNT_NON_EXPIRED")
	private BigDecimal accountNonExpired;

	@Column(name="ACCOUNT_NON_LOCKED")
	private BigDecimal accountNonLocked;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREDENTIALS_EXPIRED_DATE")
	private Object credentialsExpiredDate;

	@Column(name="CREDENTIALS_NON_EXPIRED")
	private BigDecimal credentialsNonExpired;

	private BigDecimal enabled;

	@Column(name="FIRST_LOGIN")
	private BigDecimal firstLogin;

	@Column(name="FK_ROLE_ID")
	private BigDecimal fkRoleId;

	@Column(name="MAX_SESSION")
	private BigDecimal maxSession;

	private String password;

	@Column(name="PROFILE_ID")
	private BigDecimal profileId;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	private String username;

}