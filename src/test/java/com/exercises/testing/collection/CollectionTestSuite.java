package com.exercises.testing.collection;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionTestSuite {
	@Before
	public void before() {
		System.out.println("Test Case: begin");
	}
	@After
	public void after() {
		System.out.println("Test Case: after");
	}
	@Test
	public void testOddNumbersExterminatorEmptyList() {
		//Given
		OddNumbersExterminator tester = new OddNumbersExterminator();
		List<Integer> emptyList = new ArrayList<>();
		//When
		List<Integer> result = tester.exterminate(emptyList);
		System.out.println("Test Case: Empty List");
		//Then
		Assert.assertEquals(result, emptyList);
	}
	@Test
	public void testOddNumbersExterminatorNormalList() {
		//Given
		OddNumbersExterminator tester = new OddNumbersExterminator();
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(543);
		list.add(12);
		list.add(9);
		list.add(0);
		List<Integer> expectedEvenList = new ArrayList<>();
		expectedEvenList.add(12);
		expectedEvenList.add(0);
		//When
		List<Integer> result = tester.exterminate(list);
		System.out.println("Test Case: NormalList");
		//Then
		Assert.assertEquals(expectedEvenList, result);
	}
}
