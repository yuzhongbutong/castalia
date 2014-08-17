package com.castalia.apple.model.demo.entry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.castalia.core.base.entry.BaseEntry;

@Entity
@Table(name = "tbl_demo")
@SequenceGenerator(name = "seq_name", sequenceName = "seq_demo_id", allocationSize = 1, initialValue = 1)
public class DemoEO extends BaseEntry {
	
	private long demoId;
	private String userName;
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_name")
	public long getDemoId() {
		return demoId;
	}
	public void setDemoId(long demoId) {
		this.demoId = demoId;
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
