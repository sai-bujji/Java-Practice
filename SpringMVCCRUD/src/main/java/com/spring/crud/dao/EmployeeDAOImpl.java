package com.spring.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.crud.bean.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final Logger logger = Logger.getLogger(EmployeeDAOImpl.class);
	
	@Autowired
	SessionFactory sessionFactory;
	
	static List<Employee> employeeMap = getEmployeess();
	
	public EmployeeDAOImpl() {
		super();
		logger.info("------------entered in EmployeedaoImpl class construter----------");
		
		if(employeeMap == null) {
			
			employeeMap = new ArrayList<Employee>();
			
			employeeMap.add(new Employee(1,"SAI", "sai.sai","Ghantasala", "1111"));
			employeeMap.add(new Employee(2, "Madhu", "madhu.madhu","Ghantasala", "1122"));
			employeeMap.add(new Employee(3, "Nageswara Rao", "rao.rao","Ghantasala", "1133"));
			employeeMap.add(new Employee(4, "Sailaja", "sailu.sailu","Ghantasala", "1144"));
			
		}
	
	}

	public List<Employee> getAllEmployees() {
		logger.info("===========enterd in EmployeeDAOImpl class getAllEmployees method============");
		return employeeMap;
	}
	
	public static List<Employee> getEmployeess(){
		return employeeMap;
		
	}
	
	public void addEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction txt=session.beginTransaction();
		session.save(employee);
		txt.commit();
		session.close();
    }

}
