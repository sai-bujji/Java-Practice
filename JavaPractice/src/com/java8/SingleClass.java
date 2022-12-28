package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	String name;
	Integer salary;
	String design;
	public Employee(String name, Integer salary, String design) {
		this.name = name;
		this.salary = salary;
		this.design = design;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", design=" + design + "]";
	}
	
}
public class SingleClass {
	public static void main(String arr[]) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("sai", 50000, "TL"));
		empList.add(new Employee("madhu", 40000, "TEST"));
		empList.add(new Employee("hishika", 60000, "SE"));
		empList.add(new Employee("siva", 70000, "TL"));
		empList.add(new Employee("sai", 50000, "SSE"));
		
		//Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparing(Employee::getDesign));
		Map<String, List<Employee>> empDesig = empList.stream().collect(Collectors.groupingBy(Employee::getDesign));
		empDesig.forEach((k,v)-> System.out.println("Design: "+k+" EMP: "+v));
		
		Collections.sort(empList, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getDesign));
		empList.forEach(n-> System.out.println(n));
		
		List<String> li = new ArrayList<String>();
		li.add("sai");
		li.add("sai");
		li.add("siva");
		li.add("mahesh");
		li.add("madhu");
		li.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println(li);
		
		Boolean find = li.stream().filter(n -> "sai".equalsIgnoreCase(n)).count()>0;
		Long count = li.stream().filter(n -> "sai".equalsIgnoreCase(n)).count();
		System.out.println("Find: "+find+"   Count:"+count);
		
		
		String str = "aabbsssdddff";
		String[] st = str.split("");
		Map<String, Long> result = Arrays.stream(st).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		result.forEach((k,v)-> System.out.println("Key:"+k+"  Value:"+v));
		
	}
}
