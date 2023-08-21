package com.demo.stream;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		//Consumer<Integer> consumer = t -> System.out.println("Data is :" + t );
		//consumer.accept(10);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().forEach(t -> System.out.println("Value is :" + t ));
		
	}
}
