package com.exercises.testing.forum.statistics;

public class StatisticsCalculation {
	private int numberOfUsers, numberOfPosts, numberOfComments;
	private double averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost;

	public void calculateAdvStatistics(Statistics statistics) {
		numberOfUsers = statistics.usersNames().size();
		numberOfPosts = statistics.postsCount();
		numberOfComments = statistics.commentsCount();
		
		if(numberOfUsers == 0) {
			averagePostsPerUser = 0.0;
		} else {
		averagePostsPerUser = (double)numberOfPosts/numberOfUsers;
		}
		
		if(numberOfUsers == 0) {
			averageCommentsPerUser = 0.0;
		} else {
			averageCommentsPerUser = (double)numberOfComments/numberOfUsers;
		}
		
		if(numberOfPosts == 0) {
			averageCommentsPerPost = 0.0;
		} else {
			averageCommentsPerPost = (double)numberOfComments/numberOfPosts;
		}
		
	}
	
	public void showStatistics() {
		System.out.println("Number of Users: " + numberOfUsers + "\nNumber of Posts: " + numberOfPosts + 
				"\nNumber of Comments: " + numberOfComments + "\nAveragePostsPerUser: " + averagePostsPerUser + 
				"\nAverageCommentsPerUser: " + averageCommentsPerUser + "\nAverageCommentsPerPost: " + averageCommentsPerPost + "\n");
	}

	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public int getNumberOfPosts() {
		return numberOfPosts;
	}

	public int getNumberOfComments() {
		return numberOfComments;
	}

	public double getAveragePostsPerUser() {
		return averagePostsPerUser;
	}

	public double getAverageCommentsPerUser() {
		return averageCommentsPerUser;
	}

	public double getAverageCommentsPerPost() {
		return averageCommentsPerPost;
	}	
}
