package com.spring.crud.dao;

import java.util.List;

import com.spring.crud.bean.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();

	public void addEmployee(Employee employee);

	public List<Employee> getEmployeess();
}
