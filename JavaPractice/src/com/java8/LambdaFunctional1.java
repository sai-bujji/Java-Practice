package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface TestInt{
	void display();
}

public class LambdaFunctional1 {
	
	public static void forEachExample() {
		List<String> li = new ArrayList<>();
		li.add("Hishika");
		li.add("Sai");
		li.add("Madhuri"); 
		
		//new Sorting
		Collections.sort(li, (p1,p2)->{return p1.compareTo(p2);});
				
		/*
		 * //Old sorting Collections.sort(li, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * } });
		 */
		
		/*
		 * Collections.sort(persons, Comparator.comparing(Person::getFname)
		 * .thenComparingInt(Person::getAge));
		 */
		
		
		

		/*
		 * Map<String, Map<String, List<Employee>>> multipleFieldsMapList =
		 * employeesList.stream() .collect(
		 * Collectors.groupingBy(Employee::getDesignation,
		 * Collectors.groupingBy(Employee::getGender)));
		 */
		
		
		
		li.forEach(System.out::println);
	}
	
	public static void functionaEx() {
		//New implementation
		TestInt test = ()->{
			System.out.println("haha method reference example using lambada");
		};
		test.display();
	}
	
		public static void main(String[] args) {

			forEachExample();
			functionaEx();
	}

}
