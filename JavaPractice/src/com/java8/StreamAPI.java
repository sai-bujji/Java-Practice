package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
    
    
}  

public class StreamAPI {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"ASUS Laptop",80000f)); 
        
        //Ex 1
        List<Float> pricegreater = productsList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
        Map<String, String> ma = productsList.stream().filter(p->p.price>30000).map(p->p).collect(Collectors.toMap(Product::getName, Product::getName));
        System.out.println(pricegreater);
        
        //Ex 2
        productsList.stream().filter(p->p.price==30000).forEach(p->System.out.println(p.name));
        
        //Ex 3
        Stream.iterate(1, element->element+1).filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println); 
        
      //new Sorting
      		//Collections.sort(li, (p1,p2)->{return p1.compareTo(p2);});
      				
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
      		
        //Fore removing the duplicates
        //List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
      		

      		/*
      		 * Map<String, Map<String, List<Employee>>> multipleFieldsMapList =
      		 * employeesList.stream() .collect(
      		 * Collectors.groupingBy(Employee::getDesignation,
      		 * Collectors.groupingBy(Employee::getGender)));
      		 */
      		
        
	}

}
