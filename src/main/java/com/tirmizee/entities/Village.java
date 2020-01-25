package com.tirmizee.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the VILLAGES database table.
 * 
 */

@Data
@Entity
@Table(name="VILLAGES")
@NamedQuery(name="Village.findAll", query="SELECT v FROM Village v")
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="SUB_DISTRICT_CODE")
	private String subDistrictCode;

	@Column(name="VILLAGE_CODE")
	private String villageCode;

	@Column(name="VILLAGE_NAME")
	private String villageName;

	@Column(name="VILLAGE_NO")
	private String villageNo;

}