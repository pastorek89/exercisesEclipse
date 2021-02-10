package com.exercises.goodpatterns.challenges;

public class OrderRequestRetriever {

	public OrderRequest retrieve() {
		User user = new User("Pastorek", "987654321", "Patryk", "Borek");
		Order order = new Order();
		order.addProduct(new Product("Ball", 2));
			return new OrderRequest(user, order);
	}
}
