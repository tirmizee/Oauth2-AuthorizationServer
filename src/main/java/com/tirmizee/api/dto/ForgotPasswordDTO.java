package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ForgotPasswordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String accessIp;
	private Date createDate;
	private String email;
	private Date expiredDate;
	private BigDecimal isReset;
	private String token;
	private Date updateDate;
	private BigDecimal userid;
}