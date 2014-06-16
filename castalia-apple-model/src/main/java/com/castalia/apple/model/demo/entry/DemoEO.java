package com.castalia.apple.model.demo.entry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.castalia.core.base.entry.BaseEntry;

@Entity
@Table(name = "tbl_demo")
public class DemoEO extends BaseEntry {
	
	private long id;
	private String userName;
	private String password;
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
