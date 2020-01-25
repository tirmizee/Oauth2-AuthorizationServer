package com.tirmizee.entities;

import java.io.Serializable;
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
 * The persistent class for the LOG_PASSWORD database table.
 * 
 */
@Data
@Entity
@Table(name="LOG_PASSWORD")
@NamedQuery(name="LogPassword.findAll", query="SELECT l FROM LogPassword l")
public class LogPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOG_ID")
	private long logId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private String password;

	private String username;

}