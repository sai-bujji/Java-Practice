package com.spring.crud.bean;

public class Employee {

	
	String empName;
	String empID;
	
	Employee(){
		super();
	}
	Employee(String empName, String empID){
		
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + "]";
	}
	
}
