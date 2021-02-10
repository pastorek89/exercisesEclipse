package com.exercises.goodpatterns.food2door;

import java.time.LocalDate;

public class DatabaseRepository implements SupplyRepository {
	@Override
	public void createSupply(Supplier supplier, LocalDate date) {
				System.out.println(supplier + " supply is on the road from: " + date);
	}

}
