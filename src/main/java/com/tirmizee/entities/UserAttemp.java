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
 * The persistent class for the USER_ATTEMP database table.
 * 
 */

@Data
@Entity
@Table(name="USER_ATTEMP")
@NamedQuery(name="UserAttemp.findAll", query="SELECT u FROM UserAttemp u")
public class UserAttemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	@Column(name="ACCESS_IP")
	private String accessIp;

	private BigDecimal attemp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFIED")
	private Date lastModified;

}