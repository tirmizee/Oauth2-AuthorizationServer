package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the SUBDISTRICTS database table.
 * 
 */
@Data
@Entity
@Table(name="SUBDISTRICTS")
@NamedQuery(name="Subdistrict.findAll", query="SELECT s FROM Subdistrict s")
public class Subdistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUBDISTRICT_ID")
	private long subdistrictId;

	@Column(name="DISTRICT_CODE")
	private String districtCode;

	@Column(name="SUBDISTRICT_CODE")
	private String subdistrictCode;

	@Column(name="SUBDISTRICT_NAME_EN")
	private String subdistrictNameEn;

	@Column(name="SUBDISTRICT_NAME_TH")
	private String subdistrictNameTh;

}