package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OptObjCustomer {
	private int id;
	private String name;
	private String emailAdd;
	private List<String> contact;

	public OptObjCustomer(int id, String name, String emailAdd, List<String> contact) {
		super();
		this.id = id;
		this.name = name;
		this.emailAdd = emailAdd;
		this.contact = contact;
	}
	
	public OptObjCustomer() {
		
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

public class OptionalObjDemo {

	public static List<OptObjCustomer> getData() {
		List<OptObjCustomer> customers = new ArrayList<>();
		customers.add(new OptObjCustomer(1, "Raja", "raja@taas.com", Arrays.asList("123456","234567")));
		customers.add(new OptObjCustomer(2, "Karhik", "karthik@taas.com", Arrays.asList("345678","456789")));
		customers.add(new OptObjCustomer(3, "Aswin", "aswin@taas.com", Arrays.asList("567890","678901")));
		customers.add(new OptObjCustomer(4, "Baskar", "baskar@taas.com", Arrays.asList("789012")));
		customers.add(new OptObjCustomer(5, "Madhan", "madhan@taas.com", Arrays.asList("123456","890123")));
		return customers;
	}
	
	public static OptObjCustomer getCustomer(String emailAdd) {
		//System.out.println(getData());
		return getData().stream().filter(c -> emailAdd.equals(c.getEmailAdd()))
		.findFirst().orElse(new OptObjCustomer());
	}
	
	public static void main(String[] args) {
		System.out.println(getCustomer("raja@taas.com"));
	}
	
}
