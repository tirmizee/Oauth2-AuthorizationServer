package com.tirmizee.api.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BANK_BRANCH database table.
 * 
 */
@Entity
@Table(name="BANK_BRANCH")
@NamedQuery(name="BankBranch.findAll", query="SELECT b FROM BankBranch b")
public class BankBranch implements Serializable {
	private static final long serialVersionUID = 1L;
	private long branchId;
	private String bankCode;
	private String branchCode;
	private String branchName;
	private String branchNameEn;
	private Object createdDate;
	private String isBankBranch;
	private Object updatedDate;

	public BankBranch() {
	}


	@Id
	@Column(name="BRANCH_ID", unique=true, nullable=false, precision=38)
	public long getBranchId() {
		return this.branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}


	@Column(name="BANK_CODE", length=50)
	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}


	@Column(name="BRANCH_CODE", length=50)
	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	@Column(name="BRANCH_NAME", length=200)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	@Column(name="BRANCH_NAME_EN", length=200)
	public String getBranchNameEn() {
		return this.branchNameEn;
	}

	public void setBranchNameEn(String branchNameEn) {
		this.branchNameEn = branchNameEn;
	}


	@Column(name="CREATED_DATE")
	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}


	@Column(name="IS_BANK_BRANCH", length=1)
	public String getIsBankBranch() {
		return this.isBankBranch;
	}

	public void setIsBankBranch(String isBankBranch) {
		this.isBankBranch = isBankBranch;
	}


	@Column(name="UPDATED_DATE")
	public Object getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Object updatedDate) {
		this.updatedDate = updatedDate;
	}

}