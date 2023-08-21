package com.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StreamSortByMap {

	
	public static Map<Integer, Employee> getEmployee() {
		Map<Integer, Employee> empMap = new TreeMap<>();
		empMap.put(104, new Employee(1, "Raja", "IT", 6000));
		empMap.put(103, new Employee(2, "Shekar", "IT", 9000));
		empMap.put(106, new Employee(3, "Vimal", "IT", 7000));
		empMap.put(110, new Employee(4, "Vicky", "IT", 3000));
		empMap.put(100, new Employee(5, "Anand", "IT", 8000));
		return empMap;
		
	}
	
	public static void filter1() {
		getEmployee().entrySet().stream()
		.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
	
	public static void filter2() {
		getEmployee().entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		filter2();
	}
}
