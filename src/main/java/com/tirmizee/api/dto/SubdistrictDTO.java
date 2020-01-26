package com.tirmizee.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the SUBDISTRICTS database table.
 * 
 */
@Data
public class SubdistrictDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long subdistrictId;
	private String districtCode;
	private String subdistrictCode;
	private String subdistrictNameEn;
	private String subdistrictNameTh;

	public SubdistrictDTO() {
	}


	@Id
	@Column(name="SUBDISTRICT_ID", unique=true, nullable=false, precision=38)
	public long getSubdistrictId() {
		return this.subdistrictId;
	}

	public void setSubdistrictId(long subdistrictId) {
		this.subdistrictId = subdistrictId;
	}


	@Column(name="DISTRICT_CODE", length=10)
	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}


	@Column(name="SUBDISTRICT_CODE", length=10)
	public String getSubdistrictCode() {
		return this.subdistrictCode;
	}

	public void setSubdistrictCode(String subdistrictCode) {
		this.subdistrictCode = subdistrictCode;
	}


	@Column(name="SUBDISTRICT_NAME_EN", length=200)
	public String getSubdistrictNameEn() {
		return this.subdistrictNameEn;
	}

	public void setSubdistrictNameEn(String subdistrictNameEn) {
		this.subdistrictNameEn = subdistrictNameEn;
	}


	@Column(name="SUBDISTRICT_NAME_TH", length=200)
	public String getSubdistrictNameTh() {
		return this.subdistrictNameTh;
	}

	public void setSubdistrictNameTh(String subdistrictNameTh) {
		this.subdistrictNameTh = subdistrictNameTh;
	}

}