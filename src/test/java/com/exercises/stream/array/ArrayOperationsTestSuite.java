package com.exercises.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

	@Test
	public void testGetAverage() {
		//Given
		int[] numbers = {43,54,2,1,87,20};
		//When
		double average = ArrayOperations.getAverage(numbers);
		//Then
		Assertions.assertEquals(34.5, average, 0.01);
	}
	
	@Test
	public void testGetAverageWithEmptyArray() {
		//Given
		int[] numbers = {};
		//When
		double average = ArrayOperations.getAverage(numbers);
		//Then
		Assertions.assertEquals(0.0, average,0);
	}
}
