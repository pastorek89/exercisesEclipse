package com.exercises.goodpatterns.food2door;

public class ExtraFoodShop implements Supplier {
	private double points = 5;
	@Override
	public void process() {
		points += 5;
		System.out.println("Supply sent... 5 Extra points. You have already = " + points);
	}
	@Override
	public String toString() {
		return "ExtraFoodShop";
	}
	
}
