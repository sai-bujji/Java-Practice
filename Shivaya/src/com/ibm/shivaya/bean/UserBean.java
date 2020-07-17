package com.ibm.shivaya.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {

	@NotEmpty
	public String userName;
	@NotEmpty
	public String password;
	
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
