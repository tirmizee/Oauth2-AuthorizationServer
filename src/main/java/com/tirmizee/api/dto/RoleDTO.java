package com.tirmizee.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;


/**
 * The persistent class for the "ROLE" database table.
 * 
 */
@Data
public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long roleId;
	private Date createDate;
	private String roleCode;
	private String roleDesc;
	private String roleName;
	private String updateBy;
	private Date updateDate;
	private List<RoleMapPermissionDTO> roleMapPermissions;

}