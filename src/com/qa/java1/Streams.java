package com.qa.java1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) { 
		
		List<String> names = Arrays.asList("Micheal", "Dean", "James", "Chris"); 
				names.stream()
				.filter(str -> !str.contains("James"))
	
				.forEach(x -> System.out.println("Hello " + x));
				
				names.addAll(4, l)
		
	}

}
