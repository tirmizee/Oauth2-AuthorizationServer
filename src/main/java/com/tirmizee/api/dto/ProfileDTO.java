package com.tirmizee.api.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * The persistent class for the "PROFILE" database table.
 * 
 */
@Data
public class ProfileDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long profileId;
	private String branchCode;
	private String citizenId;
	private Object createDate;
	private String email;
	private String firstName;
	private String lastName;
	private byte[] profileByte;
	private String profileImage;
	private String subDistrictCode;
	private String tel;
	private Object updateDate;

}