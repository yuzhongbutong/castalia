package com.castalia.apple.dao.demo.entry;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.castalia.core.base.entry.BaseEntry;

@Entity
@Table(name = "demo")
public class DemoEO extends BaseEntry {
	
	private String userName;
	private String password;
	
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
