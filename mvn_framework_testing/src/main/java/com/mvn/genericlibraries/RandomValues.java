package com.mvn.genericlibraries;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class RandomValues {
	Random random = new Random();

	public String randomResult() {

		List<String> generatedstring = new LinkedList<>();
		generatedstring.add("true");
		generatedstring.add("false");
		String randomElement = generatedstring.get(random.nextInt(generatedstring.size()));
		return randomElement;
	}

	
	public int randomtime() {
		List<String> numericvalue = new LinkedList<>();
		int max = 1000;
		int min = 500;
		int time = min + random.nextInt(max);
		return time;

	}
}
