package com.castalia.core.base.entry;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntry {

	private Date createDate;

	private String createUser;

	private Date updateDate;

	private String updateUser;

	private short deleteFlag;

	public Date getCreateDate() {
		if (createDate == null) {
			createDate = new Date();
		}
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		if (createDate == null) {
			this.createDate = new Date();
		} else {
			this.createDate = createDate;
		}
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		updateDate = new Date();
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = new Date();
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public short getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(short deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
