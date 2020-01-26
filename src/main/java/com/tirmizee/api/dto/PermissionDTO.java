package com.tirmizee.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;


/**
 * The persistent class for the PERMISSION database table.
 * 
 */
@Data
public class PermissionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long perId;
	private String createBy;
	private Date createDate;
	private String perCode;
	private String perName;
	private String updateBy;
	private Date updateDate;
	private List<RoleMapPermissionDTO> roleMapPermissions;

}