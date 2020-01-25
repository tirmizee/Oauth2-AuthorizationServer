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
 * The persistent class for the FORGOT_PASSWORD database table.
 * 
 */

@Data
@Entity
@Table(name="FORGOT_PASSWORD")
@NamedQuery(name="ForgotPassword.findAll", query="SELECT f FROM ForgotPassword f")
public class ForgotPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="ACCESS_IP")
	private String accessIp;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String email;

	@Column(name="EXPIRED_DATE")
	private Object expiredDate;

	@Column(name="IS_RESET")
	private BigDecimal isReset;

	private String token;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	private BigDecimal userid;

}