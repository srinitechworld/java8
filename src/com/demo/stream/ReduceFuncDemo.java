package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class ReduceFuncDemo {

	public static void main(String[] args) {
		List<Integer> intObj = new Random().ints(1, 100000)
				.limit(1000).boxed()
				.collect(Collectors.toList());
		
		int d = intObj.stream().mapToInt(i -> i).sum();
		System.out.println(d);
		
		d = intObj.stream().reduce((a,b) -> a+b).get();
		System.out.println(d);
		
		d = intObj.stream().reduce((a,b) -> (a>b)?a:b).get();
		System.out.println(d);
		
		
		List<Integer> intObj2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(intObj2.stream()
				.reduce(10,(a,b) -> a+b));
		
		
		double data = getEmployee().stream()
		.filter(e -> e.getDept().equals("IT"))
		.map(Employee::getSalary)
		.mapToDouble(s -> s).max().getAsDouble();
		System.out.println(data);
		
	}
	
	
	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Raja", "IT", 6000));
		list.add(new Employee(2, "Shekar", "IT", 9000));
		list.add(new Employee(3, "Vimal", "BPS", 7000));
		list.add(new Employee(4, "Vicky", "IT", 3000));
		list.add(new Employee(5, "Anand", "BPS", 8000));
		return list;
	}
}
