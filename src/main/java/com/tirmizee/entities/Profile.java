package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the "PROFILE" database table.
 * 
 */
@Data
@Entity
@Table(name="\"PROFILE\"")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROFILE_ID")
	private long profileId;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CITIZEN_ID")
	private String citizenId;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Lob
	@Column(name="PROFILE_BYTE")
	private byte[] profileByte;

	@Column(name="PROFILE_IMAGE")
	private String profileImage;

	@Column(name="SUB_DISTRICT_CODE")
	private String subDistrictCode;

	private String tel;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

}