package com.exercises.goodpatterns.challenges;

public class GoldClientBorekOrderService implements OrderService {

	@Override
	public boolean order(User user, Order order) {
		return (user.getUserSurname().equals("Borek")) ? true : false;	
	}
}
