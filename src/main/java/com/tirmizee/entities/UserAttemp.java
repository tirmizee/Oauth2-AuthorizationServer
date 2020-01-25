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

	@Column(name="LAST_MODIFIED")
	private Object lastModified;

}