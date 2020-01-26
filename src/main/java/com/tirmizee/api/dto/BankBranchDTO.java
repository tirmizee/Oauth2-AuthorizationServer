package com.tirmizee.api.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BankBranchDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private long branchId;
	private String bankCode;
	private String branchCode;
	private String branchName;
	private String branchNameEn;
	private Date createdDate;
	private String isBankBranch;
	private Date updatedDate;

}