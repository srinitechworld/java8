package com.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StreamAPIDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		map.forEach((key, value) -> System.out.println(key + " - " + value));
		
		map.entrySet().stream().forEach(i -> System.out.println(i));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		List<String> list = new ArrayList<>();
		list.add("College");
		list.add("Sun");
		list.add("Romeo");
		list.add("India");
		list.add("Staff");
		
		list.stream().filter(i -> i.startsWith("S")).forEach(t -> System.out.println(t));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		map.entrySet().stream().filter(v -> v.getValue() %2 == 0).forEach(t -> System.out.println(t));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		map.entrySet().stream().filter(k -> k.getKey().equals("c")).forEach(t -> System.out.println(t));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
	}
}
