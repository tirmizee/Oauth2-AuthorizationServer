package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the DISTRICTS database table.
 * 
 */
@Data
@Entity
@Table(name="DISTRICTS")
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DISTRICT_ID")
	private long districtId;

	@Column(name="DISTRICT_CODE")
	private String districtCode;

	@Column(name="DISTRICT_NAME_EN")
	private String districtNameEn;

	@Column(name="DISTRICT_NAME_TH")
	private String districtNameTh;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

}