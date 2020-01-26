package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the BANK database table.
 * 
 */

@Data
public class BankDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long bankId;
	private String bankCode;
	private String bankDesc;
	private String bankName;
	private Object createDate;
	private Object updateDate;

}