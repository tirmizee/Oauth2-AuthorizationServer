package com.tirmizee.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRED_DATE")
	private Date expiredDate;

	@Column(name="IS_RESET")
	private BigDecimal isReset;

	private String token;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	private BigDecimal userid;

}