package com.spring.crud.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "EMP_TBL")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3581434085568057973L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	
	@NotEmpty
	@Column
	String name;
	
	@NotEmpty
	@Column
	String email;
	
	@NotEmpty
	@Column
	String address;
	
	@NotEmpty
	@Column
	String telephone;
	
	public Employee(){
		super();
	}
	
	
	public Employee(int id, String name, String email, String address, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", telephone="
				+ telephone + "]";
	}

	
}
