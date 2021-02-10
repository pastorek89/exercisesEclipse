package com.exercises.testing.forum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exercises.testing.user.SimpleUser;

public class ForumTestSuite {	
	@Before
	public void before() {
		System.out.println("Test Case: begin");
	}	
	@After
	public void after() {
		System.out.println("Test Case: end");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Test Suite: begin");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Test Suite: end");
	}
	@Test
	public void testCaseUsername() {		
		//Given
		SimpleUser user = new SimpleUser("TheForumUser", "Patryk Pastor");		
		//When
		String result = user.getUsername();
		System.out.println("Test case: " + result);
		//Then
		Assert.assertEquals("TheForumUser", result );
	}
	@Test
	public void testCaseRealName() {
		//Given
		SimpleUser user = new SimpleUser("TheForumUser", "Patryk Pastor");		
		//When
		String result = user.getRealName();
		System.out.println("Test case: " + result);
		//Then
		Assert.assertEquals("Patryk Pastor", result);
	}
	
	
}
