package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OptCustomer {
	private int id;
	private String name;
	private String emailAdd;
	private List<String> contact;

	public OptCustomer(int id, String name, String emailAdd, List<String> contact) {
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

public class OptionalDemo {

	
	public static void main(String[] args) throws Throwable {
		
		OptCustomer customer = new OptCustomer(1, "Srini", null, Arrays.asList("123456", "234567"));
		
		Optional<String> emailOpt = Optional.ofNullable(customer.getEmailAdd());
		System.out.println(emailOpt.orElse("else@taas.com"));
		System.out.println(emailOpt.orElseGet(() -> "elseSupplier@taas.com"));
		//System.out.println(emailOpt.orElseThrow());
		//System.out.println(emailOpt.orElseThrow(() -> new Exception("No Value in the object")));
		
		System.out.println(emailOpt.map(String::toUpperCase).orElse("test@taas.com"));
		
		System.out.println(getCustomer("test"));
	}
	
	
	public static Customer getCustomer(String email) {
		return MapFlatMapDemo.getData().stream()
		.filter(c -> c.getEmailAdd().equals(email)).findAny().get();
	}
}
