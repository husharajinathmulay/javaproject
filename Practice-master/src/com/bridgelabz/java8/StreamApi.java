package com.bridgelabz.java8;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(79);

		ArrayList<Integer> list1 = (ArrayList<Integer>) list.stream().map(e -> e + 5).collect(Collectors.toList());
		System.out.println(list1);

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Rajesh", 2001, "Active", 10001));
		empList.add(new Employee(102, "Vilas", 2001, "Active", 100002));
		// empList.add(new Employee(103,"Shubham",2002,"NoN-Active",100003));
		empList.add(new Employee(104, "Deepak", 2002, "NoN-Active", 100004));
		empList.add(new Employee(105, "Vikas", 2001, "Active", 100005));
		empList.add(new Employee(106, "Saurabh", 2002, "NoN-Active", 10006));

		// TO PRINT EMPLOYEE BASE ON DEPARTMENT
		Map<Integer, List<Employee>> newEployeeList = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId, Collectors.toList()));

		newEployeeList.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + "" + entry.getValue());
		}

		);

		// TO COUNT DEPARTMENT EMPLOYEE

		Map<Integer, Long> departmetEployeeList = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId, Collectors.counting()));
		departmetEployeeList.entrySet().forEach(entry -> {
			System.out.println("deparment id =>" + entry.getKey() + "deparmnet count =>" + entry.getValue());
		});
		;

		// TO COUNT ACTIVE EMPLOYEE

		long activeEmployee = empList.stream().filter(e -> "Active".equals(e.getStatus())).count();

		empList.stream().filter(e -> "Active".equals(e.getStatus())).collect(Collectors.toList());
		System.out.println("activeEmployee =>" + activeEmployee);

		// Optional<Employee> maxSalEmployee =
		// empList.stream().max(Comparator.comparing(Employee::getSalary));

		Integer employee = empList.stream().collect(Collectors.summingInt(Employee::getSalary));

		System.out.println(" max salary ---->> " + employee);

		List<Integer> list2 = empList.stream().map(e -> e.getSalary()).collect(Collectors.toList());

		System.out.println("list2------->> " + list2.toString());
		
		
	List<Integer> employee3=	empList.stream().map(e->e.getSalary() + 1000).collect(Collectors.toList());

	Addition addition = (a,b)->{return a+b;};
	
	
	System.out.println( "output -->> "+ addition.add(12, 11));
	
	}
	
	
	

}
