package com.exercises.goodpatterns.challenges;

public class RepoToDatabase implements OrderRepository {

	@Override
	public void createOrder() {
		System.out.println("Sending data to database...");		
	}

}
