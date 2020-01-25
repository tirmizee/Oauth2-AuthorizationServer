package com.tirmizee.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the PROVINCES database table.
 * 
 */

@Data
@Entity
@Table(name="PROVINCES")
@NamedQuery(name="Province.findAll", query="SELECT p FROM Province p")
public class Province implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROVINCE_ID")
	private long provinceId;

	@Column(name="GEO_ID")
	private BigDecimal geoId;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	@Column(name="PROVINCE_NAME_EN")
	private String provinceNameEn;

	@Column(name="PROVINCE_NAME_TH")
	private String provinceNameTh;

}