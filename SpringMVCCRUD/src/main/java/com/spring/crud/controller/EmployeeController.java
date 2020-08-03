package com.spring.crud.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.crud.Service.EmployeeService;
import com.spring.crud.bean.Employee;

@Controller
public class EmployeeController {

	private static final Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		logger.info("-----------------entered in controller class listEmployee method---------------");
		List<Employee> listEmployee = employeeService.getAllEmployees();
		logger.info("====listEmployee====:" + listEmployee);
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		logger.info("-----------------exit in controller class listEmployee method---------------");
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}
	
	@RequestMapping(value="/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(ModelAndView model,@Valid @ModelAttribute Employee employee, BindingResult br) {
		if(br.hasErrors()) {
			model.addObject("employee", employee);
			model.setViewName("EmployeeForm");
		}
		return model;
	}
}
