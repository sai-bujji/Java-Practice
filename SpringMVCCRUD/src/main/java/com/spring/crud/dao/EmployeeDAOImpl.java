package com.spring.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.crud.bean.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final Logger logger = Logger.getLogger(EmployeeDAOImpl.class);
	
	static List<Employee> employeeMap = getEmployeess();
	
	public EmployeeDAOImpl() {
		super();
		logger.info("------------entered in EmployeedaoImpl class construter----------");
		
		if(employeeMap == null) {
			
			employeeMap = new ArrayList<Employee>();
			
			employeeMap.add(new Employee("SAI", "sai.sai","Ghantasala", "1111"));
			employeeMap.add(new Employee("Madhu", "madhu.madhu","Ghantasala", "1122"));
			employeeMap.add(new Employee("Nageswara Rao", "rao.rao","Ghantasala", "1133"));
			employeeMap.add(new Employee("Sailaja", "sailu.sailu","Ghantasala", "1144"));
			
		}
	
	}

	public List<Employee> getAllEmployees() {
		logger.info("===========enterd in EmployeeDAOImpl class getAllEmployees method============");
		return employeeMap;
	}
	
	public static List<Employee> getEmployeess(){
		return employeeMap;
		
	}

}
