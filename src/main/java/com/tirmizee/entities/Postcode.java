package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;


/**
 * The persistent class for the POSTCODE database table.
 * 
 */
@Data
@Entity
@NamedQuery(name="Postcode.findAll", query="SELECT p FROM Postcode p")
public class Postcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="POST_CODE_ID")
	private long postCodeId;

	@Column(name="SUB_DISTRICT_CODE")
	private String subDistrictCode;

	private String zipcode;

}