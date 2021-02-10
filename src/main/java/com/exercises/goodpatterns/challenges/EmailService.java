package com.exercises.goodpatterns.challenges;

public class EmailService implements InformationService {

	@Override
	public void inform(User user) {
		System.out.println("We are preparing your order: " + user);
	}

}
