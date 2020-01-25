package com.tirmizee.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the ROLE_MAP_PERMISSION database table.
 * 
 */

@Data
@Entity
@Table(name="ROLE_MAP_PERMISSION")
@NamedQuery(name="RoleMapPermission.findAll", query="SELECT r FROM RoleMapPermission r")
public class RoleMapPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="PER_ID")
	private BigDecimal perId;

	@Column(name="ROLE_ID")
	private BigDecimal roleId;

}