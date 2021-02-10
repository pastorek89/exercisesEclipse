package com.exercises.goodpatterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Product> orderList = new ArrayList<>();
	
	public List<Product> getOrderList() {
		return orderList;
	}	
	
	public void addProduct(Product product) {
		orderList.add(product);
	}
	
	public void removeProduct(Product product) {
		if(orderList.contains(product)) {
			orderList.remove(product);
		} else {
			System.out.println("Product is not on the order list");
		}
	}

	@Override
	public String toString() {
		return "Order [orderList=" + orderList + "]";
	}
	
	
}
