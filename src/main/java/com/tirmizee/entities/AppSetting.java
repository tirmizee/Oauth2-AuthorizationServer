package com.tirmizee.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the APP_SETTING database table.
 * 
 */

@Data
@Entity
@Table(name="APP_SETTING")
@NamedQuery(name="AppSetting.findAll", query="SELECT a FROM AppSetting a")
public class AppSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"KEY\"")
	private String key;

	@Column(name="\"VALUE\"")
	private String value;

}