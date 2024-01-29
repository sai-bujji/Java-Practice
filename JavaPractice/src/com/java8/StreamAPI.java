package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Product {
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

class Empe {

	String name;
	int age;
	int salary;
	String designationa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignationa() {
		return designationa;
	}

	public void setDesignationa(String designationa) {
		this.designationa = designationa;
	}

	public Empe(String name, int age, int salary, String designationa) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designationa = designationa;
	}

	@Override
	public String toString() {
		return "Empe [name=" + name + ", age=" + age + ", salary=" + salary + ", designationa=" + designationa + "]";
	}

}

public class StreamAPI {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "ASUS Laptop", 80000f));

		// Ex 1
		List<Float> pricegreater = productsList.stream().filter(p -> p.price > 30000).map(p -> p.price)
				.collect(Collectors.toList());
		Map<String, Float> ma = productsList.stream().filter(p -> p.price > 30000).map(p -> p)
				.collect(Collectors.toMap(Product::getName, Product::getPrice));
		System.out.println(pricegreater);
		System.out.println(ma);

		// Ex 2
		productsList.stream().filter(p -> p.price == 30000).forEach(p -> System.out.println(p.name));

		// Ex 3
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		List<Empe> list = new ArrayList<Empe>();

		list.add(new Empe("saia", 30, 30000, "SSE"));
		list.add(new Empe("saib", 32, 50000, "SE"));
		list.add(new Empe("saic", 33, 60000, "SE"));
		list.add(new Empe("said", 34, 70000, "SSE"));
		list.add(new Empe("saib", 28, 80000, "SE"));
		list.add(new Empe("saie", 22, 30000, "TL"));
		list.add(new Empe("saia", 33, 50000, "TL"));

		// For each
		System.out.println("===============printing for each=========");
		list.forEach(a -> System.out.println(a));

		// Sorting by name
		System.out.println("==============Sorting==================");
		list.sort((a, b) -> a.getName().compareTo(b.getName()));
		Collections.sort(list, Comparator.comparing(Empe::getName).thenComparing(Empe::getAge));
		list.forEach(a -> System.out.println(a));

		// Grouping
		System.out.println("==========grouping====================");

		Map<String, List<Empe>> map = list.stream().collect(Collectors.groupingBy(Empe::getDesignationa));
		Map<String, Map<Integer, List<Empe>>> map1 = list.stream()
				.collect(Collectors.groupingBy(Empe::getDesignationa, Collectors.groupingBy(Empe::getSalary)));
		System.out.println(map);
		System.out.println(map1);

		// String count

		String s = "aaabbbccdddeegggfft";
		Map<Object, Long> repeat = Arrays.asList(s.split("")).stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		System.out.println("Duplicate count" + repeat);
		
		String name = list.stream().filter(a -> a.getName().contains("saia")).findFirst().map(a-> a.getName()).get();
		Empe name1 = list.stream().filter(a -> a.getName().contains("saib")).findAny().orElse(null);
		System.out.println("name========"+ name);
		System.out.println("name========"+ name1.getName());
		
		List<Empe> emps = list.stream().filter(a-> a.getDesignationa().equalsIgnoreCase("TL")).collect(Collectors.toList());
		System.out.println(emps);
		
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("a", 1);
		unsortMap.put("j", 2);
		unsortMap.put("h", 3);
		unsortMap.put("g", 4);
		unsortMap.put("f", 5);
		unsortMap.put("d", 6);
		unsortMap.put("aw", 1);
		unsortMap.put("qq", 4);
		
		unsortMap.forEach((a,b)-> System.out.println("Key   "+a+"  value   "+b));
		
		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
		Map<String, Integer> resul = new LinkedHashMap<String, Integer>();
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x-> resul.put(x.getKey(), x.getValue()));
		System.out.println(result);
		System.out.println(resul);
		for(Entry<String, Integer> entry: resul.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		
		//Palindrome
		String temp="madam";
		boolean palindrome = IntStream.range(0, temp.length()/2).noneMatch(a-> temp.charAt(a)!= temp.charAt(temp.length()-a-1));
		System.out.println("palindrome        :"+ palindrome);
		
		String str= "aabbccdeeff";
		List<String> stt = Arrays.asList(str.split(""));
		Set<String> duplicate = stt.stream().filter(a -> Collections.frequency( stt , a)>1).collect(Collectors.toSet());
		Map<Object, Long> duplicateMap = stt.stream().filter(a -> Collections.frequency( stt , a)>1).collect(Collectors.groupingBy(a ->a, Collectors.counting()));
		System.out.println("=duplicate char="+ duplicate);
		System.out.println("=duplicate char="+ duplicateMap);
		
		String indesex = IntStream.range(0, stt.size()).filter(a -> "b".equalsIgnoreCase(stt.get(a))).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println("==indesex===="+ indesex);
		
		Integer i[] = {1,2,3,4,5,6,7,8};
		Integer ii =Arrays.asList(i).stream().collect(Collectors.summingInt(Integer::valueOf));
		
		System.out.println("=======suming===="+ii);
		

		// new Sorting
		// Collections.sort(li, (p1,p2)->{return p1.compareTo(p2);});

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

		// Fore removing the duplicates
		// List<Integer> listWithoutDuplicates =
		// numbersList.stream().distinct().collect(Collectors.toList());

		/*
		 * Map<String, Map<String, List<Employee>>> multipleFieldsMapList =
		 * employeesList.stream() .collect(
		 * Collectors.groupingBy(Employee::getDesignation,
		 * Collectors.groupingBy(Employee::getGender)));
		 */

	}

}
