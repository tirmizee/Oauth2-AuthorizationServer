package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;


/**
 * The persistent class for the GEOGRAPHY database table.
 * 
 */

@Data
@Entity
@NamedQuery(name="Geography.findAll", query="SELECT g FROM Geography g")
public class Geography implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GEO_ID")
	private long geoId;

	@Column(name="GEO_NAME_EN")
	private String geoNameEn;

	@Column(name="GEO_NAME_TH")
	private String geoNameTh;

}