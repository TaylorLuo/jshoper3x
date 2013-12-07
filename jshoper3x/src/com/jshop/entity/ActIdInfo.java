package com.jshop.entity;

// Generated 2013-12-7 17:08:38 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActIdInfo generated by hbm2java
 */
@Entity
@Table(name = "act_id_info", catalog = "jshoper3")
public class ActIdInfo implements java.io.Serializable {

	private String id;
	private Integer rev;
	private String userId;
	private String type;
	private String key;
	private String value;
	private byte[] password;
	private String parentId;

	public ActIdInfo() {
	}

	public ActIdInfo(String id) {
		this.id = id;
	}

	public ActIdInfo(String id, Integer rev, String userId, String type,
			String key, String value, byte[] password, String parentId) {
		this.id = id;
		this.rev = rev;
		this.userId = userId;
		this.type = type;
		this.key = key;
		this.value = value;
		this.password = password;
		this.parentId = parentId;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "USER_ID_", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TYPE_", length = 64)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "KEY_")
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "VALUE_")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "PASSWORD_")
	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	@Column(name = "PARENT_ID_")
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
