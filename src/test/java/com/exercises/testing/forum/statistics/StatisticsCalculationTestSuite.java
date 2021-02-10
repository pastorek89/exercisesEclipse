package com.exercises.testing.forum.statistics;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StatisticsCalculationTestSuite {
	private static int testCounter = 1;
	
	@BeforeEach
	public void everyTest() {
		System.out.println("Test number: " + testCounter + " started");
		testCounter++;
	}		
	
	@Test
	public void testCalculateAdvStatisticsWhenPostsNumberZero() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);	
		StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
		List<String> usersNames = new ArrayList<>();
		usersNames.add("Karolina");
		usersNames.add("Patryk");
		when(statisticsMock.usersNames()).thenReturn(usersNames);
		when(statisticsMock.commentsCount()).thenReturn(0);
		when(statisticsMock.postsCount()).thenReturn(0);
		//When
		statisticsCalculation.calculateAdvStatistics(statisticsMock);
		statisticsCalculation.showStatistics();
		//Then		
		assertEquals(2,statisticsCalculation.getNumberOfUsers());
		assertEquals(0,statisticsCalculation.getNumberOfPosts());		
		assertEquals(0,statisticsCalculation.getNumberOfComments());		
		assertEquals(0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
		assertEquals(0,statisticsCalculation.getAverageCommentsPerUser(),0.01);
		assertEquals(0,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}	
	
	@Test
	public void testCalculateAdvStatisticsWhenPostsNumberIsThousand() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();
				usersNames.add("Karolina");
				usersNames.add("Patryk");
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(500);
				when(statisticsMock.postsCount()).thenReturn(1000);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(2,statisticsCalculation.getNumberOfUsers());
				assertEquals(1000,statisticsCalculation.getNumberOfPosts());		
				assertEquals(500,statisticsCalculation.getNumberOfComments());		
				assertEquals(500.0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(250.0,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(0.5,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}	
	
	@Test
	public void testCalculateAdvStatisticsWhenCommentsEqualZero() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();
				usersNames.add("Karolina");
				usersNames.add("Patryk");
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(0);
				when(statisticsMock.postsCount()).thenReturn(400);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(2,statisticsCalculation.getNumberOfUsers());
				assertEquals(400,statisticsCalculation.getNumberOfPosts());		
				assertEquals(0,statisticsCalculation.getNumberOfComments());		
				assertEquals(200.0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(0,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(0,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}	
	
	@Test
	public void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();
				usersNames.add("Karolina");
				usersNames.add("Patryk");
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(1000);
				when(statisticsMock.postsCount()).thenReturn(500);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(2,statisticsCalculation.getNumberOfUsers());
				assertEquals(500,statisticsCalculation.getNumberOfPosts());		
				assertEquals(1000,statisticsCalculation.getNumberOfComments());		
				assertEquals(250.0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(500,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(2,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}	
	
	@Test
	public void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();
				usersNames.add("Karolina");
				usersNames.add("Patryk");
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(500);
				when(statisticsMock.postsCount()).thenReturn(1000);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(2,statisticsCalculation.getNumberOfUsers());
				assertEquals(1000,statisticsCalculation.getNumberOfPosts());		
				assertEquals(500,statisticsCalculation.getNumberOfComments());		
				assertEquals(500.0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(250,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(0.5,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}	
	
	@Test
	public void testCalculateAdvStatisticsWhenNumberOfUsersZero() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();				
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(0);
				when(statisticsMock.postsCount()).thenReturn(0);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(0,statisticsCalculation.getNumberOfUsers());
				assertEquals(0,statisticsCalculation.getNumberOfPosts());		
				assertEquals(0,statisticsCalculation.getNumberOfComments());		
				assertEquals(0,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(0,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(0,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}
	
	@Test
	public void testCalculateAdvStatisticsWhenNumberOfUsersHundred() {
		//Given
				Statistics statisticsMock = mock(Statistics.class);	
				StatisticsCalculation statisticsCalculation = new StatisticsCalculation();
				List<String> usersNames = new ArrayList<>();
				for(int i = 0; i < 100; i++) {
					usersNames.add("user" + i);
				}
				when(statisticsMock.usersNames()).thenReturn(usersNames);
				when(statisticsMock.commentsCount()).thenReturn(1000);
				when(statisticsMock.postsCount()).thenReturn(500);
				//When
				statisticsCalculation.calculateAdvStatistics(statisticsMock);
				statisticsCalculation.showStatistics();
				//Then
				assertEquals(100,statisticsCalculation.getNumberOfUsers());
				assertEquals(500,statisticsCalculation.getNumberOfPosts());		
				assertEquals(1000,statisticsCalculation.getNumberOfComments());		
				assertEquals(5,statisticsCalculation.getAveragePostsPerUser(), 0.01);		
				assertEquals(10,statisticsCalculation.getAverageCommentsPerUser(),0.01);
				assertEquals(2,statisticsCalculation.getAverageCommentsPerPost(),0.01);
	}
}
