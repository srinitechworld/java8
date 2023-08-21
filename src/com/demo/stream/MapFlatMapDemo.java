package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
	private int id;
	private String name;
	private String emailAdd;
	private List<String> contact;

	public Customer(int id, String name, String emailAdd, List<String> contact) {
		super();
		this.id = id;
		this.name = name;
		this.emailAdd = emailAdd;
		this.contact = contact;
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

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public List<String> getContact() {
		return contact;
	}

	public void setContact(List<String> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailAdd=" + emailAdd + ", contact=" + contact + "]";
	}

}

public class MapFlatMapDemo {

	public static List<Customer> getData() {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "Raja", "raja@taas.com", Arrays.asList("123456","234567")));
		customers.add(new Customer(2, "Karhik", "karthik@taas.com", Arrays.asList("345678","456789")));
		customers.add(new Customer(3, "Aswin", "aswin@taas.com", Arrays.asList("567890","678901")));
		customers.add(new Customer(4, "Baskar", "baskar@taas.com", Arrays.asList("789012")));
		customers.add(new Customer(5, "Madhan", "madhan@taas.com", Arrays.asList("123456","890123")));
		return customers;
	}
	
	public static void main(String[] args) {
		List<String> emailAdd = getData().stream().map(c -> c.getEmailAdd()).collect(Collectors.toList());
		System.out.println(emailAdd);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		emailAdd = getData().stream().map(Customer::getName).sorted().collect(Collectors.toList());
		System.out.println(emailAdd);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<List<String>> data = getData().stream().map(c -> c.getContact()).collect(Collectors.toList());
		System.out.println(data);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<String> flatData = getData().stream().flatMap(c -> c.getContact().stream()).collect(Collectors.toList());
		System.out.println(flatData);
	}
}
