package com.demo.stream;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 10;
		System.out.println("Default Value : " + supplier.get());
		
		List<Integer> list = new Random().ints(1, 100).limit(0).boxed().collect(Collectors.toList());
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}
}
