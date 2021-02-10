package com.exercises.goodpatterns.challenges;

public class ProductOrderDto {
	private User user;
	private boolean isOrdered;	
	
	public ProductOrderDto(User user, boolean isOrdered) {
		this.user = user;
		this.isOrdered = isOrdered;
	}

	public User getUser() {
		return user;
	}

	public boolean isOrdered() {
		return isOrdered;
	}

	@Override
	public String toString() {
		return "ProductOrderDto [user=" + user + ", isOrdered=" + isOrdered + "]";
	}	
}
