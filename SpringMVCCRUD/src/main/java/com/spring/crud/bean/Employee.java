package com.spring.crud.bean;

public class Employee {

	
	String name;
	String email;
	String address;
	String telephone;
	
	Employee(){
		super();
	}
	
	
	public Employee(String name, String email, String address, String telephone) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", telephone=" + telephone
				+ "]";
	}
	
	
	
}
