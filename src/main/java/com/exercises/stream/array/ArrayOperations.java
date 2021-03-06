package com.exercises.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
	
	static double getAverage(int[] numbers) {
		IntStream.range(0, numbers.length)
		.map(i -> numbers[i])
		.forEach(System.out::println);
		
		OptionalDouble average = IntStream.range(0, numbers.length)
				.map(i -> numbers[i])
				.average();
		
		return average.orElse(0.0);
	}

}
