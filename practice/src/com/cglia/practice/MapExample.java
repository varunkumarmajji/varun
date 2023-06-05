package com.cglia.practice;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String> collection = Arrays.asList("Java", "8", "Stream", "API");
		collection.stream().filter(t -> t.contains("J"));

	}

}
