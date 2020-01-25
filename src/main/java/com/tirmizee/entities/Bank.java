package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;


/**
 * The persistent class for the BANK database table.
 * 
 */

@Data
@Entity
@NamedQuery(name="Bank.findAll", query="SELECT b FROM Bank b")
public class Bank implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BANK_ID")
	private long bankId;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BANK_DESC")
	private String bankDesc;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

}