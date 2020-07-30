package com.spring.crud.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.bean.Employee;
import com.spring.crud.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	private static final Logger logger = Logger.getLogger(EmployeeService.class);
	
	@Autowired
	EmployeeDAO employeeDao;

	
	public List<Employee> getAllEmployees() {
		logger.info("-------enterd in EmployeeService class  getAllEmployees method------------");
        return employeeDao.getAllEmployees();
    }
}
