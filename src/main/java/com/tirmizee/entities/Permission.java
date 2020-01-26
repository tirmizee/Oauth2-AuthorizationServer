package com.tirmizee.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * The persistent class for the PERMISSION database table.
 * 
 */
@Data
@Entity
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	
	private static final long serialVersionUID = 1L;

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
	
	@ManyToMany(fetch = FetchType.EAGER,
	    cascade = { CascadeType.PERSIST, CascadeType.MERGE },
	    mappedBy = "permissions")
    private Set<User> users = new HashSet<User>();;

}