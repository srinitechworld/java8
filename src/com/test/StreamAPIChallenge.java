package com.test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPIChallenge {

	public static void main(String[] args) {
		new StreamAPIChallenge().challenge1();
	}
	
	public void challenge1() {
		List<Integer> myList = new Random().ints(0,1000)
				.limit(20).boxed().collect(Collectors.toList());
		System.out.println(myList);
		
		myList.stream().filter(n -> n%2 != 0).forEach(i -> System.out.println(i));
	}
}
