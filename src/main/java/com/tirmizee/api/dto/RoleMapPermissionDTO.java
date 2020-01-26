package com.tirmizee.api.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


/**
 * The persistent class for the ROLE_MAP_PERMISSION database table.
 * 
 */
@Data
public class RoleMapPermissionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date createDate;
	private PermissionDTO permission;
	private RoleDTO role;

}