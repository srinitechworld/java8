package com.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEmployeeData {

	
	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Raja", "IT", 6000));
		list.add(new Employee(2, "Shekar", "IT", 9000));
		list.add(new Employee(3, "Vimal", "IT", 7000));
		list.add(new Employee(4, "Vicky", "IT", 3000));
		list.add(new Employee(5, "Anand", "IT", 8000));
		return list;
	}
	
	public static List<Employee> filter1() {
		return getEmployee().stream().filter(e -> e.getSalary() > 4000).collect(Collectors.toList());
	}
	
	public static List<Employee> filter2() {
		return getEmployee().stream().sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
	}
	
	public static List<Employee> filter3() {
		return getEmployee().stream().sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())).collect(Collectors.toList());
	}
	
	public static List<Employee> filter4() {
		return getEmployee().stream().sorted((e1,e2) -> Integer.compare(e1.getId(), e2.getId())).collect(Collectors.toList());
	}
	
	public static List<Employee> filter5() {
		return getEmployee().stream().sorted(Comparator.comparing(e -> e.getSalary())).collect(Collectors.toList());
	}
	
	public static List<Employee> filter6() {
		return getEmployee().stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(filter6());
	}
}
