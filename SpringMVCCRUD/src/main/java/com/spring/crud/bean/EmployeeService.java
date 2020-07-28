package com.spring.crud.bean;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	static HashMap<Integer, Employee> employeeMap = getEmployeess();
	
	public EmployeeService() {
		super();
		if(employeeMap == null) {
			
			employeeMap = new HashMap<Integer, Employee>();
			
			employeeMap.put(1, new Employee("SAI", "1111"));
			employeeMap.put(2, new Employee("Madhu", "1122"));
			employeeMap.put(3, new Employee("Nageswara Rao", "1133"));
			employeeMap.put(4, new Employee("Sailaja", "1144"));
			
		}
	}
	
	
	public static HashMap<Integer, Employee> getEmployeess(){
		return employeeMap;
		
	}
}
