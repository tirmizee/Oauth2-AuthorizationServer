package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the LOG_PASSWORD database table.
 * 
 */
@Data
public class LogPasswordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long logId;
	private Object createDate;
	private String password;
	private String username;

}