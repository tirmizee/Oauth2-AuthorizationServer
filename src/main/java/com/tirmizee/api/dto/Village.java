package com.tirmizee.api.dto;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;


/**
 * The persistent class for the VILLAGES database table.
 * 
 */
@Data
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subDistrictCode;
	private String villageCode;
	private String villageName;
	private String villageNo;

	public Village() {
	}


	@Column(name="SUB_DISTRICT_CODE", length=10)
	public String getSubDistrictCode() {
		return this.subDistrictCode;
	}

	public void setSubDistrictCode(String subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
	}


	@Column(name="VILLAGE_CODE", length=10)
	public String getVillageCode() {
		return this.villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}


	@Column(name="VILLAGE_NAME", length=200)
	public String getVillageName() {
		return this.villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}


	@Column(name="VILLAGE_NO", length=10)
	public String getVillageNo() {
		return this.villageNo;
	}

	public void setVillageNo(String villageNo) {
		this.villageNo = villageNo;
	}

}