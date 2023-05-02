package com.bridgelabz.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface DoubleColon {
	void show();
}

class PQR {
	public void display() {
		System.out.println(" Helllo....... Scope resolution operator method called ......");
	}

	public static void print() {

		System.out.println("helllo .......your satatic method called successfully by scop resolution operator.....");
	}
}

public class LambdaBasics {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.addAll(

				Arrays.asList(new Employee(1, "Milind", 101, "inActive", 100000),
						new Employee(2, "Rahul", 102, "inActive", 200000),
						new Employee(3, "Rajat", 103, "active", 300000),
						new Employee(4, "Amol", 104, "inActive", 400000),
						new Employee(5, "Kalpesh", 105, "active", 400000)
						
				));
		// sort element by Traditional Approach

		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		});

		System.out.println("sorted list--> " + employeeList);

//  // sort element by Lambda Expression      ---------------------- ----------------(1)
//		
// 		Collections.sort(employeeList,(Employee o1, Employee o2)  -> o1.getEmpName().compareTo(o2.getEmpName()));
// 		
// 		System.out.println("sorted list by lambda--> "+ employeeList);

		// sort element by Lambda Expression
		// -------------------------------------------(2)

		Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));

		System.out.println("sorted list by lambda--> " + employeeList);

		DoubleColon d = new PQR()::display; // display is non-static method

		d.show();

		d = PQR::print; /// print is static method

		d.show();

		// Print employee name contains letter R or Any other letter ....using predicate
		// interface

		Predicate<Employee> p = x -> x.getEmpName().contains("R");
		System.out.println("employee name containts R letter ...... ");
		for (Employee employee : employeeList) {

			if (p.test(employee)) {
				System.out.println(employee);
			}
		}

		// Print employee name contains letter R or Any other letter ..........using
		// stream api
		System.out.println("-------------------------------------------------------");

		List<Employee> list2 = employeeList.stream().filter(e -> e.getEmpName().contains("R"))
				.collect(Collectors.toList());

		System.out.println("by using stream API");
		System.out.println(list2);
		System.out.println("-------------------------------------------------------");

		// IntStream class

		IntStream.range(2, 11).forEach(x -> System.out.println(x));
		System.out.println("-------------------------------------------------------");

		// way -2
		IntStream.range(2, 11).forEach(System.out::println);

		System.out.println("-------------------------------------------------------");
		IntStream num = IntStream.iterate(1, x -> x + 1);

		num.limit(5).forEach(System.out::println);

		System.out.println("-------------------------------------------------------");

		System.out.println("Random Values");

		Stream.generate(Math::random).limit(2).forEach(System.out::println);

		System.out.println("-------------------------------------------------------");

		System.out.println("toMap() test");

		Map<Integer, String> toMapList = employeeList.stream()
				.collect(Collectors.toMap(Employee::getDepId, Employee::getEmpName));

		System.out.println("toMapList --->" + toMapList);

		System.out.println("-------------------------------------------------------");

		System.out.println("toSet() test");
		System.out.println("toSetList ----->>"+employeeList.stream().collect(Collectors.toSet()));

		System.out.println("-------------------------------------------------------");

		System.out.println("Compute if absent");
	
		
		Map<String , List<Integer>> map2 =new HashMap<>();
		

		
		employeeList.stream().forEach( e ->{
			
			map2.computeIfAbsent(e.getEmpName(), x -> new ArrayList<Integer>()).add(e.getSalary());
				
			
		});
		 
		System.out.println(map2);
	

	}

}
