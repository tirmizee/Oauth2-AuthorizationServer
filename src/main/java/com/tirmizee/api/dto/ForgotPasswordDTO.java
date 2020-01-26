package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class ForgotPasswordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String accessIp;
	private Object createDate;
	private String email;
	private Object expiredDate;
	private BigDecimal isReset;
	private String token;
	private Object updateDate;
	private BigDecimal userid;
}