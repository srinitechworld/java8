package com.demo.stream;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> {
			if(i%2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		
		System.out.println(predicate.test(7));
		
		List<Integer> list = new Random().ints(1, 100).limit(20).boxed().collect(Collectors.toList());
		list.stream().filter(i -> {
			if(i%2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(t -> System.out.println("Value is : " + t));
		
		list.stream().filter(i -> i%2 == 0).forEach(t -> System.out.println("Data is : " + t));
		
	}
}
