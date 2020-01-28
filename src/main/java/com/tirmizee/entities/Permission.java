package com.tirmizee.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the PERMISSION database table.
 * 
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERMISSION", schema = "C##ORGANIZATION")
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission {
	
	@Id
	@Column(name="PER_ID")
	private long perId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="PER_CODE")
	private String perCode;

	@Column(name="PER_NAME")
	private String perName;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	/*
	 * @ManyToMany(fetch = FetchType.EAGER, mappedBy = "permissions") private
	 * Set<User> users = new HashSet<User>();;
	 */

}