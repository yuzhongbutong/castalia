package com.castalia.core.base.entry;

import java.util.Date;

public class BaseEntry {

	public long id;

	public Date createDate;

	public String createUser;

	public Date updateDate;

	public String updateUser;

	public short deleteFlag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
